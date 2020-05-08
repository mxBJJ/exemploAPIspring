package com.maxmendes.api.resources;

import com.maxmendes.api.models.Product;
import com.maxmendes.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductResouce {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/produtos")
    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Product getProduct(@PathVariable(value = "id") long id){
        return productRepository.findById(id);
    }

    @PostMapping("/produtos")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/produtos/{id}")
    public void deleteProduct(@PathVariable(value = "id") long id){
        productRepository.deleteById(id);
    }

    @PutMapping("/produtos")
    public Product editProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
