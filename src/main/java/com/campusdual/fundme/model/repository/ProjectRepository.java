package com.campusdual.fundme.model.repository;

import com.campusdual.fundme.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findTop3ByOrderByTotalAmountDesc();
    List<Project> findTop3ByOrderByDateAddedDesc();

}