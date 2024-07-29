package com.example.mobileshop.repository;

import com.example.mobileshop.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile ,Integer> {
}
