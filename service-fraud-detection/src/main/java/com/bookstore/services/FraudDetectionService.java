package com.bookstore.services;

import com.dspractice.bookstore.commonproto.FraudDetectionServiceGrpc;
import com.dspractice.bookstore.commonproto.FraudService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class FraudDetectionService extends FraudDetectionServiceGrpc.FraudDetectionServiceImplBase{
    @Override
    public void detect(FraudService.FraudDetectionRequest request, StreamObserver<FraudService.FraudDetectionResponse> responseObserver) {
        FraudService.FraudDetectionResponse response = FraudService.FraudDetectionResponse.newBuilder()
                .setFraud(false).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
