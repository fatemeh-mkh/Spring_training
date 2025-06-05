package com.restTemplate.restTemplate.client;

import com.restTemplate.restTemplate.model.BeerDTO;
import com.restTemplate.restTemplate.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentClient {

    public Page<Student> listStudentFromServer();

    public List<Student> getAllStudent();
}
