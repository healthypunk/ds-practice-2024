package com.bookstore;


import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PaymentCommitService {
    private final Map<String,PaymentStatus> storage = new ConcurrentHashMap<>();

    public void preCommit(String paymentId) {
        storage.put(paymentId, PaymentStatus.PENDING);
    }

    public void delete(String paymentId) {
        storage.remove(paymentId);
    }

    public PaymentStatus getItem(String paymentId) {
        return storage.get(paymentId);
    }
}
