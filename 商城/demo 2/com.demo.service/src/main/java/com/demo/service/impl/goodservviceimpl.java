package com.demo.service.impl;

import com.demo.dao.goodsdao;
import com.demo.domain.goods;
import com.demo.service.goodsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class goodservviceimpl implements goodsservice {
    @Autowired
    private goodsdao gd;
    @Override
    public List<goods> findAll() throws Exception {
        return gd.findAll();
    }
}
