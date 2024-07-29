package com.Inventry_Management_task.Inventry_Management.dtos.requestDto;

import com.Inventry_Management_task.Inventry_Management.entity.Item;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class StocksRequestDto {

     int item_id;

     Integer quantity;

     String location;
}
