package com.telusko.demo.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lessonId;
    private String name;


    @Column(name = "roll_no", unique = true)
    private int rollNo;


}
