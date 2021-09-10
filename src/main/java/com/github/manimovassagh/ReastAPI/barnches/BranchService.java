package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Branch> findAllBranches() {
        return topicRepository.findAll();
    }

    public Branch findOneBranch(Long id) {
        return topicRepository.getById(id);
    }

    public Branch addNewBranch(Branch branch) {
        return topicRepository.save(branch);
    }

    public void deleteBranch(Long id) {
        topicRepository.deleteById(id);
    }

    public void deleteAllBranches() {
        topicRepository.deleteAll();
    }


}
