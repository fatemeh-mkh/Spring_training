package com.telusko.demo.model;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InterfaceRepository extends JpaRepository<Student,Integer> {

    //jpql
    @Query("SELECT u FROM Student u WHERE u.name = :name")
    List<Student> findByNameJpql(@Param("name") String name);

    //native
    @Query(value = "SELECT * FROM student WHERE name = :name", nativeQuery = true)
    List<Student> findByNameNative(@Param("name") String email);

    @Transactional
    @Modifying
    @Query("UPDATE Student u SET u.marks = :marks WHERE u.rollNo = :rollNo")
    void updateStudentJpql(@Param("rollNo") int rollNo,@Param("marks") int marks);


    @Query("SELECT u FROM Student u JOIN FETCH u.lesson  WHERE u.rollNo = :rollNo")
    Optional<Student> findLessonNameByIdWithStudent(int rollNo);


//    @Query(value = "SELECT * FROM student WHERE rollNo = :rollNo",
//            countQuery = "SELECT count(*) FROM student WHERE rollNo = :rollNo",
//            nativeQuery = true)
//    List<Student> findByStudentIdCount(@Param("rollNo") int rollNo);

    //sql query with pagination in repository
    @Query(value = "SELECT s.roll_no FROM student s LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<Integer> findNameUsersWithPagination(@Param("limit") int limit, @Param("offset") int offset);


    @Query(value = "SELECT l.name, AVG(s.marks) " +
            "FROM student s " +
            "JOIN lesson l ON l.roll_no = s.roll_no " +
            "GROUP BY l.name " +
            "HAVING AVG(s.marks) > 50",nativeQuery = true)
    List<Student> getMarkAvg ();
}
