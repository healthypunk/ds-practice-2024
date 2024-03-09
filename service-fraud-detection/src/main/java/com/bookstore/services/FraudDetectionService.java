package com.bookstore.services;

import com.dspractice.bookstore.commonproto.FraudDetectionServiceGrpc;
import com.dspractice.bookstore.commonproto.FraudService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class FraudDetectionService extends FraudDetectionServiceGrpc.FraudDetectionServiceImplBase{
    @Override
    public void detect(FraudService.FraudDetectionRequest request, StreamObserver<FraudService.FraudDetectionResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getOrderId(), "Received request for fraud detection");
        FraudService.FraudDetectionResponse response = FraudService.FraudDetectionResponse.newBuilder()
                .setFraud(false).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}, {}", request.getOrderId(), "Fraud detection result: ", false);

    }
}
