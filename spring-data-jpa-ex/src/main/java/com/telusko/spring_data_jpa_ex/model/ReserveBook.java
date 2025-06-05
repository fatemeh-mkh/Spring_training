package com.telusko.spring_data_jpa_ex.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
@Entity
public class ReserveBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbook;

    private String title;

    @ManyToOne
    private Student student;


    public Long getIdbook() {
        return idbook;
    }

    public void setIdbook(Long idbook) {
        this.idbook = idbook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
