package com.lut.project.Entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private int age;
    private String userEmail;

    private int card;

}
