package com.example.demo.mapper;

import com.example.demo.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {

    @Select("SELECT * FROM goods")
    List<Goods> findAll();
}
