package com.stan.service;

import com.stan.mapper.UserMapper;
import com.stan.pojo.User;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public boolean login(User user) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i;
        User resUser = mapper.selectByOpenId(user);
        if (resUser == null) {
            i = mapper.insertUser(user);
        } else {
            i = mapper.updateUser(user);
        }

        sqlSession.commit();
        sqlSession.close();
        return i == 1;
    }
}
