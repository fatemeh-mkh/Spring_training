package com.NewPro.newProj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = NewProjApplication.class)
public class SpringTest {

	@Autowired
	private MyController controller;

	@Test
	public void testServiceMethod() {
		controller.sayHello();
	}
}