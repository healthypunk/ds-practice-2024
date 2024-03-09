package com.bookstore;

import com.dspractice.bookstore.commonproto.TransactionVerficationServiceGrpc;
import com.dspractice.bookstore.commonproto.TransactionVerification;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@Slf4j
@GrpcService
public class TransactionVerificationService extends TransactionVerficationServiceGrpc.TransactionVerficationServiceImplBase{

    @Override
    public void verify(TransactionVerification.TransactionRequest request, StreamObserver<TransactionVerification.TransactionResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received request for verification");
        TransactionVerification.TransactionResponse response = TransactionVerification.TransactionResponse.newBuilder()
                .setId(UUID.randomUUID().toString()).build();
        responseObserver.onNext(response);
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Verification result is: ", false);
        responseObserver.onCompleted();
    }
}
