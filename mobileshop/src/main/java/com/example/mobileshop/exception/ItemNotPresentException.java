package com.example.mobileshop.exception;

public class ItemNotPresentException extends Exception{
    public ItemNotPresentException(String messege){
        super(messege);
    }
}
