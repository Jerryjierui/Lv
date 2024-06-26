package com.lut.project.Util.exception;

/**
 * 自定义异常
 */

public class ServiceException extends RuntimeException{
    public ServiceException(String msg){
        super(msg);
    }
}

