package com.bookstore;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import org.springframework.stereotype.Service;

@Service
public class PriorityQueueService {

    private final PriorityBlockingQueue<OrderEnqueueRequest> orderQueue;

    public PriorityQueueService() {
        // Comparator to sort the orders based on their ID in alphabetical order
        Comparator<OrderEnqueueRequest> orderComparator = Comparator.comparing(OrderEnqueueRequest::getId)
                .thenComparing(OrderEnqueueRequest::getItemsCount)
                .thenComparing(OrderEnqueueRequest::getGiftMessage)
                .thenComparing(OrderEnqueueRequest::getDiscountCode);
        this.orderQueue = new PriorityBlockingQueue<>(100, orderComparator);
    }

    public void enqueueOrder(OrderEnqueueRequest order) {
        // Add the order to the priority queue
        orderQueue.offer(order);
    }

//    public void processQueue() {
//        // Process the queue here. This could be periodically or based on some trigger
//        while (!orderQueue.isEmpty()) {
//            OrderEnqueueRequest processedOrder = orderQueue.poll(); // Retrieves and removes the head of this queue
//            // Implement order processing logic here
//            // For example, logging the processed order:
//            System.out.println("[Order ID: " + processedOrder.getId() + "] Order is being processed");
//        }
//    }

    // Optional: method to check the queue size or state for testing or monitoring
    public int getQueueSize() {
        return orderQueue.size();
    }
}
