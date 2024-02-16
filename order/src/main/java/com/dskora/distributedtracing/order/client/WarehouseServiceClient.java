package com.dskora.distributedtracing.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@FeignClient(name = "warehouse-service", url = "http://localhost:8081/")
public interface WarehouseServiceClient {
    @PostMapping(path = "/shipping")
    String dispatchOrder(UUID orderId);
}
