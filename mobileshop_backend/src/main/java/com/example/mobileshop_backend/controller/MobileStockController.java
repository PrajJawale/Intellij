package com.example.mobileshop_backend.controller;

import com.example.mobileshop_backend.entity.MobileStock;
import com.example.mobileshop_backend.service.MobileStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/mobileStock")

public class MobileStockController {

    @Autowired
    private MobileStockService service;

    @PostMapping("/addMobile")
    public MobileStock addMobile(@RequestBody MobileStock mobileStock) {
        return service.addMobile(mobileStock);
    }

    @GetMapping("/getAllMobile")
    public List<MobileStock> getAllMobiles() {
        return service.getAllMobiles();
    }

}