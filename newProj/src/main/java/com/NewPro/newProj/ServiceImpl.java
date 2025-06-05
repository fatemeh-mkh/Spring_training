package com.NewPro.newProj;

import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;

@org.springframework.stereotype.Service


public class ServiceImpl implements Service {

    @Override
    public String sayGreeting() {
        return "Hello everyone from Service";
    }


    @Override
    public List<Student> listStu() {
        return new ArrayList<>(studentMap.values());
    }

    private Map<Integer, Student> studentMap;

    public ServiceImpl() {
        this.studentMap = new HashMap<>();

        Student stu1 = Student.builder()
                .name("Fatemeh")
                .las_name("Mokhtari")
                .Id(1002)
                .score(100)
                .birthday(LocalDateTime.now())
                .build();


        Student stu2 = Student.builder()
                .name("Mahdi")
                .las_name("Mohammadi")
                .Id(500)
                .score(98)
                .birthday(LocalDateTime.now())
                .build();

        Student stu3 = Student.builder()
                .name("Nima")
                .las_name("Nazem")
                .Id(506)
                .score(50)
                .birthday(LocalDateTime.now())
                .build();

        studentMap.put(stu1.getId(), stu1);
        studentMap.put(stu2.getId(), stu2);
        studentMap.put(stu3.getId(), stu3);


    }

    @Override
    public Student getStudentById(int id) {
        return studentMap.get(id);
    }

    @Override
    public Student saveStudent(Student student) {
        Student saveStu = Student.builder()
                .name(student.getName())
                .las_name(student.getLas_name())
                .Id(student.getId())
                .score(student.getScore())
                .birthday(LocalDateTime.now())
                .build();

        studentMap.put(saveStu.getId(),saveStu);
        return saveStu;
    }

    @Override
    public void updateStudent(int id, Student student) {
         Student newValue= studentMap.get(id);
        newValue.setName(student.getName());
        newValue.setLas_name(student.getLas_name());
        newValue.setBirthday(student.getBirthday());
        newValue.setScore(student.getScore());

        studentMap.put(newValue.getId(),newValue);
    }

    @Override
    public void deleteById(int id) {
        studentMap.remove(id);
    }

    @Override
    public int patchUpdate(int id, Student student) {

        int res=0;
        Student existStu= studentMap.get(id);

        if(StringUtils.hasText(student.getName())){
            existStu.setName(student.getName());
            res++;
        }

        if(student.getLas_name()!=null){
            existStu.setLas_name(student.getLas_name());
            res++;
        }

        if(student.getScore()>0){
            existStu.setScore(student.getScore());
            res++;
        }
        if(student.getBirthday()!=null){
            existStu.setBirthday(student.getBirthday());
            res++;
        }

        return res;
    }


}
