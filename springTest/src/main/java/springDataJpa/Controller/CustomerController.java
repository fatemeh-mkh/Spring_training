package springDataJpa.Controller;

import com.fasterxml.jackson.core.PrettyPrinter;
import jakarta.validation.Valid;
import org.apache.catalina.Service;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springDataJpa.Dto.CustomerDto;
import springDataJpa.Model.Customer;
import springDataJpa.Service.CustomerService;
import springDataJpa.Service.CustomerServiceImpl;


import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl service;

//    @GetMapping("/allCustomers")
//    public List<CustomerDto> getAllUsersLocation(){
//        return service.getAllCustomers();
//    }
//
//
//    @GetMapping("/allCustomers{id}")
//    public CustomerDto getById(@PathVariable int id){
//       return service.getById(id);
//    }
//
//    @PostMapping
//    public CustomerDto createUser(@Valid @RequestBody CustomerDto customerDto) {
//        return service.createUser(customerDto);
//    }
//    @PutMapping("/update{id}")
//    public void updateCustomer(@PathVariable int id , @RequestBody CustomerDto customerDto){
//         service.updateCustomer(id,customerDto);
//    }

    @GetMapping("/allCustomers")
    public Page<Customer> getCustomers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return service.getCustomers(pageable);
    }
}
