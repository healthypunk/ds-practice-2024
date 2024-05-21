package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrchestratorService {
    private final FraudDetectionService fraudDetectionService;
    private final SuggestionService suggestionService;
    private final TransactionVerificationService transactionVerificationService;
    private final OrderQueueService orderQueueService;

    public OrderResponse process(OrderRequest orderRequest) {
        try {
            orderRequest.setId(UUID.randomUUID().toString());
            log.info("[Order ID: {}]", orderRequest.getId());
            transactionVerificationService.verifyBooks(orderRequest);
            transactionVerificationService.verifyCreditCard(orderRequest);
            fraudDetectionService.detectUserDataFraud(orderRequest);
            transactionVerificationService.verifyCreditCard(orderRequest);
            fraudDetectionService.detectCreditCardFraud(orderRequest);
            OrderResponse.SuggestedBook suggestedBook = suggestionService.suggestBook(orderRequest);
            String status = orderQueueService.enqueueOrder(orderRequest);
            return new OrderResponse().setOrderId(orderRequest.getId()).setStatus(status).setSuggestedBooks(List.of(suggestedBook));
        } catch (Exception e) {
            log.error(String.valueOf(e));
            return new OrderResponse().setOrderId(orderRequest.getId()).setStatus("FAILURE");
        }
    }
}

