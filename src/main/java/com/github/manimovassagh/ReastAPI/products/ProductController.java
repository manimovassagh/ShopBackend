package com.github.manimovassagh.ReastAPI.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.findAllProducts();
    }

    @RequestMapping("/branches/{branchId}/products")
    public List<Product> getAllProducts( @PathVariable Long branchId) {
        return service.getAllProducts(branchId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/branches/{branchId}/products")
    public void addProduct(@RequestBody Product product, @PathVariable String branchId) {
        service.addProduct(product);
    }
}


