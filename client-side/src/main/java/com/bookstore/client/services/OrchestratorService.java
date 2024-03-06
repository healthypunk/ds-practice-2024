package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrchestratorService {

    public OrderResponse process(OrderRequest orderRequest) {
        return new OrderResponse();
    }
}
