package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;

import lombok.Getter;

@Getter
public class FamilyNameProjection {

    private final int id1;
    private final String motherName1;
    private final String fatherName1;

    public FamilyNameProjection(int id1, String motherName1, String fatherName1) {
        this.id1 = id1;
        this.motherName1 = motherName1;
        this.fatherName1 = fatherName1;
    }

}
