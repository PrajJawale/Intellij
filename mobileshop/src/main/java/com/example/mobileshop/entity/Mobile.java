package com.example.mobileshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Mobile {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private  String type ;
    private String mobile_name;
    private int price ;
    private int quantity;



}
