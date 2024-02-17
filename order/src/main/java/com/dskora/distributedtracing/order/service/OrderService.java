package com.dskora.distributedtracing.order.service;

import com.dskora.distributedtracing.order.client.WarehouseServiceClient;
import com.dskora.distributedtracing.order.domain.Order;
import com.dskora.distributedtracing.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    WarehouseServiceClient warehouseServiceClient;

    public UUID placeOrder(UUID productId, int quantity) {
        UUID orderId = UUID.randomUUID();
        orderRepository.save(new Order(orderId, productId, quantity));

        warehouseServiceClient.dispatchOrder(orderId);

        return orderId;
    }
}
