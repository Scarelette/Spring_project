package com.demo.controller;

import com.demo.domain.goods;
import com.demo.service.goodsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class goodscontroller {
    @Autowired
    private goodsservice gs;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView view = new ModelAndView();
        List<goods> all = gs.findAll();
        view.addObject("goodsAll",all);
        view.setViewName("goods-list");
        return view;
    }
}
