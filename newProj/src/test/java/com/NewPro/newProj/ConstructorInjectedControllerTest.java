package com.NewPro.newProj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {


    @Autowired
    ConstructorInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new ServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}