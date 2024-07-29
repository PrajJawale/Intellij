package com.Inventry_Management_task.Inventry_Management.service.serviceImpl;

import com.Inventry_Management_task.Inventry_Management.dtos.requestDto.StocksRequestDto;
import com.Inventry_Management_task.Inventry_Management.dtos.responseDto.StocksResponseDto;
import com.Inventry_Management_task.Inventry_Management.entity.Item;
import com.Inventry_Management_task.Inventry_Management.entity.Stocks;
import com.Inventry_Management_task.Inventry_Management.exception.ItemNotPresentException;
import com.Inventry_Management_task.Inventry_Management.exception.StockIDNotResisteredException;
import com.Inventry_Management_task.Inventry_Management.exception.SufficientItemNotPresent;
import com.Inventry_Management_task.Inventry_Management.repository.ItemRepository;
import com.Inventry_Management_task.Inventry_Management.repository.StocksRepository;
import com.Inventry_Management_task.Inventry_Management.service.StocksService;
import com.Inventry_Management_task.Inventry_Management.transformer.StocksTransFormer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StocksService {

    @Autowired
    private StocksRepository stocksRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public StocksResponseDto addItemInStock(StocksRequestDto stocksRequestDto) throws ItemNotPresentException, SufficientItemNotPresent {
        // Fetch the item from the repository
        Item item = itemRepository.findById(stocksRequestDto.getItem_id())
                .orElseThrow(() -> new ItemNotPresentException("Item not present"));

        // Check if there is enough quantity
        if (item.getQuantity() >= stocksRequestDto.getQuantity()) {
            // Update the item quantity
            item.setQuantity(item.getQuantity() - stocksRequestDto.getQuantity());
            itemRepository.save(item);
        } else {
            throw new SufficientItemNotPresent("Only " + item.getQuantity() + " item(s) available");
        }

        // Check if the stock entry already exists for the given item and location
        Stocks existingStock = stocksRepository.findByItemAndLocation(item, stocksRequestDto.getLocation());

        if (existingStock != null) {
            // Update the existing stock entry
            existingStock.setQuantity(existingStock.getQuantity() + stocksRequestDto.getQuantity());
            stocksRepository.save(existingStock);
            return StocksTransFormer.StockRequestDtoToStock(existingStock);
        } else {
            // Create a new stock entry
            Stocks newStock = StocksTransFormer.addItemInStock(stocksRequestDto, item);
            stocksRepository.save(newStock);
            return StocksTransFormer.StockRequestDtoToStock(newStock);
        }
    }
    @Override
    public Stocks getStockInfo(int id) throws StockIDNotResisteredException {
        Stocks existStock = stocksRepository.findById(id).get();
        if(existStock == null){
            throw new StockIDNotResisteredException("Stock ID Not Resistered");
        }
        return existStock;

    }
    @Override
    public ResponseEntity<List<Stocks>> avilableStocks() {
        List<Stocks> stocks = stocksRepository.findAll();
        return ResponseEntity.ok(stocks);
    }
}
