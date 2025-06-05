package com.SpringLearn.SpringDependencyInjection.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = setterInjectedController.class)
class setterInjectedControllerTest {

    @Autowired
    private setterInjectedController setterInjectedController;
//
//    @BeforeEach
//    void setUp() {
//
//        setterInjectedController= new setterInjectedController();
//        ServiceImpl serv= new ServiceImpl();
//        setterInjectedController.setGreetingService(serv);
//    }

    @Test
    void sayHello() {
        String result = setterInjectedController.sayHello();
        assertEquals("Hello, World!", result);    }
}