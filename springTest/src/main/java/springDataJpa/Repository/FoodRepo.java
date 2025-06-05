package springDataJpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springDataJpa.Model.Food;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {
}
