package com.example.mobileshop_backend.service;

import com.example.mobileshop_backend.entity.MobileStock;
import com.example.mobileshop_backend.repository.MobileStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileStockService {

    @Autowired
    private MobileStockRepository repository;

    public MobileStock addMobile(MobileStock mobileStock) {
        Optional<MobileStock> existingStock = repository.findByMobileName(mobileStock.getMobileName());
        if (existingStock.isPresent()) {
            MobileStock stockToUpdate = existingStock.get();
            stockToUpdate.setPrice(mobileStock.getPrice());
            stockToUpdate.setQuantity(stockToUpdate.getQuantity() + mobileStock.getQuantity());
            stockToUpdate.setType(mobileStock.getType());
            return repository.save(stockToUpdate);
        } else {
            return repository.save(mobileStock);
        }
    }


    public List<MobileStock> getAllMobiles() {
        return repository.findAll();
    }
}
