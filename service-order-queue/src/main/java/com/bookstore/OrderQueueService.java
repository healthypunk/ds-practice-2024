package com.bookstore;

import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueResponse;
import com.dspractice.bookstore.commonproto.OrderQueueServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class OrderQueueService extends OrderQueueServiceGrpc.OrderQueueServiceImplBase {
    @Override
    public void enqueueOrder(OrderEnqueueRequest request, StreamObserver<OrderEnqueueResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getId(), "Waiting enqueue");
        OrderEnqueueResponse response = OrderEnqueueResponse.newBuilder()
                .setOrderId(request.getId())
                .setStatus("Enqueued")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}", request.getId(), "Order is enqueued");
    }
}