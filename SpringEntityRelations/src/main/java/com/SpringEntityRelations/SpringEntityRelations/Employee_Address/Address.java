package com.SpringEntityRelations.SpringEntityRelations.Employee_Address;

import com.SpringEntityRelations.SpringEntityRelations.Auditable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title must be at most 100 characters")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Address_Employee",
            joinColumns = {
                    @JoinColumn(name = "address_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "employee_id", referencedColumnName = "id")})

    NewEmployee employee;

}
