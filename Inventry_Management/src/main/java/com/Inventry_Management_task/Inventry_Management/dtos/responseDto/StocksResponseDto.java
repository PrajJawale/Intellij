package com.Inventry_Management_task.Inventry_Management.dtos.responseDto;

import com.Inventry_Management_task.Inventry_Management.entity.Item;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StocksResponseDto {

    int id ;

    Item item;

    Integer quantity;

    String location;



}
