package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Long> {
    void deleteById(Long id);

}
