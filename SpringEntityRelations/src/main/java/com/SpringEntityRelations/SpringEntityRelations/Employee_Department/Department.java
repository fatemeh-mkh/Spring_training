//package com.SpringEntityRelations.SpringEntityRelations.Employee_Department;
//
//import com.SpringEntityRelations.SpringEntityRelations.Auditable;
//import com.SpringEntityRelations.SpringEntityRelations.Employee_Department.Employee;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.GenericGenerators;
//import org.hibernate.annotations.JdbcTypeCode;
//import org.hibernate.generator.Generator;
//import org.hibernate.type.SqlTypes;
//
//import java.util.List;
//import java.util.UUID;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class Department extends Auditable {
//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
//    @JdbcTypeCode(SqlTypes.CHAR)
//    @Column(length = 40,columnDefinition = "varchar(40)",updatable = false,nullable = false)
//    private UUID id;
//    private String name;
//
////    public Department(Employee employee) {
////        this.employees.add(employee);
////        ( employee).getDepartment().add(this);
////    }
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Employee> employees;
//
//}