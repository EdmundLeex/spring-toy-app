package us.edmundleex.bootstrap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import us.edmundleex.models.Product;
import us.edmundleex.repositories.ProductRepository;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product ttt = new Product();
        ttt.setDescription("Edmund's Tic Tac Toe game");
        ttt.setPrice(new BigDecimal("9.99"));
        ttt.setImageUrl("http://www.edmundleex.us/images/p07.png");
        ttt.setProductId("3213213521");
        productRepository.save(ttt);

        log.info("Saved shirt - id: " + ttt.getId());

        Product chess = new Product();
        chess.setDescription("Limited edition Edmund's Chess Game");
        chess.setImageUrl("http://www.edmundleex.us/images/p03.png");
        chess.setProductId("747912312");
        productRepository.save(chess);

        log.info("Saved macBook - id: " + chess.getId());
    }
}
