package com.springJpa.springDataJpa.Model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
public class Food {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private int foodId;
    private String name;
    private String description;
    private String type;

    @ManyToMany(targetEntity = Customer.class,cascade = CascadeType.ALL)
    @JoinTable(name = "OrderTable" , joinColumns = @JoinColumn(name = "foodId"),
            inverseJoinColumns = @JoinColumn(name = "customerId"))
    List<Customer> cutomerList;


}
