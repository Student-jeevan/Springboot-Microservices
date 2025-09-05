package com.Jeevansingh.product_service.Controller;

import com.Jeevansingh.product_service.DTO.ProductRequest;
import com.Jeevansingh.product_service.DTO.productResponse;
import com.Jeevansingh.product_service.Model.Product;
import com.Jeevansingh.product_service.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/product")
public class productController {
    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public productResponse CreateProduct(@RequestBody ProductRequest productRequest){
       return  productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<productResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
