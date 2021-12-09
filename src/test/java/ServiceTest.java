import com.stan.pojo.User;
import com.stan.service.UserService;
import org.junit.Test;

public class ServiceTest {
    @Test
    public void userTest() {
        UserService userService = new UserService();
        boolean res = userService.login(new User("123", "567", "stan1"));
        System.out.println(res);
    }
}
