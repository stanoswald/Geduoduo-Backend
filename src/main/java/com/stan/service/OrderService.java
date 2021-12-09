package com.stan.service;

import com.stan.mapper.OrderMapper;
import com.stan.pojo.Order;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Order> getOrder(String openId) {
        SqlSession sqlSession = factory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

        List<Order> res = new ArrayList<>();
        for (Integer orderId : mapper.selectByOpenId(openId)) {
            res.add(mapper.selectOrder(orderId));
        }
        return res;
    }
}
