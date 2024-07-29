package com.example.mobileshop.Transformer;

import com.example.mobileshop.Dto.MobileRequestDto;
import com.example.mobileshop.entity.Mobile;

public class MobileTransformer {

    public static Mobile addMobie(MobileRequestDto mobileRequestDto){
        return Mobile
                .builder()
                .type(mobileRequestDto.getType())
                .mobile_name((mobileRequestDto.getMobile_name()))
                .price(mobileRequestDto.getPrice())
                .build();
    }


}


