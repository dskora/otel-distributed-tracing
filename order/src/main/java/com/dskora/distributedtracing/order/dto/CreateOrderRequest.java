package com.dskora.distributedtracing.order.dto;

import java.util.UUID;

public class CreateOrderRequest {
    private UUID productId;

    private int quantity;

    CreateOrderRequest(UUID productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
