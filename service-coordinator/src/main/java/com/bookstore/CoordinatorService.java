package com.bookstore;

import com.dspractice.bookstore.commonproto.OrderDequeueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import com.dspractice.bookstore.commonproto.OrderQueueServiceGrpc;
import io.grpc.stub.StreamObserver;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CoordinatorService {

    @GrpcClient("grpc-order-queue")
    private OrderQueueServiceGrpc.OrderQueueServiceStub queueServiceStub;

    @PostConstruct
    public void startListening() {
        OrderDequeueRequest request = OrderDequeueRequest.newBuilder().build();

        queueServiceStub.listenDequeuedOrders(request, new StreamObserver<>() {
            @Override
            public void onNext(OrderEnqueueRequest order) {
                log.info("[Order ID: {}] {}", order.getId(), "Order waiting for coordination");
            }

            @Override
            public void onError(Throwable t) {
                log.error("Error listening to dequeued orders: {}", t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("Completed listening to dequeued orders");
            }
        });
    }
}

