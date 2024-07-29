package com.example.mobileshop_backend.repository;

import com.example.mobileshop_backend.entity.MobileStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MobileStockRepository extends JpaRepository<MobileStock, Long> {
    Optional<MobileStock> findByMobileName(String mobileName);
}