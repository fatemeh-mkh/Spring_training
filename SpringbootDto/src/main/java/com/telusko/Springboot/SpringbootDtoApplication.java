package com.telusko.Springboot;

import com.telusko.Springboot.model.Location;
import com.telusko.Springboot.model.User;
import com.telusko.Springboot.repository.LocationRepository;
import com.telusko.Springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {

		Location loc= new Location();
		loc.setPlace("Esfahan");
		loc.setDescription("Esfahan is great place");
		loc.setLongitude(40.8);
		loc.setLatitude(30.6);

		locationRepository.save(loc);

		User user1= new User();
		user1.setFirstName("Fatmeh");
		user1.setLastName("Mokhtari");
		user1.setEmail("fatem.mokhtari@yahoo.com");
		user1.setPassword("admin");
		user1.setLoc(loc);

		userRepo.save(user1);
	}
}
