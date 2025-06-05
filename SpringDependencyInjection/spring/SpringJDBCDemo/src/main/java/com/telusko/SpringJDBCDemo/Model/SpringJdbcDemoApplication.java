package com.telusko.SpringJDBCDemo.Model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Alien al1= context.getBean(Alien.class);
		Alien al2= context.getBean(Alien.class);
		Alien al3= context.getBean(Alien.class);
		Alien al4= context.getBean(Alien.class);
		Alien al5= context.getBean(Alien.class);

		AlienRepo rep5=context.getBean(AlienRepo.class);


//		al5.setAge(18);
//		al5.setName("Mari");
//		al5.setId("323");

//		rep5.saveData(al5);
//
//		al2.setAge(50);
//		al2.setName("Ali");
//		al2.setId("kotlin");
//
//		AlienRepo rep2=context.getBean(AlienRepo.class);
//		rep2.save(al2);
//
//
//		al3.setAge(67);
//		al3.setName("Mehran");
//		al3.setId("Mysql");

//		al4.setAge(75);
//		al4.setName("Nima");
//		al4.setId("Android");
//
//		AlienRepo rep4=context.getBean(AlienRepo.class);
//		rep4.save(al4);


			Scanner scanner = new Scanner(System.in);
//
//			System.out.print("Enter ID: ");
//			String id = scanner.nextLine();
//
//			System.out.print("Enter Name: ");
//			String name = scanner.nextLine();
//
//			System.out.print("Enter Age: ");
//			int age = scanner.nextInt();
//
//		if(rep5.updateAlien(id,age,name)==1){
//			System.out.println("\nalien updated");
//		}
//		else {
//			System.out.println("\nalien not found");
//		}
//
//		rep5.deleteAlien(id);
//		System.out.println(rep5.returnAll().toString());


	}

}
