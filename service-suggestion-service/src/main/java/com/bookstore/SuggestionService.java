package com.bookstore;

import com.bookstore.validators.SuggestionBookValidator;
import com.dspractice.bookstore.commonproto.SuggestionRequest;
import com.dspractice.bookstore.commonproto.SuggestionResponse;
import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class SuggestionService extends SuggestionServiceGrpc.SuggestionServiceImplBase {
    @Override
    public void suggestBook(SuggestionRequest request, StreamObserver<SuggestionResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received suggestion request");
        if (!SuggestionBookValidator.validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        SuggestionResponse response = SuggestionResponse.newBuilder().setBookName("DS practice book").setAuthor("UT").setBookId("12345").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}", request.getOrderId(), "Suggestion result sent");
    }
}
