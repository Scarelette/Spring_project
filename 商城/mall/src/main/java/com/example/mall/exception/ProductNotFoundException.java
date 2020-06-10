package com.example.mall.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Integer id) {
        super("Could not find that" + id);
    }
}