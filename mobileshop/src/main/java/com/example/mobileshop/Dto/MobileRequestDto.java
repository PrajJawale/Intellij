package com.example.mobileshop.Dto;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MobileRequestDto {
    private int id ;
    private  String type ;
    private String mobile_name;
    private int price ;
    private int quantity;
}
