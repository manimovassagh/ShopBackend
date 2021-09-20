package com.github.manimovassagh.ReastAPI.barnches;



import javax.persistence.*;


@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String branchName;

    public Branch() {
    }

    public Branch(Long id, String branchName) {
        this.id = id;
        this.branchName = branchName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id='" + id + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
