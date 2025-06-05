package com.telusko.demo.model;



import com.telusko.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

//by this annotation we will change the keyword path url that spring data rest itself create it
@RepositoryRestResource(path="student",collectionResourceRel = "each_student")
@Repository //for repository create repository annotation
public interface RepoStudent extends JpaRepository<Student, Integer> { // the primary key is roleNo

    List<Student> findAllByName(String name);
    List<Student> findByKeyword(String keyword);

    Page<Student> findAllByMarksAndName(int marks, String name, Pageable pagable);
}

