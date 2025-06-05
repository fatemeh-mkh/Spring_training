package com.restTemplate.restTemplate.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.restTemplate.restTemplate.model.Student;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true,value = "pageable")
public class StudentDtoPageImpl<StudentDto> extends PageImpl<com.restTemplate.restTemplate.model.StudentDto> {

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public StudentDtoPageImpl(@JsonProperty("content") List<com.restTemplate.restTemplate.model.StudentDto> content,
                        @JsonProperty("number") int number,
                        @JsonProperty("size") int size,
                        @JsonProperty("totalElements") long totalElements) {
        super(content, PageRequest.of(number, size), totalElements);
    }

    public StudentDtoPageImpl(List<com.restTemplate.restTemplate.model.StudentDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public StudentDtoPageImpl(List<com.restTemplate.restTemplate.model.StudentDto> content) {
        super(content);
    }

}
