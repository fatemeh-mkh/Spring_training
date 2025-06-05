package com.NewPro.newProj;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@AllArgsConstructor
@Controller
public class propertyInjectedController {

    ServiceImpl serv;

    public String sayHello(){
        return serv.sayGreeting();

    }
}
