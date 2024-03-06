package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.dspractice.bookstore.commonproto.FraudDetectionServiceGrpc;
import com.dspractice.bookstore.commonproto.FraudService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {
    @GrpcClient("grpc-client")
    private FraudDetectionServiceGrpc.FraudDetectionServiceBlockingStub fraudDetectionServiceBlockingStub;

    public boolean detect(OrderRequest orderRequest) {
        FraudService.FraudDetectionRequest request = FraudService.FraudDetectionRequest.newBuilder().build();
        return fraudDetectionServiceBlockingStub.detect(request).getFraud();
    }
}
