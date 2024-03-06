package com.bookstore;

import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SuggestionService extends SuggestionServiceGrpc.SuggestionServiceImplBase {

    @Override
    public void suggest(SuggestionServiceOuterClass.SuggestionRequest request, StreamObserver<SuggestionServiceOuterClass.SuggestionResponse> responseObserver) {
        SuggestionServiceOuterClass.SuggestionResponse response = SuggestionServiceOuterClass.SuggestionResponse.newBuilder()
                .setBookName("DS practice book").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
