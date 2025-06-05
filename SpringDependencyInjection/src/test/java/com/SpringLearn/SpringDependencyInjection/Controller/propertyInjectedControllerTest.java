package com.SpringLearn.SpringDependencyInjection.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class propertytest {

    @Autowired
    propertyInjectedController propertyInjectedController;

//    @BeforeEach
//    void setUp() {
//        propertyinjectedController=new propertyInjectedController();
//        Service ServiceImpl = new ServiceImpl();
//        propertyinjectedController.serv=ServiceImpl;
//    }


    @Test
    void testSayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}