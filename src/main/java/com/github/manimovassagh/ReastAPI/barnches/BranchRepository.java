package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends CrudRepository<Branch,Long> {
    void deleteById(Long id);


}
