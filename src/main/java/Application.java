import com.evozon.config.AppConfig;
import com.evozon.model.Cart;
import com.evozon.service.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CartService cartService = applicationContext.getBean("cartService", CartService.class);

        cartService.add("123");

        final Cart cart = cartService.get();

        System.out.println(cart.getProducts().get(0).getId());
    }
}