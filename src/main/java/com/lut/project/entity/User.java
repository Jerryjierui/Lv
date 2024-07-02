package com.lut.project.entity;


import lombok.Data;


@Data
public class User {

    private Integer Id;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String role;
    private String userAddress;
    private String userAvatar;


    private String token;

}
