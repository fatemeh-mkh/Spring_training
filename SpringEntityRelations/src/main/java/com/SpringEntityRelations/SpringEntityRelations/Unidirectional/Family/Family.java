package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;


import com.SpringEntityRelations.SpringEntityRelations.Auditable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Family extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String motherName;
    private String fatherName;
    private String familyLastName;

    public Family(int id, String motherName, String fatherName) {
        this.id = id;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }
}


