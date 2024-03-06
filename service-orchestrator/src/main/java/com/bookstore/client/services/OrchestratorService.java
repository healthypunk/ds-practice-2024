package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrchestratorService {
    private FraudDetectionService fraudDetectionService;
    private SuggestionService suggestionService;
    private TransactionVerificationService transactionVerificationService;

    public OrderResponse process(OrderRequest orderRequest) {
        boolean isFraud = fraudDetectionService.detect(orderRequest);
        String transactionId = transactionVerificationService.suggest(orderRequest);
        String suggestedBook = suggestionService.suggest(orderRequest.getItems().stream().map(OrderRequest.Item::getName).toList());
        return new OrderResponse().setOrderId(transactionId).setSuggestedBooks(List.of(new OrderResponse.SuggestedBook().setTitle(suggestedBook)));
    }
}
