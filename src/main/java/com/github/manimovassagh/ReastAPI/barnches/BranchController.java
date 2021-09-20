package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BranchController {
    @Autowired
    BranchService service;

    @GetMapping("/branches")
    public Iterable<Branch> getAllBranches() {
        Iterable<Branch> allBranches = service.findAllBranches();
        return allBranches;
    }


    @RequestMapping(value = "/branches", method = RequestMethod.POST)
    public Branch addNewBranch(@RequestBody Branch branch) {
        return service.addNewBranch(branch);
    }


    @DeleteMapping("/branches/{id}")
    public void deleteBranch(@PathVariable Long id) {
        service.deleteBranch(id);
    }

    @DeleteMapping("/branches")
    public void deleteAllBranches() {
        service.deleteAllBranches();
    }


}
