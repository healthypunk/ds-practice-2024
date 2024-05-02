package com.bookstore;


import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class PaymentCommitService {
    private final Map<String,Payment> storage = new ConcurrentHashMap<>();

    public void update(String paymentId, Payment payment) {
        storage.put(paymentId, payment);
    }

    public void delete(String paymentId) {
        storage.remove(paymentId);
    }

    public Payment getItem(String paymentId) {
        return storage.get(paymentId);
    }
}
