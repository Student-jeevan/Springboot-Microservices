package com.jeevansingh.microservices.inventory_service.Repository;

import com.jeevansingh.microservices.inventory_service.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface inventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String SkuCode, Integer quantity);
}
