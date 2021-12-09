package com.stan.service;

import com.stan.mapper.CartMapper;
import com.stan.pojo.Cart;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class CartService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Cart getCart(String openid) {
        SqlSession sqlSession = factory.openSession();
        CartMapper mapper = sqlSession.getMapper(CartMapper.class);

        return mapper.selectByOpenId(openid);
    }
}
