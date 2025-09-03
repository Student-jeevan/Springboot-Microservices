package com.Jeevansingh.Order_Service.controller;

import com.Jeevansingh.Order_Service.DTO.OrderRequest;
import com.Jeevansingh.Order_Service.service.orderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final orderService orderservice;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderservice.placeOrder(orderRequest);
        return "order placed successfully";
    }
}
