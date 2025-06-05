package com.example.entityRelationGuru;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Long> {

    @Modifying
    @Transactional
    @Query(value = "SELECT new com.example.entityRelationGuru.StudentCourse(s.studentId, c.courseId,c.courseName,s.major) " +
            "FROM Student s JOIN Course c ON s.major = c.major",nativeQuery = true
           )
    List<StudentCourse> joinStudentAndCourse();
}
