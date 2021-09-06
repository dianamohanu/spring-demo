import com.evozon.model.Cart;
import com.evozon.service.CartService;
import com.evozon.service.impl.CartServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        CartService cartService = appContext.getBean("cartService", CartServiceImpl.class);

        cartService.add("123");

        final Cart cart = cartService.get();

        System.out.println(cart.getProducts().get(0).getId());
    }
}