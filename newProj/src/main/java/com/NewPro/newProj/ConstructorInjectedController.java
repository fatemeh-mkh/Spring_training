package com.NewPro.newProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired

    private final Service service;

    public ConstructorInjectedController(Service service) {
        this.service = service;
    }

    public String sayHello()
    {
        return service.sayGreeting();
    }

}
