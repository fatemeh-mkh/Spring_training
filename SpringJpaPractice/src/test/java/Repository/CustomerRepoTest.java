//package Repository;
//
//import org.checkerframework.checker.units.qual.A;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import springDataJpa.Model.Customer;
//import springDataJpa.Repository.CustomerRepo;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@DataJpaTest
//class CustomerRepoTest {
//
//    @Autowired
//   private CustomerRepo customerRepo;
//
//    @Test
//    void testSaveCustomer(){
//        Customer saveCustomer=customerRepo.save(Customer.builder()
//                .email("MinaNasiri@yahoo.com")
//                .foodName("ghorme")
//                .name("Mina")
//                .password(56987)
//                .build());
//
//        assertThat(saveCustomer).isNotNull();
//    }
//
//}