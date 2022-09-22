package com.sonata.mvc.test;

import java.util.Optional;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;




@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductTest {
    @Autowired
    public ProductRepository prepository;
    Optional<Product> p1;
    
      @Test
      public void getAllProductsTest(){





          List<Product> products = prepository.findAll();
            Assertions.assertThat(products.size()).isEqualTo(1);
            
            System.out.println(products);
        }
}
