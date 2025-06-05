package SpringJpaPractice.Mapper;

import org.mapstruct.Mapper;
import SpringJpaPractice.Dto.CustomerDto;
import SpringJpaPractice.Model.Customer;


@Mapper
public class CustomerMapper {
    Customer customerDtoTocustomer(CustomerDto dto) {
        return null;
    }

    public CustomerDto customerToCustomerDto(Customer customer) {
            CustomerDto ctdo= new CustomerDto();
            ctdo.setName(customer.getName());
            ctdo.setFoodName(customer.getFoodName());
            return ctdo;
        }



}
