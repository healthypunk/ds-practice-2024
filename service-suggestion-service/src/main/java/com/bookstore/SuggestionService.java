package com.bookstore;

import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class SuggestionService extends SuggestionServiceGrpc.SuggestionServiceImplBase {
    ;

    @Override
    public void suggest(SuggestionServiceOuterClass.SuggestionRequest request, StreamObserver<SuggestionServiceOuterClass.SuggestionResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received suggestion request");
        SuggestionServiceOuterClass.SuggestionResponse response = SuggestionServiceOuterClass.SuggestionResponse.newBuilder()
                .setBookName("DS practice book").setAuthor("UT").setBookId("12345").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}", request.getOrderId(), "Suggestion result sent");
    }
}
