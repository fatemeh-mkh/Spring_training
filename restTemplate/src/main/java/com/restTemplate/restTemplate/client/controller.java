package com.restTemplate.restTemplate.client;

import com.restTemplate.restTemplate.model.BeerDTO;
import com.restTemplate.restTemplate.model.Student;
import com.restTemplate.restTemplate.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private StudentClient studentClient;


    @GetMapping("/getStudentsFromServer")
    public Page<Student> getStudents() {
        return studentClient.listStudentFromServer();
    }


//    @GetMapping
//    public StudentDtoPageImpl<StudentDto> getAllUsers(Pageable pageable) {
//        Page<Student> userPage = studentClient.listStudentFromServer();
//        return new StudentDtoPageImpl<>(userPage.getContent(), userPage.getNumber(), userPage.getSize(), userPage.getTotalElements());
//    }
}
