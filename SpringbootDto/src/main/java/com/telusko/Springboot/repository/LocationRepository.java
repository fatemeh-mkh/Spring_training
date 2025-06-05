package com.telusko.Springboot.repository;

import com.telusko.Springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
