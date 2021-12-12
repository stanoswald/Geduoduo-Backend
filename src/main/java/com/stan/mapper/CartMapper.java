package com.stan.mapper;

import com.stan.pojo.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {

    Cart selectByOpenId(String openId);

    int updateCart(@Param("openId") String openId,
                   @Param("goodsId") Integer goodsId,
                   @Param("cartNum") Integer cartNum);

    int delItem(@Param("openId") String openId,
                @Param("goodsId") Integer goodsId);
}
