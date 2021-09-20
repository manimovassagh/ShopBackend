package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public Iterable<Branch> findAllBranches() {
        return branchRepository.findAll();
    }

    public Optional<Branch> findOneBranch(Long id) {
        return branchRepository.findById(id);
    }

    public Branch addNewBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }

    public void deleteAllBranches() {
        branchRepository.deleteAll();
    }


}
