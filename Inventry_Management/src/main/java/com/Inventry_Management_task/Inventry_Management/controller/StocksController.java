package com.Inventry_Management_task.Inventry_Management.controller;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.StocksRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.StocksResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import com.Inventry_Management_task.Inventry_Management.exception.ItemNotPresentException;
import com.Inventry_Management_task.Inventry_Management.exception.StockIDNotResisteredException;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import com.Inventry_Management_task.Inventry_Management.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stocks")
public class StocksController {

    @Autowired
    StocksService stocksService;

    @PostMapping("/addInStocks")
    public StocksResponseDto addItemInStock(@RequestBody StocksRequestDto stocksRequestDto) throws ItemNotPresentException, SufficientItemNotPresent {
        return stocksService.addItemInStock(stocksRequestDto) ;
    }

    @GetMapping("/getStockInfo/{id}")
    public Stocks getStocksInfo(@PathVariable int id) throws StockIDNotResisteredException {
        return  stocksService.getStockInfo(id);
    }

    @GetMapping("/availableStocks")
    public ResponseEntity<List<Stocks>> availableStock(){
        return stocksService.avilableStocks();
    }
}
