import com.alibaba.fastjson.JSONObject;
import com.stan.mapper.CartMapper;
import com.stan.mapper.GoodsMapper;
import com.stan.mapper.OrderMapper;
import com.stan.pojo.Goods;
import com.stan.pojo.OrderItem;
import com.stan.service.OrderService;
import com.stan.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;


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
        sqlSession.close();
    }

    @Test
    public void testGoods() {
        SqlSession sqlSession = factory.openSession();
        GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);

        Goods goods = mapper.selectById(3001);
        System.out.println(goods);
        sqlSession.close();
    }

    @Test
    public void testCart() {
        SqlSession sqlSession = factory.openSession();
        CartMapper mapper = sqlSession.getMapper(CartMapper.class);

        mapper.updateCart("ok_5N43AKKC4EEpUWfJYHaCymGdA", 233, 5);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delCart() {
        SqlSession sqlSession = factory.openSession();
        CartMapper mapper = sqlSession.getMapper(CartMapper.class);

        mapper.delItem("ok_5N43AKKC4EEpUWfJYHaCymGdA", null);
        sqlSession.commit();
        sqlSession.close();
    }
}
