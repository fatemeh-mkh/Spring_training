package com.NewPro.newProj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyControllerTest {


    @Autowired
    MyController mycont;

    @Test
    void sysHello() {
        System.out.println(mycont.sayHello());
    }
}