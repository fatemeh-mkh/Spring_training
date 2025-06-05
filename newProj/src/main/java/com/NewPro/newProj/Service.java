package com.NewPro.newProj;

import java.util.List;

@org.springframework.stereotype.Service
public interface Service {

    public String sayGreeting();


    List<Student> listStu();

    Student getStudentById(int id);


    Student saveStudent(Student student);

    void updateStudent(int id, Student student);

    void deleteById(int id);

    int patchUpdate(int id, Student student);
}
