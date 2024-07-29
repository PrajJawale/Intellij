package com.example.mobileshop.service;

import com.example.mobileshop.Dto.MobileRequestDto;
import com.example.mobileshop.Dto.StockReuestDto;
import com.example.mobileshop.Transformer.MobileTransformer;
import com.example.mobileshop.Transformer.StockTF;
import com.example.mobileshop.entity.Mobile;
import com.example.mobileshop.entity.StockOfMobile;
import com.example.mobileshop.exception.ItemNotPresentException;
import com.example.mobileshop.exception.SufficientItemNotPresent;
import com.example.mobileshop.repository.MobileRepository;
import com.example.mobileshop.repository.StockRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    @Autowired
    MobileRepository mobileRepository;

    public String updateMobile(int id, MobileRequestDto mobileRequestDto) throws ItemNotPresentException {
        StockOfMobile existMobile = stockRepository.findById(mobileRequestDto.getId()).get();
        if(existMobile == null){
            throw  new ItemNotPresentException("Item with input id not exist");
        }

        existMobile.setQuantity(existMobile.getQuantity()+mobileRequestDto.getQuantity());
        stockRepository.save(existMobile);

        return "Stock updated Successfully";
    }

    public String addItemInStock(StockReuestDto stockReuestDto) throws ItemNotPresentException, SufficientItemNotPresent {
        // Fetch the item from the repository
        Mobile mobile = mobileRepository.findById(stockReuestDto.getId())
                .orElseThrow(() -> new ItemNotPresentException("Item not present"));

        // Check if there is enough quantity
        if (mobile.getQuantity()>= stockReuestDto.getQuantity()) {
            // Update the item quantity
            mobile.setQuantity(mobile.getQuantity() -stockReuestDto.getQuantity());
            mobileRepository.save(mobile);
        } else {
            throw new SufficientItemNotPresent("Only " + mobile.getQuantity() + " item(s) available");
        }


            // Create a new stock entry
        StockOfMobile newStock = StockTF.addStock(stockReuestDto, mobile);
        stockRepository.save(newStock);
        return "Added Successfully";

    }
}
