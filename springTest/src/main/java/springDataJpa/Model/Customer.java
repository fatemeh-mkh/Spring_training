package springDataJpa.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )


    private int customerId;
    @Column( length = 20)
    @Size(max = 20)
    private String name;

    @Column(name = "food_name",length = 25)
    private String foodName;
    private long password;
    private String email;

    @ManyToMany(mappedBy = "cutomerList")
    List<Food> food;



}

