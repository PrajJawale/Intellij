package com.example.mobileshop_backend.service;
import com.example.mobileshop_backend.entity.CustomerPurchase;
import com.example.mobileshop_backend.entity.MobileStock;
import com.example.mobileshop_backend.repository.CustomerPurchaseRepository;
import com.example.mobileshop_backend.repository.MobileStockRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerPurchaseService {

    @Autowired
    private CustomerPurchaseRepository customerPurchaseRepository;

    @Autowired
    private MobileStockRepository mobileStockRepository;

    @Transactional
    public CustomerPurchase addCustomerPurchase(CustomerPurchase customerPurchase) {
        MobileStock mobileStock = mobileStockRepository.findById(customerPurchase.getBookmobileId())
                .orElseThrow(() -> new EntityNotFoundException("Item not present"));

        // Deduct the quantity from mobile stock
        mobileStock.setQuantity(mobileStock.getQuantity() - 1);

        // Save the updated mobile stock
        mobileStockRepository.save(mobileStock);


        // Set the purchase price to the current price of the mobile stock
        customerPurchase.setMobilePrice(mobileStock.getPrice());
        customerPurchase.setCustomerName(customerPurchase.getCustomerName());
        customerPurchase.setBookmobileId(mobileStock.getId());
        customerPurchase.setMobileName(mobileStock.getMobileName());
        customerPurchase.setMobileNo(customerPurchase.getMobileNo());




        // Save and return the customer purchase
        return customerPurchaseRepository.save(customerPurchase);
    }

    public List<CustomerPurchase> getAllCustomerPurchases() {
        return customerPurchaseRepository.findAll();
    }
}
