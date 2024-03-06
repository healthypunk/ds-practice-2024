package com.bookstore;

import com.dspractice.bookstore.commonproto.TransactionVerficationServiceGrpc;
import com.dspractice.bookstore.commonproto.TransactionVerification;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@GrpcService
public class TransactionVerificationService extends TransactionVerficationServiceGrpc.TransactionVerficationServiceImplBase{

    @Override
    public void verify(TransactionVerification.TransactionRequest request, StreamObserver<TransactionVerification.TransactionResponse> responseObserver) {
        TransactionVerification.TransactionResponse response = TransactionVerification.TransactionResponse.newBuilder()
                .setId(UUID.randomUUID().toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
