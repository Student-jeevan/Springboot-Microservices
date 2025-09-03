package com.Jeevansingh.Order_Service.DTO;
import java.math.BigDecimal;
public record OrderRequest(Long id , String orderNumber , String SkuCode , BigDecimal price , Integer quantity) {

}
