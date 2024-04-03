package com.bookstore;

import com.dspractice.bookstore.commonproto.OrderDequeueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueResponse;
import com.dspractice.bookstore.commonproto.OrderQueueServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class OrderQueueService extends OrderQueueServiceGrpc.OrderQueueServiceImplBase {

    private final PriorityQueueService priorityQueueService;

    @Override
    public void enqueueOrder(OrderEnqueueRequest request, StreamObserver<OrderEnqueueResponse> responseObserver) {
        log.info("[Order ID: {}] {}", request.getId(), "Waiting enqueue");
        priorityQueueService.enqueueOrder(request);
        OrderEnqueueResponse response = OrderEnqueueResponse.newBuilder()
                .setOrderId(request.getId())
                .setStatus("ENQUEUED")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        log.info("[Order ID: {}] {}", request.getId(), "Order is enqueued");
    }

    @Override
    public void listenDequeuedOrders(OrderDequeueRequest request, StreamObserver<OrderEnqueueRequest> responseObserver) {
        listenForOrdersRecursively(responseObserver);
    }

    private void listenForOrdersRecursively(StreamObserver<OrderEnqueueRequest> responseObserver) {
        priorityQueueService.listenForNewOrders().thenAcceptAsync(order -> {
            if (order != null) {
                log.info("[Order ID: {}] Order is being processed", order.getId());
                responseObserver.onNext(order);
                listenForOrdersRecursively(responseObserver); // Correctly placed recursive call
            } else {
                responseObserver.onCompleted();
            }
        }).exceptionally(e -> {
            log.error("Error processing queue", e);
            responseObserver.onError(Status.INTERNAL.withCause(e).asRuntimeException());
            return null;
        });
    }
}
