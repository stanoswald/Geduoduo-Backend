import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.stan.pojo.*;
import com.stan.service.CartService;
import com.stan.service.GoodsService;
import com.stan.service.OrderService;
import com.stan.service.UserService;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;

public class ServiceTest {
    @Test
    public void userTest() {
        UserService userService = new UserService();
        boolean res = userService.login(new User("123", "567", "stan1"));
        System.out.println(res);
    }

    @Test
    public void orderTest() {
        OrderService orderService = new OrderService();
        for (Order order : orderService.getOrder("ok_5N43AKKC4EEpUWfJYHaCymGdA")) {
            System.out.println(order);
        }

    }

    @Test
    public void goodsTest(){
        GoodsService goodsService = new GoodsService();
        Goods goods = goodsService.selectByGoodsId(3001);

        System.out.println(JSON.toJSONString(goods));

        for (Goods g : goodsService.selectByCatId(20)) {
            System.out.println(g);
        }
    }

    @Test
    public void cartTest(){
        CartService cartService = new CartService();
        Cart cart = cartService.getCart("ok_5N43AKKC4EEpUWfJYHaCymGdA");

        for (OrderItem o : cart.getOrderItem()) {
            System.out.println(o);
        }

    }
}
