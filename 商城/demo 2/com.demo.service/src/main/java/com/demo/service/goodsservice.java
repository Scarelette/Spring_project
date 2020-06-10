package com.demo.service;

import com.demo.domain.goods;

import java.util.List;

public interface goodsservice {
    public List<goods> findAll() throws Exception;
}
