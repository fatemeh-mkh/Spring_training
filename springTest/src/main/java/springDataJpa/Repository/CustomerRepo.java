package springDataJpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springDataJpa.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
