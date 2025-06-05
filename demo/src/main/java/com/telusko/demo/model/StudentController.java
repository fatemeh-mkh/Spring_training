//package com.telusko.demo.model;
//
//import com.telusko.demo.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//
//    StudentService service;
//
//    @GetMapping("/allStudents")
//    public ResponseEntity<List<Student>> getAllStudents() {
//        List<Student> students = service.getAllStudents();
//        return ResponseEntity.ok(students);
//
//    }
//
//    @GetMapping("/allStudents{rollNo}")
//    public ResponseEntity<String> getStudentById(@PathVariable int rollNo) {
//        service.getStudentById(rollNo);
//        return new ResponseEntity<>("Student Information by desired Id",HttpStatus.ACCEPTED);
//    }
//
//    @PostMapping
////    public Student createStudent(@RequestBody Student student) {
////        return service.createStudent(student);
////    }
//
//    @DeleteMapping("/deleteStudent{rolNumber}")
//    public void deleteStudent(@PathVariable int rolNumber) {
//        service.deleteStudent(rolNumber);
//    }
//
//    @GetMapping("/keyword{keyword}")
//    public List<Student> searchBykeyword(@PathVariable("keyword") String keyword){
//        return service.searchByKeyword(keyword);
//    }
//
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    @PutMapping("/updateStudent{rolNo}")
//    public void updateStudent(@PathVariable int rolNo, @RequestBody Student student) {
//        student.setRollNo(rolNo);
//        service.updateStudent(rolNo,student);
//    }
//}
//
//
