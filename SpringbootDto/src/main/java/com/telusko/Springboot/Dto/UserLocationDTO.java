package com.telusko.Springboot.Dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private  Long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;



}
