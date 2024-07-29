package com.example.mobileshop.service;

import com.example.mobileshop.Dto.MobileRequestDto;
import com.example.mobileshop.Transformer.MobileTransformer;
import com.example.mobileshop.entity.Mobile;
import com.example.mobileshop.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MobileService {
    @Autowired
    MobileRepository mobileRepository;
    public String addMobile(MobileRequestDto mobileRequestDto){
        Mobile mobile = MobileTransformer.addMobie(mobileRequestDto);
        mobileRepository.save(mobile);
        return "add mobile Successfully";
    }




}
