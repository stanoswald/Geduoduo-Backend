package com.stan.mapper;

import com.stan.pojo.Goods;
import com.stan.pojo.Order;
import com.stan.pojo.OrderItem;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    @Select("select order_id from tbl_order where openid=#{openId}")
    List<Integer> selectByOpenId(String openId);

    Order selectOrder(Integer orderId);
}
