package com.springJpa.springDataJpa.Repository;

import com.springJpa.springDataJpa.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {
}
