package com.maxmendes.api.repository;
import com.maxmendes.api.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findById(long id);
}
