package com.Inventry_Management_task.Inventry_Management.repository;

import com.Inventry_Management_task.Inventry_Management.entity.Item;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stocks,Integer> {
    Stocks findByItemAndLocation(Item item, String location);
}
