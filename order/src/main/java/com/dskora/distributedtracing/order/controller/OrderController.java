package com.dskora.distributedtracing.order.controller;

import com.dskora.distributedtracing.order.dto.CreateOrderRequest;
import com.dskora.distributedtracing.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/orders")
class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping()
    @ResponseStatus(value = CREATED)
    public UUID placeOrder(@RequestBody CreateOrderRequest request) {
        return orderService.placeOrder(request.getProductId(), request.getQuantity());
    }
}