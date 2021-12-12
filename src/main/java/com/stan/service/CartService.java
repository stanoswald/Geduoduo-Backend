package com.stan.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.stan.mapper.CartMapper;
import com.stan.pojo.Cart;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

public class CartService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Cart getCart(String openid) {
        SqlSession sqlSession = factory.openSession();
        CartMapper mapper = sqlSession.getMapper(CartMapper.class);

        return mapper.selectByOpenId(openid);
    }

    public boolean updateCart(String openid, JSONArray cart) {
        try {
            SqlSession sqlSession = factory.openSession();
            CartMapper mapper = sqlSession.getMapper(CartMapper.class);

            for (Object item : cart) {
                Integer goodsId = Integer.parseInt((String) ((JSONObject) item).get("goodsId"));
                Integer cartNum = Integer.parseInt((String) ((JSONObject) item).get("orderNum"));

                mapper.updateCart(openid, goodsId, cartNum);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
