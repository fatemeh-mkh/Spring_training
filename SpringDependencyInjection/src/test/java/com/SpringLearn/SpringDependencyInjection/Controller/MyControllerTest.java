package com.SpringLearn.SpringDependencyInjection.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;

class MyControllerTest {

    @Qualifier("servicePrimary")

    MyController mycont= new MyController();

    @Test
    void sysHello() {
        System.out.println(mycont.sayHello());
    }
}