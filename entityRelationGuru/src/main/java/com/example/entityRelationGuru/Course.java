package com.example.entityRelationGuru;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Builder
public class Course {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;

    @Column(length = 50)
    private String title;
    private String major;

    private String instructor;
    private LocalDateTime startDate;


    @ManyToMany(mappedBy = "courseList", fetch = FetchType.LAZY)
    Set<Student> studentList= new HashSet<>();

}
