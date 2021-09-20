package com.github.manimovassagh.ReastAPI.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/branches/{branchId}/products")
    public List<Product> findAllProducts(){
        return service.findAllProducts();
    }

    @RequestMapping("/branches/{branchId}/products")
    public List<Product> getAllProducts( @PathVariable Long branchId) {
        return service.getProductsByBranchID(branchId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/branches/{branchId}/products")
    public void addProduct(@RequestBody Product product, @PathVariable Long branchId) {
        service.addProduct(product);
    }





}


