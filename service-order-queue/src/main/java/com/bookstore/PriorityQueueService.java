package com.bookstore;

import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class PriorityQueueService {

    private final LinkedBlockingQueue<OrderEnqueueRequest> queue = new LinkedBlockingQueue<>();

    public CompletableFuture<OrderEnqueueRequest> listenForNewOrders() {
        // This method returns a CompletableFuture that completes when a new order is available.
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Wait for a new order to become available. This blocks the thread until an order is present.
                return queue.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for a new order", e);
            }
        });
    }

    public void enqueueOrder(OrderEnqueueRequest request) {
        // Add a new order to the queue. This operation is thread-safe.
        queue.offer(request);
    }

    public Long getQueueSize() {
        return (long) queue.size();
    }

}
