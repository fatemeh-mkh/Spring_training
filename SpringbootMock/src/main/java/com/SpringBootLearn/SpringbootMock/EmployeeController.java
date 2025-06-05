package com.SpringBootLearn.SpringbootMock;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController()
@RequestMapping("/employee")
public class EmployeeController {


    private Service service;

    @RequestMapping("getemployee{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEployeeById(id);
    }
}
