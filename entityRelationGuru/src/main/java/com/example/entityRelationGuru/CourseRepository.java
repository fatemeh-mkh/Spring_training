package com.example.entityRelationGuru;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
//    @Query("SELECT new com.example.StudentCourse(s.studentId, s.name, c.courseId, c.courseName) " +
//            "FROM Student s JOIN Course c ON s.studentId = c.studentId")
//    List<StudentCourse> joinStudentAndCourse();
}
