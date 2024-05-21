package com.bookstore;

import com.dspractice.bookstore.commonproto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentService {
    @GrpcClient("grpc-payment-service")
    private PaymentServiceGrpc.PaymentServiceBlockingStub paymentServiceBlockingStub;

    public String init(String orderId){
        log.info("[Order ID: {}] {}", orderId, "client initialized payment, order has been received");
        PaymentServiceInitRequest request = PaymentServiceInitRequest.newBuilder().setOrderId(orderId).build();
        PaymentServiceResponse init = paymentServiceBlockingStub.init(request);
        log.info("[Payment ID: {}] {}",init.getPaymentId(),"payment pre-commited");
        return init.getPaymentId();
    }

    public void commit(String paymentId){
        log.info("[Payment ID: {}] {}", paymentId,"has been received");
        PaymentServiceCommitRequest request = PaymentServiceCommitRequest.newBuilder().setPaymentId(paymentId).build();
        paymentServiceBlockingStub.commit(request);
        log.info("[Payment ID: {}] {}", paymentId,"has been commited");
    }

    public void rollback(String paymentId){
        log.info("[Payment ID: {}] {}", paymentId,"has been received");
        PaymentServiceRollbackRequest request = PaymentServiceRollbackRequest.newBuilder().setPaymentId(paymentId).build();
        paymentServiceBlockingStub.rollback(request);
        log.info("[Payment ID: {}] {}", paymentId,"has been rolled back");
    }
}
