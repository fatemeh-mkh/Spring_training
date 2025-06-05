package springDataJpa.Service;

import springDataJpa.Dto.CustomerDto;
import springDataJpa.Model.Customer;

import java.util.List;

public interface CustomerService {
    public List<CustomerDto> getAllCustomers();


    public CustomerDto getById(int customerId);
    public CustomerDto createUser(CustomerDto customerDto);


    public void updateCustomer(int id, CustomerDto customerDto);

    //***********************************************************************

    default Customer convertDtoToEntity(CustomerDto customerDto, int id) {
        return null;
    }

    default CustomerDto convertEntityToDto(Customer customer) {
        return null;
    }
}
