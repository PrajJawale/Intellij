package com.Inventry_Management_task.Inventry_Management.transformer;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.StocksRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.StocksResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Item;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import com.Inventry_Management_task.Inventry_Management.exception.ItemNotPresentException;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import com.Inventry_Management_task.Inventry_Management.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StocksTransFormer {


    public static Stocks addItemInStock(StocksRequestDto stocksRequestDto , Item item ) throws ItemNotPresentException, SufficientItemNotPresent {


         return  Stocks
                 .builder()
                 .item(item)
                 .quantity(stocksRequestDto.getQuantity())
                 .location(stocksRequestDto.getLocation())
                 .build();

    }

    public static StocksResponseDto StockRequestDtoToStock(Stocks stocks){
        return StocksResponseDto
                .builder()
                .id(stocks.getId())
                .location(stocks.getLocation())
                .build();
    }


    public static StocksResponseDto getStockInfoResponseDto(Stocks stocks ){
        return StocksResponseDto
                .builder()
                .id(stocks.getId())
                .quantity(stocks.getQuantity())
                .build();
    }




}
