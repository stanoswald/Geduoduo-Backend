package com.stan.service;

import com.stan.mapper.GoodsMapper;
import com.stan.pojo.Goods;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class GoodsService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public Goods selectByGoodsId(Integer id) {
        SqlSession sqlSession = factory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);


        Goods goods = mapper.selectById(id);
        sqlSession.close();

        return goods;
    }

    public List<Goods> selectByCatId(Integer catId) {
        SqlSession sqlSession = factory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        List<Goods> goods = mapper.selectByCatId(catId);
        sqlSession.close();
        return goods;
    }
}
