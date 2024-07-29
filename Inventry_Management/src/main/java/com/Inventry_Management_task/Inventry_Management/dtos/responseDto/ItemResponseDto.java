package com.Inventry_Management_task.Inventry_Management.dtos.responseDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemResponseDto {
    Integer id ;

    String name;

    int Quantity;
}
 