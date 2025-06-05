package com.SpringLearn.SpringDependencyInjection.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Override
    public String sayGreeting() {
        return "Hello everyone from Service";
    }
}
