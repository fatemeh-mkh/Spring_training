package com.telusko.demo.model;

import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
public class StudentDto {

    private String name;
    private int marks;
    private String keyword;


}
