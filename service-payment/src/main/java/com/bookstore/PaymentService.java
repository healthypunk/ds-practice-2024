package com.bookstore;


import com.dspractice.bookstore.commonproto.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import lombok.extern.slf4j.Slf4j;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class PaymentService extends PaymentServiceGrpc.PaymentServiceImplBase {

    private final PaymentCommitService paymentCommitService;
    @Override
    public void init(PaymentServiceInitRequest request, StreamObserver<PaymentServiceResponse> responseObserver) {
        Payment payment = new Payment();
        payment.setPaymentId(UUID.randomUUID().toString());
        payment.setPaymentStatus(PaymentStatus.PENDING);
        payment.setOrderId(request.getOrderId());
        paymentCommitService.preCommit(payment.getPaymentId());
    }

    @Override
    public void commit(PaymentServiceCommitRequest request, StreamObserver<PaymentServiceResponse> responseObserver) {
        super.commit(request, responseObserver);
    }

    @Override
    public void rollback(PaymentServiceRollbackRequest request, StreamObserver<PaymentServiceResponse> responseObserver) {
        super.rollback(request, responseObserver);
    }
}
