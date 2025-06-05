package springDataJpa.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import springDataJpa.Model.Customer;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepoTest {

    @Autowired
     CustomerRepo customerRepo;

    @Test
    void testSaveCustomer(){
        Customer saveCustomer=customerRepo.save(Customer.builder()
                .email("MinaNasiri@yahoo.com")
                .foodName("ghorme")
                .name("Mina")
                .password(56987)
                .build());

        assertThat(saveCustomer).isNotNull();
    }

}