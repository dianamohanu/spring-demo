import com.evozon.repository.CartRepository;
import com.evozon.repository.ProductRepository;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.repository.impl.ProductRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.ProductService;
import com.evozon.service.impl.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("prodRepoBean")
    public ProductRepository getProdRepository(){
        return new ProductRepositoryImpl();
    }

    @Bean("prodServiceBean")
    public ProductService getProdService(){
        ProductServiceImpl service = new ProductServiceImpl();
        service.setProductRepository(getProdRepository());
        return service;
    }



}
