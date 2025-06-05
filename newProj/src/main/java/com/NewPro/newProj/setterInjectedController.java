package com.NewPro.newProj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class setterInjectedController {

    @Autowired
    private Service service;


//    public void setService( @Qualifier("srvicePrimary") Service service) {
//        this.service = service;
//    }

    public String sayHello(){
        return service.sayGreeting();
    }
}
