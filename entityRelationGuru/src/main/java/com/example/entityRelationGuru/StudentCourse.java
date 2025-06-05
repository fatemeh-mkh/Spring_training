package com.example.entityRelationGuru;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Data
@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long studentId;

    private Long courseId;
    private String courseName;
    private String major;

    public StudentCourse(Long studentId, Long courseId, String courseName, String major) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.courseName = courseName;
        this.major = major;
    }
}
