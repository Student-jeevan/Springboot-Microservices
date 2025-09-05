package com.Jeevansingh.product_service.Service;

import com.Jeevansingh.product_service.DTO.ProductRequest;
import com.Jeevansingh.product_service.DTO.productResponse;
import com.Jeevansingh.product_service.Model.Product;
import com.Jeevansingh.product_service.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public productResponse createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                          .name(productRequest.name())
                          .description(productRequest.description())
                           .price(productRequest.price()).build();
        productRepository.save(product);
        log.info("product created successfully");
        return new productResponse(product.getId() ,  product.getName() , product.getDescription() , product.getPrice());
    }
    public List<productResponse> getAllProducts(){
        return productRepository.findAll().stream().map(product -> new productResponse(product.getId() ,  product.getName() , product.getDescription() , product.getPrice())).toList();
    }
}
