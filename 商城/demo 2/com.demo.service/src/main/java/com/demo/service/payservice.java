package com.demo.service;

import com.demo.domain.goods;
import com.demo.domain.pay;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface payservice {
    List<goods> findgoodsId(String goodsid) throws Exception;
    public void save(pay pays) throws Exception;
}
