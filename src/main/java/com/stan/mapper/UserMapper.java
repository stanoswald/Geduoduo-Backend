package com.stan.mapper;

import com.stan.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    @Insert("insert into tbl_user values(#{openId},#{sessionKey},#{nickName})")
    int insertUser(User user);

    @Select("select * from tbl_user where openid=#{openId}")
    User selectByOpenId(User user);

    @Update("update tbl_user " +
            "set session_key=#{sessionKey},nickname=#{nickName} " +
            "where openid=#{openId}")
    int updateUser(User user);
}
