package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import com.dspractice.bookstore.commonproto.SuggestionRequest;
import com.dspractice.bookstore.commonproto.SuggestionResponse;
import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionService {

    @GrpcClient("grpc-suggestion-service")
    private SuggestionServiceGrpc.SuggestionServiceBlockingStub suggestionServiceBlockingStub;

    public OrderResponse.SuggestedBook suggestBook(OrderRequest orderRequest) {
        List<String> books = orderRequest.getItems().stream().map(OrderRequest.Item::getName).toList();
        SuggestionRequest request = SuggestionRequest.newBuilder().setOrderId(orderRequest.getId()).addAllBooksNames(books).build();
        SuggestionResponse response = suggestionServiceBlockingStub.suggestBook(request);

        return new OrderResponse.SuggestedBook()
                .setBookId(response.getBookId())
                .setTitle(response.getBookName())
                .setAuthor(response.getAuthor());
    }
}
