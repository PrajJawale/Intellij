package com.example.product_activity.repository;

import com.example.product_activity.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
     @Query("select p from Product p where p.price < :price ")
     List<Product> productBelowThePrice(@Param("price") int price);
}
