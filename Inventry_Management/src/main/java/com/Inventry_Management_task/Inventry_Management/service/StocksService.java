package com.Inventry_Management_task.Inventry_Management.service;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.StocksRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.StocksResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import com.Inventry_Management_task.Inventry_Management.exception.ItemNotPresentException;
import com.Inventry_Management_task.Inventry_Management.exception.StockIDNotResisteredException;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StocksService {
     StocksResponseDto addItemInStock(StocksRequestDto stocksRequestDto) throws ItemNotPresentException, SufficientItemNotPresent;
     Stocks getStockInfo(int id) throws StockIDNotResisteredException;
     ResponseEntity<List<Stocks>> avilableStocks();
}
