package springDataJpa.Model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    String description;
    String amount;
    LocalDateTime localDateTime;


    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Customer> payments;

}
