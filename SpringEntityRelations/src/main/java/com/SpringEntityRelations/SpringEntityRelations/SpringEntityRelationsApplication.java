package com.SpringEntityRelations.SpringEntityRelations;

import com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family.Family;
import com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family.FamilyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpringEntityRelationsApplication implements CommandLineRunner {

	public static void main(String[] args){
		SpringApplication.run(SpringEntityRelationsApplication.class, args);

	}
	@Autowired
	FamilyRepo familyRepo;
		@Override
		public void run (String...args) throws Exception {



			Family family = new Family();
			family.setId(2);
			family.setFamilyLastName("Amiri");
			family.setFatherName("Ali");
			family.setMotherName("Zahra");
			family.setCreatedBy("Fatemeh Mokhtari");;
			family.setCreatedDate(LocalDateTime.now());

			familyRepo.save(family);

			Family family2 = new Family();
			family2.setId(3);
			family2.setFamilyLastName("Mokhtari");
			family2.setFatherName("Esmaiel");
			family2.setMotherName("Maryam");
			family2.setCreatedBy("Fatemeh Mokhtari");;
			family2.setCreatedDate(LocalDateTime.now());

			familyRepo.save(family2);

			Family family3 = new Family();
			family3.setId(4);
			family3.setFamilyLastName("Naman");
			family3.setFatherName("Reza");
			family3.setMotherName("Fatemeh");
			family3.setCreatedBy("Fatemeh Mokhtari");;
			family3.setCreatedDate(LocalDateTime.now());

			familyRepo.save(family3);

			Family family4 = new Family();
			family4.setId(5);
			family4.setFamilyLastName("Ahmadi");
			family4.setFatherName("Mahdi");
			family4.setMotherName("Asma");
			family4.setCreatedBy("Fatemeh Mokhtari");;
			family4.setCreatedDate(LocalDateTime.now());

			familyRepo.save(family4);



			Family family5 = new Family();
			family5.setId(6);
			family5.setFamilyLastName("Shayan");
			family5.setFatherName("Saeed");
			family5.setMotherName("Mahsa");
			family5.setCreatedBy("Fatemeh Mokhtari");;
			family5.setCreatedDate(LocalDateTime.now());

			familyRepo.save(family5);





		}
}