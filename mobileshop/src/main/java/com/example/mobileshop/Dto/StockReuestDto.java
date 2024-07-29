package com.example.mobileshop.Dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StockReuestDto {
    private int id ;
    private  int quantity;
    private String name;


}
