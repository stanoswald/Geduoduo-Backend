package com.stan.service;

import com.stan.mapper.GoodsMapper;
import com.stan.pojo.Goods;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class GoodsService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Goods selectByGoodsId(Integer id) {
        SqlSession sqlSession = factory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        return mapper.selectById(id);
    }
}
