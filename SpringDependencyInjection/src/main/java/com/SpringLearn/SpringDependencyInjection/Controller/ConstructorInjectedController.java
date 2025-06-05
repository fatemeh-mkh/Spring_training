package com.SpringLearn.SpringDependencyInjection.Controller;

import com.SpringLearn.SpringDependencyInjection.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final Service service;

    @Autowired

    public ConstructorInjectedController(@Qualifier("serviceImpl") Service serv){
        this.service=serv;

    }

    public String sayHello()
    {
        return service.sayGreeting();
    }
}
