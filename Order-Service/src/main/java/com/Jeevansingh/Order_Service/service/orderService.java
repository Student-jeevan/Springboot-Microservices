package com.Jeevansingh.Order_Service.service;

import com.Jeevansingh.Order_Service.DTO.OrderRequest;
import com.Jeevansingh.Order_Service.model.Orders;
import com.Jeevansingh.Order_Service.repository.orderRepository;
import jakarta.persistence.criteria.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class orderService {
    private final orderRepository OrderRepository;

    public void placeOrder(OrderRequest orderRequest){
        // map order request to order object
        Orders order = new Orders();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.SkuCode());
        order.setQuantity(orderRequest.quantity());
        // save order to the order repo
        OrderRepository.save(order);

    }
}
