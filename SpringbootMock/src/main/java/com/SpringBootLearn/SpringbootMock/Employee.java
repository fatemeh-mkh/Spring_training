package com.SpringBootLearn.SpringbootMock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class Employee {
    int id;
    String name;
    long cardNumber;
    String city;
}
