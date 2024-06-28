package com.lut.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("user")
public class User {
    @TableId(type= IdType.AUTO)
    private Integer Id;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String role;
    private String userAddress;
    private String userAvatar;

    @TableField(exist = false)
    private String token;

}
