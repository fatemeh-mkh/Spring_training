//package com.telusko.demo.Service;
//
//import com.telusko.demo.model.RepoStudent;
//import com.telusko.demo.model.Student;
//import jakarta.transaction.Transactional;
//import lombok.Getter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//    @Autowired
//
//    RepoStudent rep;
//    @Getter
//    List<Student> student;
//
//    public StudentService(List<Student> student) {
//        this.student = student;
//    }
//
//    public List<Student> getAllStudents() {
//        return rep.findAll();
//    }
//
//    public Optional<Student> getStudentById(int rollNo) {
//              Optional<Student> student1=  rep.findById(rollNo);
//                return student1;
//    }
//
//
//    public void createStudent(int RolNo) {
//        rep.findById(RolNo);
//    }
//
//    public void deleteStudent(int rolNumber) {
//        rep.deleteById(rolNumber);
//    }
//
//    //    public void updateCustomer(int rolNo, int  marks) {
////        Optional<Student> student = rep.findById(rolNo);
////        student
////        rep.save(student);
////    }
//    public List<Student> searchByKeyword(String keyword) {
//        return rep.findByKeyword(keyword);
//    }
//
//    @Transactional
//    public void updateStudent(int rolNo, Student student1) {
//            Student studentInDatabase=rep.findById(rolNo).get();
//        studentInDatabase.setName(student1.getName());
//        studentInDatabase.setMarks(student1.getMarks());
//        rep.save(studentInDatabase);
//    }
//}
