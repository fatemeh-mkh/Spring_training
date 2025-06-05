package com.telusko.Springboot.controller;

import com.telusko.Springboot.Dto.UserLocationDTO;
import com.telusko.Springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class UserController {
    @Autowired

    private UserService Us;

    @GetMapping("/users")
    public List<UserLocationDTO> getAllUsersLocation(){
       return Us.getAllUsersLocation();
    }
}
