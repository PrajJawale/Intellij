package com.example.mobileshop_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @ManyToOne
    @JoinColumn(name = "mobile_id", referencedColumnName = "id")
    private MobileStock mobileStock;

    private String mobileName;

    private Double mobilePrice;

    private Long mobileNo;

    private Long bookmobileId;
}