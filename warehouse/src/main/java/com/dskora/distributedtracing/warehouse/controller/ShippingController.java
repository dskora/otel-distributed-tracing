package com.dskora.distributedtracing.warehouse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/shipping")
class ShippingController {
    @PostMapping()
    public UUID orderShipping(UUID orderId) {
        return orderId;
    }
}
