package com.telusko.demo.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.*;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Student> getAllStudent() {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cr = cb.createQuery(Student.class);//query result is list of student
        Root<Student> root = cr.from(Student.class);//from which entity fetching data
        cr.select(root);//return all datas of student entity

        Query query = session.createQuery(cr);//perform query and get result
        return query.getResultList();
    }

    @Transactional
    public Student getStudentById(int rollNo) {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb= session.getCriteriaBuilder();
        CriteriaQuery<Student> cr=cb.createQuery(Student.class);
        Root<Student> root = cr.from(Student.class);
        cr.select(root);
        cr.where(cb.equal(root.get("rollNo"),rollNo));
        Query query = session.createQuery(cr);

        return (Student) query.getSingleResult();
    }

    @Transactional
    public List<String> getNameColumn(){
        Session session= entityManager.unwrap(Session.class);
        CriteriaBuilder cb= session.getCriteriaBuilder();
        CriteriaQuery<String> cr= cb.createQuery(String.class);
        Root<Student> root= cr.from(Student.class);

        cr.select(root.get("name"));

        Query query= session.createQuery(cr);
        return query.getResultList();
    }

    public List<Integer> getMarksList(){
        Session session= entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        CriteriaQuery<Integer> criteriaQuery=criteriaBuilder.createQuery(Integer.class);
        Root<Student> root= criteriaQuery.from(Student.class);
        criteriaQuery.select(root.get("marks"));
        Query query=session.createQuery(criteriaQuery);
        return (List<Integer>)query.getResultList();
    }

    public List<Object[]> getSomeFields(){

        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder= session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery=criteriaBuilder.createQuery(Object[].class);
        Root<Student> root=criteriaQuery.from(Student.class);

        Path<Object> studentName=root.get("name");
        Path<Object> studentRollNo=root.get("rollNo");
        Path<Object> studentMarks=  root.get("marks");

//        criteriaQuery.select(criteriaBuilder.array(studentName,studentRollNo,studentMarks));
        criteriaQuery.multiselect(studentName,studentMarks,studentRollNo);
        Query query= session.createQuery(criteriaQuery);

        return query.getResultList();
    }


    public List<StudentDto> getDto(){
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        CriteriaQuery<StudentDto> cq=criteriaBuilder.createQuery(StudentDto.class);
        Root<Student> root=cq.from(Student.class);

        cq.select(criteriaBuilder.construct(StudentDto.class,root.get("name"),root.get("marks"),root.get("keyword")));
        Query query= session.createQuery(cq);
        return query.getResultList();
    }

     List<Tuple> getTuple(){
        Session session= entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
        CriteriaQuery<Tuple> cq= criteriaBuilder.createQuery(Tuple.class);
        Root<Student> root= cq.from(Student.class);

        Path<Object> studentName=root.get("name");
        Path<Object> studentRollNo=root.get("rollNo");


        cq.multiselect(studentName,studentRollNo);

        Query query=  session.createQuery(cq);
        return query.getResultList();
     }

    public List<Object[]> multipleRoot() {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = criteriaBuilder.createQuery(Object[].class);
        Root<Student> studentRoot = cq.from(Student.class);
        Root<Lesson> lessonRoot = cq.from(Lesson.class);


        cq.multiselect(studentRoot, lessonRoot);

        Predicate studentPredicate = criteriaBuilder.and(
                criteriaBuilder.equal(studentRoot.get("name"), "Fatemeh"),
                criteriaBuilder.greaterThan(studentRoot.get("marks"), 10)
        );
        Predicate lessonPredicate = criteriaBuilder.greaterThan(lessonRoot.get("rollNo"),2);


        cq.where(criteriaBuilder.and(studentPredicate, lessonPredicate));

        Query query = session.createQuery(cq);
        return query.getResultList();
    }


    public List<Student> fetchStudentsWithLessons() {
        Session session = entityManager.unwrap(Session.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);

        root.fetch("lesson", JoinType.INNER);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }
//**********************************************************************************





}
