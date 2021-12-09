package com.stan.mapper;

import com.stan.pojo.Cart;

public interface CartMapper {

    Cart selectByOpenId(String openId);
}
