package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import com.dspractice.bookstore.commonproto.OrderItem;
import com.dspractice.bookstore.commonproto.OrderQueueServiceGrpc;
import com.dspractice.bookstore.commonproto.OrderUser;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class OrderQueueService {
    @GrpcClient("grpc-transaction-verification")
    private OrderQueueServiceGrpc.OrderQueueServiceBlockingStub orderQueueServiceBlockingStub;

    public void enqueueOrder(OrderRequest orderRequest) {
        OrderEnqueueRequest enqueueRequest = OrderEnqueueRequest.newBuilder()
                .setId(orderRequest.getId())
                .setUser(OrderUser.newBuilder()
                        .setName(orderRequest.getUser().getName())
                        .setContact(orderRequest.getUser().getContact())
                        .build())
                .setUserComment(orderRequest.getUserComment())
                .addAllItems(orderRequest.getItems().stream()
                        .map(item -> OrderItem.newBuilder()
                                .setName(item.getName())
                                .setQuantity(item.getQuantity())
                                .build())
                        .toList())
                .setDiscountCode(orderRequest.getDiscountCode())
                .setShippingMethod(orderRequest.getShippingMethod())
                .setGiftMessage(orderRequest.getGiftMessage())
                .setGiftWrapping(orderRequest.getGiftWrapping())
                .addAllNotificationPreferences(orderRequest.getNotificationPreferences())
                .build();

        orderQueueServiceBlockingStub.enqueueOrder(enqueueRequest);
    }
}
