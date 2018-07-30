package com.example.demo.controller;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Goods;
import com.example.demo.pojo.ReturnApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("/")
    public ReturnApi index() {
        List<Goods> goods = goodsMapper.findAll();

        ReturnApi returnApi = new ReturnApi(goods,200);

        return returnApi;
    }
}
