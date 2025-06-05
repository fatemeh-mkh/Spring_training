//package com.SpringEntityRelations.SpringEntityRelations.Employee_Department;
//
//import com.SpringEntityRelations.SpringEntityRelations.Auditable;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//public class Employee extends Auditable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String firstName;
//    private String lastName;
//
//
//
//    @Builder.Default
//    @ManyToOne
//    @JoinColumn(name = "department_id")
//    private Department department=new Department();
//
//
//
//}