package com.SpringEntityRelations.SpringEntityRelations.Unidirectional.Family;

import lombok.Value;

public interface CustomerFamilyNameProjection {


    String getId();
    String getMotherName();
    String getFatherName();

}
