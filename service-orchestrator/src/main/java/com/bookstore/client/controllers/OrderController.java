package com.bookstore.client.controllers;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import com.bookstore.client.services.OrchestratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("checkout")
@RequiredArgsConstructor
public class OrderController {
    private final OrchestratorService orchestratorService;

    @PostMapping()
    public OrderResponse processOrder(@RequestBody OrderRequest orderRequest) {
        return orchestratorService.process(orderRequest);
    }
}
