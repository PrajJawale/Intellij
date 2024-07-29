package com.example.product_activity.controller;

import com.example.product_activity.Entity.Product;
import com.example.product_activity.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ServiceProduct serviceProduct;
    @GetMapping("/getProductBelowTheCurreuntPrice/{price}")
    public ResponseEntity<List<Product>> getProductBelowThecurrentPrice(@PathVariable int price ){
        return serviceProduct.getProductBelowThecurrentPrice(price);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return serviceProduct.addProduct(product);
    }

}
