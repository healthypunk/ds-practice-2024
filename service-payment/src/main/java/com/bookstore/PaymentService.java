package com.bookstore;


import com.dspractice.bookstore.commonproto.*;
import io.grpc.Status;
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
        log.info("[Order ID: {}] has been received", request.getOrderId());
        Payment payment = new Payment();
        payment.setPaymentId(UUID.randomUUID().toString());
        payment.setPaymentStatus(PaymentStatus.PENDING);
        payment.setOrderId(request.getOrderId());
        paymentCommitService.update(payment.getPaymentId(),payment);
        PaymentServiceResponse response = PaymentServiceResponse.newBuilder().setPaymentId(payment.getPaymentId()).setStatus(payment.getPaymentStatus().toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Payment ID: {}] is pre-commited", payment.getPaymentId());
    }

    @Override
    public void commit(PaymentServiceCommitRequest request, StreamObserver<PaymentServiceResponse> responseObserver) {
        log.info("[Payment ID: {}] has been received", request.getPaymentId());
        Payment payment = paymentCommitService.getItem(request.getPaymentId());
        if (payment == null){
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        if (payment.getPaymentStatus() != PaymentStatus.PENDING){
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        payment.setPaymentStatus(PaymentStatus.COMMIT);
        paymentCommitService.update(payment.getPaymentId(),payment);
        PaymentServiceResponse response = PaymentServiceResponse.newBuilder().setPaymentId(payment.getPaymentId()).setStatus(payment.getPaymentStatus().toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Payment ID: {}] was commited", payment.getPaymentId());
    }

    @Override
    public void rollback(PaymentServiceRollbackRequest request, StreamObserver<PaymentServiceResponse> responseObserver) {
        log.info("[Payment ID: {}] is received", request.getPaymentId());
        Payment payment = paymentCommitService.getItem(request.getPaymentId());
        if (payment == null){
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        if (payment.getPaymentStatus() != PaymentStatus.PENDING){
            responseObserver.onError(Status.INVALID_ARGUMENT.asException());
            return;
        }
        payment.setPaymentStatus(PaymentStatus.ROLLBACK);
        paymentCommitService.update(payment.getPaymentId(),payment);
        PaymentServiceResponse response = PaymentServiceResponse.newBuilder().setPaymentId(payment.getPaymentId()).setStatus(payment.getPaymentStatus().toString()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Payment ID: {}] was rolled back", payment.getPaymentId());
    }
}
