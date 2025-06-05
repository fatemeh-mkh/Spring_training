package com.SpringBootLearn.SpringbootMock;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ServiceImplTest {

    @Autowired
//    EmployeeController employeeController;
    MockMvc mockMvc;

    @MockBean
    Service service;


    @Test
    void getEployeeById() throws Exception {
        int id=506;
        mockMvc.perform(MockMvcRequestBuilders.get("/employee/getstudent{id}"+ id)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}