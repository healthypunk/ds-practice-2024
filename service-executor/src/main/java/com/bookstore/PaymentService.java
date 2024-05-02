package com.bookstore;

import com.dspractice.bookstore.commonproto.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PaymentService {
    @GrpcClient("grpc-payment-service")
    private PaymentServiceGrpc.PaymentServiceBlockingStub paymentServiceBlockingStub;

    public String init(String orderId){
        PaymentServiceInitRequest request = PaymentServiceInitRequest.newBuilder().setOrderId(orderId).build();
        PaymentServiceResponse init = paymentServiceBlockingStub.init(request);
        return init.getPaymentId();
    }

    public void commit(String paymentId){
        PaymentServiceCommitRequest request = PaymentServiceCommitRequest.newBuilder().setPaymentId(paymentId).build();
        paymentServiceBlockingStub.commit(request);
    }

    public void rollback(String paymentId){
        PaymentServiceRollbackRequest request = PaymentServiceRollbackRequest.newBuilder().setPaymentId(paymentId).build();
        paymentServiceBlockingStub.rollback(request);
    }
}
