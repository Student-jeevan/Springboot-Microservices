package com.Jeevansingh.Order_Service.repository;

import com.Jeevansingh.Order_Service.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Orders, Long> {

}
