package com.Inventry_Management_task.Inventry_Management.service;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.ItemRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.ItemResponseDto;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;


public interface ItemService {
    ItemResponseDto addItem(ItemRequestDto itemRequestDto) ;
    ItemResponseDto updateItem(int id, ItemRequestDto itemRequestDto) throws SufficientItemNotPresent;
}
