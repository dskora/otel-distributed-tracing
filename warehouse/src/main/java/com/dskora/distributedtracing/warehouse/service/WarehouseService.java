package com.dskora.distributedtracing.warehouse.service;

import com.dskora.distributedtracing.api.event.ShippingRegisteredEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WarehouseService {
    @Autowired
    private KafkaTemplate<Object, Object> template;

    public UUID registerShipping(UUID orderId) {
        // shipping actions
        // ...

        // shipping registered event
        this.template.send("orders", new ShippingRegisteredEvent(orderId));

        return orderId;
    }
}
