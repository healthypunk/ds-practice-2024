package com.bookstore.services;

import com.bookstore.validators.CreditCardValidator;
import com.bookstore.validators.UserDataValidator;
import com.dspractice.bookstore.commonproto.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class FraudDetectionService extends FraudDetectionServiceGrpc.FraudDetectionServiceImplBase {
    @Override
    public void detectCardFraud(FraudCreditCardDetectionRequest request, StreamObserver<FraudCreditCardDetectionResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received request for fraud detection");
        if (!CreditCardValidator.validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        FraudCreditCardDetectionResponse response = FraudCreditCardDetectionResponse.newBuilder().setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Card verification result: ", false);
    }

    @Override
    public void detectUserDataFraud(FraudUserDataRequest request, StreamObserver<FraudUserDataResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received request for fraud detection");
        if (!UserDataValidator.validateRequest(request)) {
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        FraudUserDataResponse response = FraudUserDataResponse.newBuilder().setOrderId(request.getOrderId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Card verification result: ", false);
    }
}
