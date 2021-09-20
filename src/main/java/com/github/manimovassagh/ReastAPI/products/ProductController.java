package com.github.manimovassagh.ReastAPI.products;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService service;


    @RequestMapping("/branches/{branchId}/products")
    public Optional<Product> getAllProducts(@PathVariable Long branchId) {
        return service.getByBranchID(branchId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/branches/{branchId}/products")
    public void addProduct(@RequestBody Product product, @PathVariable Long branchId) {

        service.addProduct(product);
    }


}


