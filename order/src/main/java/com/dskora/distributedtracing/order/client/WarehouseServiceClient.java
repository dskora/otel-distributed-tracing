package com.dskora.distributedtracing.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@FeignClient(name = "warehouse-service", url = "http://warehouse:8081/")
public interface WarehouseServiceClient {
    @PostMapping(path = "/shipping/{orderId}")
    String dispatchOrder(@PathVariable("orderId") UUID orderId);
}
