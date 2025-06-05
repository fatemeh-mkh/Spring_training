package com.example.entityRelationGuru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentCourseController {

    @Autowired
    StudentCourseService studentCourseService;


    @PostMapping("/join-student-course")
    public void joinStudentCourse() {
        studentCourseService.joinAndSave();
    }
}