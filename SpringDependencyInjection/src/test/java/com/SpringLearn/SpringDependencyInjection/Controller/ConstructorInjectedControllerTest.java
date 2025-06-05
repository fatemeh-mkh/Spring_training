package com.SpringLearn.SpringDependencyInjection.Controller;

import com.SpringLearn.SpringDependencyInjection.Service.Service;
import com.SpringLearn.SpringDependencyInjection.Service.ServiceImpl;
import com.SpringLearn.SpringDependencyInjection.Service.SrvicePrimary;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


class ConstructorInjectedControllerTest {


    ConstructorInjectedController controller= new ConstructorInjectedController(new ServiceImpl());
    //    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new ServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}