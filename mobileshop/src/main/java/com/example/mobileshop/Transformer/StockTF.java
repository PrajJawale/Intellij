package com.example.mobileshop.Transformer;

import com.example.mobileshop.Dto.StockReuestDto;
import com.example.mobileshop.entity.Mobile;
import com.example.mobileshop.entity.StockOfMobile;

public class StockTF {
    public static StockOfMobile addStock(StockReuestDto stockReuestDto, Mobile mobile){
        return StockOfMobile
                .builder()
                .mobile(mobile)
                .quantity(stockReuestDto.getQuantity())
                .build();

    }
}
