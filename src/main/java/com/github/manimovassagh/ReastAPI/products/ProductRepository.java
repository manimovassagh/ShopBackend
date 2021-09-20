package com.github.manimovassagh.ReastAPI.products;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

   public List<Product> findByBranchId(Long branchId);
}
