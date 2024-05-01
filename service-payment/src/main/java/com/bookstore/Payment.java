package com.bookstore;

import lombok.Data;

@Data
public class Payment {
    private PaymentStatus paymentStatus;
    private String orderId;

    private String paymentId;
}
