package com.bookstore.client.services;

import com.dspractice.bookstore.commonproto.SuggestionRequest;
import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionService {

    @GrpcClient("grpc-suggestion-service")
    private SuggestionServiceGrpc.SuggestionServiceBlockingStub suggestionServiceBlockingStub;

    public String suggest(List<String> books) {
        SuggestionRequest request = SuggestionRequest.newBuilder().addAllBooksNames(books).build();
        return suggestionServiceBlockingStub.suggestBook(request).getBookName();
    }
}
