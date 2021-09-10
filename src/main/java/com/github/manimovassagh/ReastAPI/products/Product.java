package com.github.manimovassagh.ReastAPI.products;


import com.github.manimovassagh.ReastAPI.barnches.Branch;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private float productPrice;
    @OneToMany
    private Branch productBranch;

    public Product() {
    }

    public Product(Long id, String productName, float productPrice, Branch productBranch) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBranch = productBranch;
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

    public Branch getProductBranch() {
        return productBranch;
    }

    public void setProductBranch(Branch productBranch) {
        this.productBranch = productBranch;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productBranch=" + productBranch +
                '}';
    }
}
