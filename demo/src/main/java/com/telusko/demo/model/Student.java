package com.telusko.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor

@Getter
@Setter
@Table(name = "student")
@Component
@Scope("prototype")
@Entity // add to table objects of this class

public class Student {

    //properties
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id //make roleNo as primary key
    private int rollNo;
    private String name;
    private int marks;
    private String keyword;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "roll_no", referencedColumnName = "rollNo")
    private Lesson lesson;


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollNo, String name, int marks, String keyword, Lesson lesson) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.keyword = keyword;
        this.lesson = lesson;
    }
}