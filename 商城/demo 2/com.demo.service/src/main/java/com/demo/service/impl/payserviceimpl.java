package com.demo.service.impl;

import com.demo.dao.paydao;
import com.demo.domain.goods;

import com.demo.domain.pay;
import com.demo.service.payservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class payserviceimpl implements payservice {
    @Autowired
    private paydao pd;
    @Override
    public List<goods> findgoodsId(String goodsid) throws Exception {
        return pd.findgoodsId(goodsid);
    }

    @Override
    public void save(pay pays) throws Exception {
    pd.save(pays);
    }
}
