package com.demo.controller;

import com.demo.domain.goods;
import com.demo.domain.goodspay;
import com.demo.domain.pay;
import com.demo.service.goodsservice;
import com.demo.service.payservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/pay")
public class paycontroller {
    @Autowired
    private payservice ps;

    @RequestMapping("/paygoods.do")
    public ModelAndView findById(@RequestParam(name = "goodsId", required = true) String goodsId) throws Exception {

        ModelAndView view = new ModelAndView();
        goodspay goodspay = new goodspay();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pay pays = new pay();
        pays.setDateString(UUID.randomUUID().toString().replaceAll("-", ""));
        pays.setSid(df.format(new Date()));
        pays.setGoodsid(goodsId);
        ps.save(pays);
        goodspay.setSid(UUID.randomUUID().toString().replaceAll("-", ""));
        goodspay.setDateString(df.format(new Date()));
        goodspay.setGlist(ps.findgoodsId(goodsId));
        List<goodspay> objects = new ArrayList<>();
        objects.add(goodspay);
        view.addObject("payslist", objects);
        view.setViewName("pay-list");
        return view;
    }
}
