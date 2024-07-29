package com.example.mobileshop_backend.repository;

import com.example.mobileshop_backend.entity.CustomerPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPurchaseRepository extends JpaRepository<CustomerPurchase,Long> {
}
