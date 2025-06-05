package com.telusko.demo.model;

import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class controller {

//    @Autowired
//    LessonRepo lessonRepo;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    InterfaceRepository interfaceRepository;

//    @GetMapping("getLesson/{name}")
//    public ResponseEntity<List<Lesson>> getLessonByStudent(@PathVariable String name){
//        return new ResponseEntity<List<Lesson>>(lessonRepo.findbyStudentName(name), HttpStatus.OK);
//    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }


    @GetMapping("/getStudentById/{rollNo}")
    public Student StudentById(@PathVariable int rollNo){
        return  studentRepository.getStudentById(rollNo);
    }

    @GetMapping("/getByColumnName")
    public List<String> getColumn(){
        return studentRepository.getNameColumn();
    }
    @GetMapping("/getByColumnMarks")
    public List<Integer> getColumnMarks(){
        return studentRepository.getMarksList();
    }

    @GetMapping("/someFields")
    public List<Object[]> getSomeColumn(){
        return studentRepository.getSomeFields();
    }

    @GetMapping("/getDtoField")
    public List<StudentDto> getDto(){
        return studentRepository.getDto();
    }

    @GetMapping("/getTuple")
    public List<Tuple> getTuple(){
        return studentRepository.getTuple();
    }

    @GetMapping("/getMultipleRoot")
    public List<Object[]> getMultipleRoot(){
        return studentRepository.multipleRoot();
    }

    @GetMapping("/fetchData")
    public List<Student> fetchData(){
        return studentRepository.fetchStudentsWithLessons();
    }

    //*******************************************************************************

    @GetMapping("/getByStudentName")
    public List<Student> getStudentByName(@RequestParam String name){
//        return interfaceRepository.findByNameJpql(name);
        return interfaceRepository.findByNameNative(name);
    }

    @PutMapping("/updateStudent")
    public void updateStudentJpql(@RequestParam int rollNo, @RequestParam int marks){
        interfaceRepository.updateStudentJpql(rollNo,marks);
    }

    @GetMapping("/joinStudentLesson")
    public Optional<Student> getStudentByName(@RequestParam("rollNo") int rollNo){
        return interfaceRepository.findLessonNameByIdWithStudent(rollNo);
    }

//    @GetMapping("/countStudent")
//    public List<Student> countStudent(@RequestParam("rollNo") int rollNo){
//        return interfaceRepository.findByStudentIdCount(rollNo);
//    }


    @GetMapping("/sqlWithPagination")
    public ResponseEntity<List<Integer>> getStudentByName(
            @RequestParam() int page,
            @RequestParam() int size) {

        int offset = page * size;
        List<Integer> studentsRollNo = interfaceRepository.findNameUsersWithPagination(size, offset);

        return ResponseEntity.ok(studentsRollNo);
    }


    @GetMapping("getMarksAvg")
    public ResponseEntity<List<Student>> getAvg(){
        return ResponseEntity.ok(interfaceRepository.getMarkAvg());
    }

}
