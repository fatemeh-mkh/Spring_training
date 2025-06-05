package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Profile;

import com.SpringEntityRelations.SpringEntityRelations.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
@Entity
public class Profile extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany
    private Set<Comments> commentList  = new HashSet<>();
}
