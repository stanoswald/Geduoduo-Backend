package com.stan.mapper;

import com.stan.pojo.Goods;
import org.apache.ibatis.annotations.Select;

public interface GoodsMapper {

    Goods selectById(Integer id);
}
