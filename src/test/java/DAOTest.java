import com.alibaba.fastjson.JSONObject;
import com.stan.mapper.GoodsMapper;
import com.stan.mapper.OrderMapper;
import com.stan.pojo.Goods;
import com.stan.pojo.Order;
import com.stan.pojo.OrderItem;
import com.stan.service.OrderService;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Map;

public class DAOTest {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Test
    public void testOrder() {
        SqlSession sqlSession = factory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

        for (Integer o : mapper.selectByOpenId("ok_5N43AKKC4EEpUWfJYHaCymGdA")) {
            System.out.println(o);
        }

        for (OrderItem item : mapper.selectOrder(2).getOrderItem()) {
            System.out.println(item);
        }

        OrderService orderService = new OrderService();
        String jsonString = JSONObject.toJSONString(orderService.getOrder("ok_5N43AKKC4EEpUWfJYHaCymGdA"));
        System.out.println(jsonString);
    }

    @Test
    public void testGoods() {
        SqlSession sqlSession = factory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = mapper.selectById(3001);
        System.out.println(goods);
    }
}
