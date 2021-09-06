import com.evozon.model.Cart;
import com.evozon.model.Product;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import com.evozon.service.impl.CartServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ProductService productService = applicationContext.getBean("prodServiceBean",ProductService.class);
        
        System.out.println(productService.getById("123").getId());
    }
}