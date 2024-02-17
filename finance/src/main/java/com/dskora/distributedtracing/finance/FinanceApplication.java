package com.dskora.distributedtracing.finance;

import com.dskora.distributedtracing.api.event.ShippingRegisteredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class FinanceApplication {
    private final Logger logger = LoggerFactory.getLogger(FinanceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(com.dskora.distributedtracing.finance.FinanceApplication.class, args);
    }

    @KafkaListener(id = "group", topics = "orders")
    public void processMessage(ShippingRegisteredEvent dto) {
        System.out.println("Message received by consumer 1: " + dto.getOrderId());
    }
}

