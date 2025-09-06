package com.jeevansingh.microservices.inventory_service.Service;

import com.jeevansingh.microservices.inventory_service.Repository.inventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final inventoryRepository InventoryRepository;
    // find a inventory with skuCode whose quantity is >=0;
    public boolean isInStock(String SkuCode , Integer quantity){
        return InventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(SkuCode , quantity);
    }
}
