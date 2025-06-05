package com.example.entityRelationGuru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class EntityRelationGuruApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EntityRelationGuruApplication.class, args);
	}
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {

		List<Student> studentList= new ArrayList<>();

		Student  student1= Student.builder()

				.firstName("Fatemeh")
				.lastName("Mokhtari")
				.major("Computer engineering")
				.gender("f")
				.phoneNumber("09130329436")
				.build();
		studentList.add(0,student1);
		studentRepository.save(student1);

		Student  student2= Student.builder()

				.firstName("Mahsa")
				.lastName("Niazi")
				.major("Computer engineering")
				.gender("f")
			.phoneNumber("0913065478")
				.build();
		studentList.add(1,student2);
		studentRepository.save(student2);

		Student  student3= Student.builder()

				.firstName("Zahra")
				.lastName("Baghi")
				.major("Computer engineering")
				.gender("f")
				.phoneNumber("0990324568")
				.build();
		studentList.add(2,student2);
		studentRepository.save(student3);

		Student  student4= Student.builder()

				.firstName("Mohhammad")
				.lastName("SeyedHosseini")
				.major("Computer engineering")
				.gender("m")
				.phoneNumber("0912547832")
				.build();
		studentList.add(3,student4);
		studentRepository.save(student4);

		Student  student5= Student.builder()

				.firstName("Reyhane")
				.lastName("Pooyande")
				.major("Commerce")
				.gender("f")
				.phoneNumber("0913065478")
				.build();
		studentList.add(4,student5);
		studentRepository.save(student5);

		Student  student6= Student.builder()

				.firstName("Mahdi")
				.lastName("haghverdi")
				.major("Commerce")
				.gender("m")
				.phoneNumber("0914577892")
				.build();
		studentList.add(5,student6);
		studentRepository.save(student6);
		//******************************************************************

		Course course1= Course.builder()

				.courseName("Public Math2")
				.title("...")
				.major("Computer engineering")
				.instructor("Feria")
				.startDate(LocalDateTime.now())
				.build();
		courseRepository.save(course1);

		Course course2= Course.builder()

				.courseName("Public Math1")
				.title("...")
				.major("Computer engineering")
				.instructor("Mahdavi")
				.startDate(LocalDateTime.now())
				.build();
		courseRepository.save(course2);

		Course course3= Course.builder()

				.courseName("Eghtesad")
				.title("...")
				.major("Commerce")
				.instructor("Rezaie")
				.startDate(LocalDateTime.now())
				.build();
		courseRepository.save(course3);

		Course course4= Course.builder()

				.courseName("Amar")
				.title("...")
				.major("Commerce")
				.instructor("Ahmadi")
				.startDate(LocalDateTime.now())
				.build();
		courseRepository.save(course4);

	}
	}
