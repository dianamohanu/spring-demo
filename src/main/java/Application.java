import com.evozon.model.Product;
import com.evozon.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = applicationContext.getBean("prodService", ProductService.class);

        final Product product = productService.getById("123");

        System.out.println(product.getId());

    }
}