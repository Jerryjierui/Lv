package com.lut.project.Entity;

import lombok.Data;

@Data
public class User {
    private int Id;
    private String userName;
    private String userPassword;
    private int age;
    private String role;
    private String address;

    private int card;

}
