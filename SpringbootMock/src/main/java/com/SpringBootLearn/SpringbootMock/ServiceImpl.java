package com.SpringBootLearn.SpringbootMock;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

    private final Map<Integer, Employee> employeeMap;

    public ServiceImpl() {
        this.employeeMap = new HashMap<>();

        Employee emp1 = Employee.builder()
                .name("Fatemeh")
                .id(1002)
                .cardNumber(123654)
                .city("Esfahan")
                .build();


        employeeMap.put(emp1.getId(), emp1);

    }
    @Override
    public Employee getEployeeById(int id) {
        return employeeMap.get(id);
    }
}
