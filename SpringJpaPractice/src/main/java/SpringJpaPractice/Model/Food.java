package SpringJpaPractice.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
