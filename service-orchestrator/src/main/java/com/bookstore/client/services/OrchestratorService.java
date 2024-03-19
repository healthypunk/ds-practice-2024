package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrchestratorService {
    private final FraudDetectionService fraudDetectionService;
    private final SuggestionService suggestionService;
    private final TransactionVerificationService transactionVerificationService;

    public OrderResponse process(OrderRequest orderRequest) {
        try {
            // TODO add updated verifications
//            fraudDetectionService.detectCreditCardFraud(orderRequest);
        } catch (Exception e) {

        }
        return null;
//        boolean isFraud = fraudDetectionService.d(orderRequest);
//        String transactionId = transactionVerificationService.suggest(orderRequest);
//        String suggestedBook = suggestionService.suggest(List.of("books"));
//        return new OrderResponse()
//                .setOrderId(transactionId)
//                .setOrderStatus("DONE")
//                .setSuggestedBooks(List.of(new OrderResponse.SuggestedBook().setTitle(suggestedBook)));
    }
}

