package com.api.rest.web.controller;

import com.api.rest.domain.Product;
import com.api.rest.domain.Tecnology;
import com.api.rest.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){

        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct (@PathVariable("id") int productId){
        return productService.getProduct(productId);
    }

    @GetMapping("/tecnology/{id}")
    public Optional <List<Product>> getByTecnology (@PathVariable ("id") int tecnologyId){
        return productService.getByTecnology(tecnologyId);
    }

    @PostMapping("/post")
    public Product save (@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete (@PathVariable("id") int productid){
        return productService.delete(productid);

    }
}
