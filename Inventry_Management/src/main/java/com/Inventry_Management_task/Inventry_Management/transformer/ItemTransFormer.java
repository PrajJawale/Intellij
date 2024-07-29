package com.Inventry_Management_task.Inventry_Management.transformer;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.ItemRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.ItemResponseDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.StocksResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Item;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import com.Inventry_Management_task.Inventry_Management.repository.ItemRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemTransFormer {

  public static Item addItem(ItemRequestDto itemRequestDto){
     return Item
             .builder()
             .name(itemRequestDto.getName())
             .price(itemRequestDto.getPrice())
             .quantity(itemRequestDto.getQuantity())
             .build();
  }

  public  static ItemResponseDto ItemRequstDtoTOItem(Item item){
     return  ItemResponseDto
              .builder()
              .id(item.getId())
              .name(item.getName())
              .Quantity(item.getQuantity())
              .build();
  }

  public static Item updateItem(ItemRequestDto itemRequestDto , Item item){
      return  Item
              .builder()
              .name(itemRequestDto.getName())
              .price(itemRequestDto.getPrice())
              .build();
  }

  public static ItemResponseDto updatedItemToResponseItem(Item item){
      return ItemResponseDto
              .builder()
              .name(item.getName())
              .id(item.getId())
              .Quantity(item.getQuantity())
              .build();
  }


}
