package com.restTemplate.restTemplate.client;

import com.restTemplate.restTemplate.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentClientImpl implements StudentClient{

    @Autowired
    private final RestTemplateBuilder restTemplateBuilder;

    @Override
    public Page<Student> listStudentFromServer() {
        RestTemplate restTemplate = restTemplateBuilder.build();

//        ResponseEntity<String> stringResponse= restTemplate.getForEntity("http://localhost:1234/getStudent" , String.class);

//        ResponseEntity<Map> mapResponse= restTemplate.getForEntity("http://localhost:1234/getStudent" , Map.class);

//        ResponseEntity<JsonNode> jsonResponse= restTemplate.getForEntity("http://localhost:1234/getStudent" , JsonNode.class);
//        ResponseEntity<StudentDtoPageImpl> jsonResponse= restTemplate.getForEntity("http://localhost:1234/getStudent" , StudentDtoPageImpl.class);

//        jsonResponse.getBody().findPath("content")
//                        .elements().forEachRemaining(jsonNode -> {
//                    System.out.println(jsonNode.get("name").asText());
//                });

        restTemplate.getForEntity("http://localhost:1234/getStudent", StudentClientImpl.class);
//        System.out.println(jsonResponse.getBody().toString());
        return null;
    }


    @Override
    public List<Student> getAllStudent() {
        return List.of();
    }
}
