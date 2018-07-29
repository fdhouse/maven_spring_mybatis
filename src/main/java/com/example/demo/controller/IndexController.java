package com.example.demo.controller;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("/")
    public String index(Model model) {
        List<Goods> goods = goodsMapper.findAll();
        model.addAttribute("goods", goods);
        return "hello";
    }
}
