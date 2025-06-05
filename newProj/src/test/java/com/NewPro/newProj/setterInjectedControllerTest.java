package com.NewPro.newProj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class setterInjectedControllerTest {

    @Autowired
    private com.NewPro.newProj.setterInjectedController setterInjectedController;
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
        System.out.println( setterInjectedController.sayHello());
          }
}