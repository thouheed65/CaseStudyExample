package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.mvc.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
