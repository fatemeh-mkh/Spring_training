package springDataJpa.Mapper;

import org.mapstruct.Mapper;
import springDataJpa.Dto.CustomerDto;
import springDataJpa.Model.Customer;



@Mapper(componentModel = "spring")

public interface CustomerMapper {
    Customer customerDtoTocustomer(CustomerDto dto);
    CustomerDto customerToCustomerDto(Customer customer);
}
