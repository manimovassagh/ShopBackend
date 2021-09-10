package com.github.manimovassagh.ReastAPI.barnches;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Branch,Long> {
}
