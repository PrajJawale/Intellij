package com.example.mobileshop.repository;

import com.example.mobileshop.entity.StockOfMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockOfMobile,Integer> {
}
