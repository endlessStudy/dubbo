import com.tearsmart.domain.User;
import com.tearsmart.service.UserService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 * @author tear-smart
 * @date 2019-02-15
 */
public class Test {
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        this.userService = applicationContext.getBean(UserService.class);
    }

    @org.junit.Test
    public void testQueryAll() {
        User user = userService.queryUser();
        System.out.println("============="+user.toString());
    }
}
