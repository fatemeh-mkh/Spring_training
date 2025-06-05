package com.SpringFlyway.newflyway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface familyRepo extends JpaRepository<FamilyTable,Integer> {
}
