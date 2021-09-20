package com.github.manimovassagh.ReastAPI.products;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.manimovassagh.ReastAPI.barnches.Branch;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private float productPrice;

    @ManyToOne
    Branch branch;

    public Product(Long id, String productName, float productPrice, Long branchId) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.branch = new Branch(branchId, "");
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", branch=" + branch +
                '}';
    }
}
