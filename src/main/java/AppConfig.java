import com.evozon.repository.CartRepository;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import com.evozon.service.impl.CartServiceImpl;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CartRepository getCartRepository() {
        return new CartRepositoryImpl();
    }

    @Bean
    public ProductRepository getProductRepository() {
        return new ProductRepositoryImpl();
    }

    @Bean
    public CartService getCartService() {
        return new CartServiceImpl(getCartRepository(), getProductService());
    }

    @Bean
    public ProductService getProductService() {
        return new ProductServiceImpl(getProductRepository());
    }


}
