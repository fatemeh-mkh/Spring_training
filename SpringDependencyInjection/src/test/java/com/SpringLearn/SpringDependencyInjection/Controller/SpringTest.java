package com.SpringLearn.SpringDependencyInjection.Controller;

import com.SpringLearn.SpringDependencyInjection.MyApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MyApp.class)
public class SpringTest {

	@Autowired
	private MyController controller;

	@Test
	public void testServiceMethod() {
		controller.sayHello();
	}
}