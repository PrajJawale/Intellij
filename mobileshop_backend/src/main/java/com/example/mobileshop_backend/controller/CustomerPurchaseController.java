package com.example.mobileshop_backend.controller;


import com.example.mobileshop_backend.entity.CustomerPurchase;
import com.example.mobileshop_backend.entity.MobileStock;
import com.example.mobileshop_backend.repository.MobileStockRepository;
import com.example.mobileshop_backend.service.CustomerPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/customerPurchase")

public class CustomerPurchaseController {

    @Autowired
    private CustomerPurchaseService customerPurchaseService;


    @Autowired
    private MobileStockRepository repository;

    @PostMapping("/add")
    public CustomerPurchase addCustomerPurchase(@RequestBody CustomerPurchase customerPurchase) {
        return customerPurchaseService.addCustomerPurchase(customerPurchase);
    }

    @GetMapping("/all")
    public List<CustomerPurchase> getAllCustomerPurchases() {
        return customerPurchaseService.getAllCustomerPurchases();
    }

    public MobileStock getMobileStockById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("MobileStock not found"));
    }
}
