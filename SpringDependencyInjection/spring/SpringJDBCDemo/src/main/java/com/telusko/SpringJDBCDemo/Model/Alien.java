package com.telusko.SpringJDBCDemo.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Data
@Table(name = "alien")
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Entity // add to table objects of this class

public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
    private String name;
    private int age;



    public void setId(String id) {
        this.id = id;
    }
    public String toString() {
        return "Alien{age=" + age + ", name='" + name + "', tech='" + id + "'}\n";
    }
}
