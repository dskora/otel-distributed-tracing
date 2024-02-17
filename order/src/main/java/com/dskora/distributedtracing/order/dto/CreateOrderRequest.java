package com.dskora.distributedtracing.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.util.UUID;

@Value
public class CreateOrderRequest {
    private UUID productId;

    private int quantity;
}
