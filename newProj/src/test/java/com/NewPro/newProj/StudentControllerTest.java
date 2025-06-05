package com.NewPro.newProj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static java.lang.reflect.Array.get;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)

class StudentControllerTest {

    @Autowired
//    EmployeeController employeeController;
    MockMvc mockMvc;

    @MockBean
    Service service;
    ServiceImpl serviceImpl = new ServiceImpl();




    //test for not foundException

    @Test
    void getEployeeById() throws Exception {
        int id=100;
//        Student studentTest =serviceImpl.listStu().get(1);
//        given(service.getStudentById(id)).willReturn(studentTest);
        given(service.getStudentById(id)).willThrow(NotFoundEception.class);


        mockMvc.perform(MockMvcRequestBuilders.get("/students/getstudent"+id))
                .andExpect(status().isNotFound())

//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON));
                ;
    }

}

