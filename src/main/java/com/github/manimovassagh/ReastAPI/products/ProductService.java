package com.github.manimovassagh.ReastAPI.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts(){
       return productRepository.findAll();
    }


    public void addProduct(Product product) {
        productRepository.save(product);
    }


    public List<Product> getAllProducts(String id) {
        List<Product> products = new ArrayList<>();
        //ignore this warning for know, it is ok
        productRepository.findByBranchId(id).addAll(products);
        //forEach(courses::add);
        return products;
    }
}
