package com.example.entityRelationGuru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseService {

   final StudentCourseRepository studentCourseRepository;

    @Autowired

    public StudentCourseService(StudentCourseRepository studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }


    public void joinAndSave() {
        List<StudentCourse> studentCourses = studentCourseRepository.joinStudentAndCourse();
        if (studentCourses.isEmpty()) {
            System.out.println("No data returned from the join query");
        } else {
            System.out.println("Data from join query: " + studentCourses);
            studentCourseRepository.saveAll(studentCourses);
            System.out.println("Data successfully saved to the intermediary table");
        }
    }
}
