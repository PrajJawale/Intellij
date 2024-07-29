package com.example.mobileshop.controller;

import com.example.mobileshop.Dto.MobileRequestDto;
import com.example.mobileshop.Dto.StockReuestDto;
import com.example.mobileshop.Transformer.StockTF;
import com.example.mobileshop.entity.Mobile;
import com.example.mobileshop.exception.ItemNotPresentException;
import com.example.mobileshop.exception.SufficientItemNotPresent;
import com.example.mobileshop.repository.StockRepository;
import com.example.mobileshop.service.MobileService;
import com.example.mobileshop.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addNewMobile")
public class mobileController {
    @Autowired
    MobileService mobileService;


    @Autowired
    StockService stockService;
    @PostMapping("/add")
    public String addMobile(@RequestBody MobileRequestDto mobileRequestDto){
        return  mobileService.addMobile(mobileRequestDto);
    }

    @PutMapping("/updateStock/{id}")
    public String updateMobile(int id, MobileRequestDto mobileRequestDto) throws ItemNotPresentException {
       return stockService.updateMobile(id ,mobileRequestDto);
    }

    @PostMapping("/addInStock")
    public String addInStock(@RequestBody StockReuestDto stockReuestDto) throws ItemNotPresentException, SufficientItemNotPresent {
        return  stockService.addItemInStock(stockReuestDto);
    }

}
