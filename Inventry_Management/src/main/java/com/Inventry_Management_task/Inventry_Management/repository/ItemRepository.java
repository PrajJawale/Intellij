package com.Inventry_Management_task.Inventry_Management.repository;

import com.Inventry_Management_task.Inventry_Management.entity.Item;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
