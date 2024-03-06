package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.dspractice.bookstore.commonproto.TransactionVerficationServiceGrpc;
import com.dspractice.bookstore.commonproto.TransactionVerification;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class TransactionVerificationService {
    @GrpcClient("grpc-transaction-verification")
    private TransactionVerficationServiceGrpc.TransactionVerficationServiceBlockingStub transactionVerficationServiceBlockingStub;

    public String suggest(OrderRequest orderRequest) {
        TransactionVerification.TransactionRequest request = TransactionVerification.TransactionRequest.newBuilder().build();
        return transactionVerficationServiceBlockingStub.verify(request).getId();
    }
}
