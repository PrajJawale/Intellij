package com.example.mobileshop_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class MobileStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobileName;
    private Double price;
    private Integer quantity;
    private String type;

    @OneToMany(mappedBy = "mobileStock")
    private List<CustomerPurchase> customerPurchases;

}
