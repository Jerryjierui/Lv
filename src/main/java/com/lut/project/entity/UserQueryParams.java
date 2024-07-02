package com.lut.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserQueryParams {
    private String params;
    private String userName;
    private String userPhone;
}