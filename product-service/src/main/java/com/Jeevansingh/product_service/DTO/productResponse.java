package com.Jeevansingh.product_service.DTO;

import java.math.BigDecimal;

public record productResponse(String id , String name , String description , BigDecimal price) {
}
