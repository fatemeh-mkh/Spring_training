package springDataJpa.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import springDataJpa.Dto.CustomerDto;
import springDataJpa.Mapper.CustomerMapper;
import springDataJpa.Model.Customer;
import springDataJpa.Repository.CustomerRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceJPA implements CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {

        return customerRepo.findAll()
                .stream()
                .map(customerMapper::customerToCustomerDto)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto getById(int customerId) {
        return customerMapper.customerToCustomerDto(customerRepo.findById(customerId)
                .orElse(null));
    }


    @Override
    public CustomerDto createUser(CustomerDto customerDto) {
        return customerMapper.customerToCustomerDto(customerRepo.save(customerMapper.customerDtoTocustomer(customerDto)));
    }


    @Override
    public void updateCustomer(int id, CustomerDto customerDto) {
        customerRepo.findById(id).ifPresent(customer -> { //customer is an optional object(if presents in repo do
            // some functional on it)
            customer.setName(customerDto.getName());
            customer.setFoodName(customerDto.getFoodName());
            customerRepo.save(customer);
        });
    }
}
