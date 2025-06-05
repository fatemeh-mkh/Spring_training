package com.telusko.spring_data_jpa_ex.model;

import com.telusko.spring_data_jpa_ex.RepoStudent;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.EnumSet;


@SpringBootApplication

public class SpringData {
    public static void main(String[] args){

        ApplicationContext context = SpringApplication.run(SpringData.class,args);


        Student stu1= context.getBean(Student.class);
        Student stu2= context.getBean(Student.class);
        Student stu3= context.getBean(Student.class);
        Student stu4= context.getBean(Student.class);

        stu1.setName("Ali");
        stu1.setRollNo(25);
        stu1.setMarks(36);


        stu2.setName("Ahmad");
        stu2.setRollNo(100);
        stu2.setMarks(36);

        stu3.setName("Fatemeh");
        stu3.setRollNo(25);
        stu3.setMarks(96);

        stu4.setName("Mari");
        stu4.setRollNo(39);
        stu4.setMarks(80);

        RepoStudent repo = context.getBean(RepoStudent.class);

        repo.save(stu1);
        repo.save(stu2);
        repo.save(stu3);
        repo.save(stu4);

        System.out.println(repo.findAll()); // get all data from database

    }
}
