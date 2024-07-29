package com.example.product_activity.service;

import com.example.product_activity.Entity.Product;
import com.example.product_activity.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct {


    @Autowired
    ProductRepository productRepository;

    public ResponseEntity<List<Product>> getProductBelowThecurrentPrice(int price){
        List<Product> currProduct = productRepository.productBelowThePrice(price);
        return ResponseEntity.ok(currProduct);
    }

    public ResponseEntity<Product> addProduct(Product product){
        Product newProduct = Product
                .builder()
                .id(product.getId())
                .price(product.getPrice())
                .name(product.getName())
                .build();

        productRepository.save(newProduct);
        return ResponseEntity.ok(newProduct);
    }
}

