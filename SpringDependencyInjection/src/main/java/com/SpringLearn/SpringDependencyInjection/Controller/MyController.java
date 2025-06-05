package com.SpringLearn.SpringDependencyInjection.Controller;

import com.SpringLearn.SpringDependencyInjection.Service.Service;
import com.SpringLearn.SpringDependencyInjection.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Controller
public class MyController {


    @Autowired
    @Qualifier("service")
    private final Service service;

    public MyController() {
        this.service = new ServiceImpl() {
        };
    }

    public String sayHello(){
        System.out.println("Im in Controller");

        return service.sayGreeting();
    }
}
