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

        Cart cart = mapper.selectByOpenId(openid);
        sqlSession.close();
        return cart;

    }

    public boolean updateCart(String openid, JSONArray cart) {
        SqlSession sqlSession = factory.openSession();
        try {
            CartMapper mapper = sqlSession.getMapper(CartMapper.class);

            for (Object item : cart) {
                Integer goodsId = (Integer) ((JSONObject) item).get("goodsId");
                Integer cartNum = (Integer) ((JSONObject) item).get("orderNum");

                mapper.updateCart(openid, goodsId, cartNum);
            }
            sqlSession.commit();
            return true;
        } catch (Exception e) {
            sqlSession.rollback();
            return false;
        } finally {
            sqlSession.close();
        }
    }

    public boolean cartDel(String openId, Integer goodsId) {
        SqlSession sqlSession = factory.openSession();
        try {
            CartMapper mapper = sqlSession.getMapper(CartMapper.class);

            mapper.delItem(openId, goodsId);
            sqlSession.commit();
            return true;
        } catch (Exception e) {
            sqlSession.rollback();
            return false;
        } finally {
            sqlSession.close();
        }
    }

    public boolean addToCart(String openId, Integer goodsId) {
        SqlSession sqlSession = factory.openSession();
        try {
            CartMapper mapper = sqlSession.getMapper(CartMapper.class);
            mapper.insertCart(openId, goodsId);

            sqlSession.commit();
            return true;
        } catch (Exception e) {
            sqlSession.rollback();
            return false;
        } finally {
            sqlSession.close();
        }
    }
}
