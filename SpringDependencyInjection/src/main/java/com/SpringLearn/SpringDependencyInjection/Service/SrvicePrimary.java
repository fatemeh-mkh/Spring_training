package com.SpringLearn.SpringDependencyInjection.Service;


import org.springframework.context.annotation.Primary;


@org.springframework.stereotype.Service
public class SrvicePrimary implements Service{


    @Override
    public String sayGreeting(){
        return "Hello from primary service";
    }
}

