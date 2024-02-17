package com.dskora.distributedtracing.warehouse.controller;

import com.dskora.distributedtracing.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/shipping")
class ShippingController {
    @Autowired
    WarehouseService warehouseService;

    @PostMapping(path = "/{orderId}")
    public UUID registerShipping(@PathVariable("orderId") UUID orderId) {
        return warehouseService.registerShipping(orderId);
    }
}
