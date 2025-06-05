package com.telusko.demo;

import com.telusko.demo.model.Lesson;
import com.telusko.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class DemoApplication1  {
	public static void main(String[] args){

		ApplicationContext context = SpringApplication.run(DemoApplication1.class,args);


//
//		Student stu1= context.getBean(Student.class);
//		Student stu2= context.getBean(Student.class);
//		Student stu3= context.getBean(Student.class);
//		Student stu4= context.getBean(Student.class);

	}
//	@Autowired
//	RepoStudent repoStudent;
//	@Autowired
//	LessonRepo lessonRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//
////		Student stu1 = new Student();
////
////		stu1.setName("Ali");
////		stu1.setRollNo(1);
////		stu1.setMarks(36);
////		repoStudent.save(stu1);
////
////		Student stu2= new Student();
////		stu2.setName("Ahmad");
////		stu2.setRollNo(2);
////		stu2.setMarks(36);
////		repoStudent.save(stu2);
////
////		Student stu3= new Student();
////		stu3.setName("Fatemeh");
////		stu3.setRollNo(3);
////		stu3.setMarks(96);
////		repoStudent.save(stu3);
////
////		Student stu4= new Student();
////		stu4.setName("Mari");
////		stu4.setRollNo(4);
////		stu4.setMarks(80);
////		repoStudent.save(stu4);
////
////		Student stu5= new Student();
////		stu5.setName("Nima");
////		stu5.setRollNo(5);
////		stu5.setMarks(93);
////		repoStudent.save(stu5);
////
////		Student st6= new Student();
////		st6.setName("Akbar");
////		st6.setRollNo(6);
////		st6.setMarks(54);
////		repoStudent.save(st6);
////************************************************************
//
//		Lesson lesson1= new Lesson();
//		lesson1.setLessonId(1);
//		lesson1.setName("Math");
//		lesson1.setRollNo(1);
//		lessonRepo.save(lesson1);
//
//		Lesson lesson2= new Lesson();
//		lesson2.setLessonId(2);
//		lesson2.setName("English");
//		lesson2.setRollNo(2);
//		lessonRepo.save(lesson2);
//
//		Lesson lesson3= new Lesson();
//		lesson3.setLessonId(3);
//		lesson3.setName("literature");
//		lesson3.setRollNo(3);
//		lessonRepo.save(lesson3);
//
//	}
}
