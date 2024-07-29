package com.Inventry_Management_task.Inventry_Management.controller;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.ItemRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.ItemResponseDto;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import com.Inventry_Management_task.Inventry_Management.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Item")
public class ItemController {
    @Autowired
    ItemService itemService;



    @PostMapping("/addNewItem")
    public ItemResponseDto addItem(@RequestBody ItemRequestDto itemRequestDto){
        return itemService.addItem(itemRequestDto);
    }

    @PutMapping("/updateItem/{id}")
    public ItemResponseDto updateItem(@PathVariable int id , @RequestBody ItemRequestDto itemRequestDto ) throws SufficientItemNotPresent {
        return itemService.updateItem(id,itemRequestDto);    }



}
