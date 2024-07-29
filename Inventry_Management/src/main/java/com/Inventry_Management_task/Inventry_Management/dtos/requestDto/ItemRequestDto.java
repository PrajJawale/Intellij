package com.Inventry_Management_task.Inventry_Management.dtos.requestDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemRequestDto {


    String name;

    int quantity;

    int price;

}
