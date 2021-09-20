package com.github.manimovassagh.ReastAPI.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public Iterable<Product> findAllProducts() {
        return productRepository.findAll();
    }


    public void addProduct(Product product) {
        productRepository.save(product);
    }


    public List<Product> getAllProducts(Long productId) {
        List<Product> products = new ArrayList<>();
        productRepository.findByBranchId(productId).addAll(products);
        return products;
    }

    public Optional<Product> getByBranchID(Long branchId){
        return productRepository.findById(branchId);
    }
}
