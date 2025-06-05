package SpringJpaPractice.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


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
    private String name;
    private String foodName;
    private long password;
    private String email;

    @ManyToMany(mappedBy = "cutomerList")
    List<Food> food;


}

