//package SpringJpaPractice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import SpringJpaPractice.Model.Customer;
//import SpringJpaPractice.Model.Food;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@SpringBootApplication
//public class SpringDataJpaApplication implements CommandLineRunner {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringDataJpaApplication.class, args);
//	}
//
////	@Autowired
////	CustomerRepo repo;
////	@Autowired
////	FoodRepo repo2;
////
////	@Override
////	public void run(String... args) throws Exception {
////		List<Customer> customerList = new ArrayList<>();
////
////		Customer customer1 = Customer.builder()
////				.customerId(1)
////				.name("Fatemeh")
////				.email("fatem.mokhtari@yahoo.com")
////				.password(12345)
////				.foodName("ghorme")
////				.food(new ArrayList<>())
////				.build();
////
////		customerList.add(0, customer1);
////		repo.save(customer1);
////
////		//*******************************************************
////		Customer customer2 = Customer.builder()
////				.customerId(2)
////				.name("Mohammad")
////				.email("Moh.M22@yahoo.com")
////				.password(5487)
////				.foodName("Gheime")
////				.food(new ArrayList<>())
////				.build();
////
////		customerList.add(1, customer2);
////		repo.save(customer2);
////
////		//**********************************************************
////
////		Customer customer3 = Customer.builder()
////				.customerId(3)
////				.name("Mari")
////				.email("Mari5520.naman@yahoo.com")
////				.password(12345)
////				.foodName("AbGoosht")
////				.food(new ArrayList<>())
////				.build();
////
////		customerList.add(2, customer3);
////		repo.save(customer3);
////		//************************************************************
////
////		Customer customer4 = Customer.builder()
////				.customerId(4)
////				.name("Ali")
////				.email("Ali41@yahoo.com")
////				.password(46985)
////				.foodName("Kebab")
////				.food(new ArrayList<>())
////				.build();
////
////		customerList.add(3, customer4);
////		repo.save(customer4);
////		//*************************************************************
////
////		Customer customer5 = Customer.builder()
////				.customerId(5)
////				.name("Ahmad")
////				.email("Ahmadim36@yahoo.com")
////				.password(12345)
////				.foodName("Jooje")
////				.food(new ArrayList<>())
////				.build();
////
////		customerList.add(4, customer5);
////		repo.save(customer5);
////		//*****************************************************************
////		//insert into food table
////
////
////		Map<Integer, Food> foodMap = new HashMap<>();
////
////		Food food1 = Food.builder()
////				.foodId(1)
////				.name("ghorme")
////				.type("IraniFood")
////				.description("with rice and ...")
////				.build();
////
////		foodMap.put(food1.getFoodId(), food1);
////		repo2.save(food1);
////
////		//******************************************************************
////
////		Food food2 = Food.builder()
////				.foodId(5)
////				.name("kebab")
////				.type("IraniFood")
////				.description("with rice and ...")
////				.build();
////
////		foodMap.put(food2.getFoodId(), food1);
////		repo2.save(food2);
////
////		//************************************************************************
////		Food food3 = Food.builder()
////				.foodId(6)
////				.name("gheime")
////				.type("IraniFood")
////				.description("with rice and ...")
////				.build();
////
////		foodMap.put(food3.getFoodId(), food1);
////		repo2.save(food3);
////
////
////	}
//}
