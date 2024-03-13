package com.bookstore;

import com.dspractice.bookstore.commonproto.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@Slf4j
@GrpcService
public class TransactionVerificationService extends TransactionVerficationServiceGrpc.TransactionVerficationServiceImplBase{

    @Override
    public void verifyBooks(TransactionBooksRequest request, StreamObserver<TransactionBooksResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Request for verification");
        TransactionBooksResponse response = TransactionBooksResponse.newBuilder()
                .setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Books verification result: ", false);
    }

    @Override
    public void verifyCreditCard(TransactionCreditCardRequest request, StreamObserver<TransactionCreditCardResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Request for verification");
        TransactionCreditCardResponse response = TransactionCreditCardResponse.newBuilder()
                .setOrderId(request.getOrderId()).build();
        // TODO: Add mandatory fields
        // TODO: Add try catch handler
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Card verification result: ", false);
    }
}
