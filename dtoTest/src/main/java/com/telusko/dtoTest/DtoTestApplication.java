package com.telusko.dtoTest;

import com.telusko.dtoTest.Repository.UserRepository;
import com.telusko.dtoTest.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication()

public class DtoTestApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DtoTestApplication.class, args);

		UserRepository repo = context.getBean(UserRepository.class);

		User user1 = context.getBean(User.class);
		User user2 = context.getBean(User.class);
		User user3 = context.getBean(User.class);
		User user4 = context.getBean(User.class);


		user1.setName("Ali");
		user1.setId(25L);
		user1.setEmail("ali23@yahoo.com");

		user2.setName("Nima");
		user2.setId(32L);
		user2.setEmail("Nima123@yahoo.com");


		user3.setName("Ahmad");
		user3.setId(100L);
		user3.setEmail("Ahmad355@yahoo.com");

		repo.save(user1);
		repo.save(user2);
		repo.save(user3);


	}
}
