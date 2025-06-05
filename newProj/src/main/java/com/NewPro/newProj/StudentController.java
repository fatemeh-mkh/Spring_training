package com.NewPro.newProj;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController()
@RequestMapping("/students")
public class StudentController {

    public static final URI BEER_PATH_ID = null;
    @Autowired

    private final Service service;


    @RequestMapping(value = "/getstudent",method = RequestMethod.GET)
    public List<Student> studentList(){

        return service.listStu();
    }

    @RequestMapping(value = "/getstudent{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        Student stu= service.saveStudent(student);

        HttpHeaders head= new HttpHeaders();
        head.add("location","/students" + stu.getId());

        return new ResponseEntity<String>("students added :)", HttpStatus.CREATED);
    }

    @PutMapping("/update{id}")
    public ResponseEntity<String> updateStudent(@PathVariable int id,@RequestBody Student student){

        service.updateStudent(id, student);
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/updatePatch{id}")
    public ResponseEntity<String> updateStudentPatchById(@PathVariable int id,@RequestBody Student student){

//        service.patchUpdate(id,student);
        if(service.patchUpdate(id,student)==4){
            return new ResponseEntity<String>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
//
    //handeling method in controller
    @ExceptionHandler(NotFoundEception.class)
    public ResponseEntity<String> handleNotFound(){
    return  ResponseEntity.notFound().build();
    }
}
