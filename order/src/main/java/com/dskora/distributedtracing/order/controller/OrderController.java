package com.dskora.distributedtracing.order.controller;

import com.dskora.distributedtracing.order.client.WarehouseServiceClient;
import com.dskora.distributedtracing.order.dto.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
class OrderController {
    @Autowired
    WarehouseServiceClient warehouseServiceClient;

    @PostMapping()
    public UUID placeOrder(@RequestBody CreateOrderRequest request) {
        UUID orderId = UUID.randomUUID();
        // place order
        // ...
        // dispatch order
        warehouseServiceClient.dispatchOrder(orderId);

        return orderId;
    }
}
