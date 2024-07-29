package com.Inventry_Management_task.Inventry_Management.service.serviceImpl;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.ItemRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.ItemResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Item;

import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import com.Inventry_Management_task.Inventry_Management.repository.ItemRepository;
import com.Inventry_Management_task.Inventry_Management.service.ItemService;
import com.Inventry_Management_task.Inventry_Management.transformer.ItemTransFormer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;



    @Override
    public ItemResponseDto addItem(ItemRequestDto itemRequestDto) {
        Item item = ItemTransFormer.addItem(itemRequestDto);
        itemRepository.save(item);
        return ItemTransFormer.ItemRequstDtoTOItem(item);

    }



    @Override
    public ItemResponseDto updateItem(int id, ItemRequestDto itemRequestDto) throws SufficientItemNotPresent {
        Item existItem = itemRepository.findById(id).get();
        if(existItem == null){
            throw  new SufficientItemNotPresent("Item with input id not exist");
        }

        existItem.setQuantity(existItem.getQuantity()+itemRequestDto.getQuantity());
        ItemTransFormer.updateItem(itemRequestDto,existItem);
        itemRepository.save(existItem);

        return ItemTransFormer.updatedItemToResponseItem(existItem);
    }
}
