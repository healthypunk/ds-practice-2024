package com.bookstore.client.services;

import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionService {

    @GrpcClient("grpc-client")
    private SuggestionServiceGrpc.SuggestionServiceBlockingStub suggestionServiceBlockingStub;

    public String suggest(List<String> books) {
        SuggestionServiceOuterClass.SuggestionRequest request = SuggestionServiceOuterClass.SuggestionRequest.newBuilder()
                .setBooksNames(0, "Test book").build();
        return suggestionServiceBlockingStub.suggest(request).getBookName();
    }
}
