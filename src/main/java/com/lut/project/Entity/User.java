package com.lut.project.Entity;

import lombok.Data;

@Data
public class User {
    private Integer Id;
    private String userName;
    private String userPassword;
    private int age;
    private String userPhone;
    private String role;
    private String address;

    private String token;

}
