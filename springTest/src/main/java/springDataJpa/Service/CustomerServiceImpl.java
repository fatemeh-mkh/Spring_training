package springDataJpa.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import springDataJpa.Dto.CustomerDto;
import springDataJpa.Model.Customer;
import springDataJpa.Repository.CustomerRepo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo repository;
    public Page<Customer> getCustomers(Pageable pageable) {
        return repository.findAll(pageable);
    }


    @Override
    public List<CustomerDto> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDto getById(int customerId) {
        return convertEntityToDto(Objects.requireNonNull(repository.findById(customerId)
                .orElse(null)));
    }

    @Override
    public CustomerDto createUser(CustomerDto customerDto) {
        return convertEntityToDto(repository.save(convertDtoToEntity(customerDto)));
    }



    @Override
    public void updateCustomer(int id, CustomerDto customerDto) {

            Customer exist= convertDtoToEntity(customerDto,id);
            repository.save(exist);
    }



//    @Transactional
//
//    public Customer updateCustomer(int id, CustomerDto customerDto){
//
//            Customer exist= convertDtoToEntity(customerDto,id);
//            return repository.save(exist);
//    }


    //***********************************************************************

    private Customer convertDtoToEntity(CustomerDto customerDto) {
        if (customerDto == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setFoodName(customerDto.getFoodName());
        return customer;
    }

   public CustomerDto convertEntityToDto(Customer customer){
       CustomerDto ctdo= new CustomerDto();
       ctdo.setName(customer.getName());
       ctdo.setFoodName(customer.getFoodName());
       return ctdo;
   }
}
