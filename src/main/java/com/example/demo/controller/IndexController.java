package com.example.demo.controller;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("/")
    public List index() {
        List<Goods> goods = goodsMapper.findAll();
        for (Goods good : goods) {
            good.setShow("aa");
        }
        List returnList = goods;
        return returnList;
    }
}
