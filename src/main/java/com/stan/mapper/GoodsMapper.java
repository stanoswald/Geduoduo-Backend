package com.stan.mapper;

import com.stan.pojo.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {

    Goods selectById(Integer id);

    List<Goods> selectByCatId(Integer catId);
}
