package com.lut.project.Entity;

import java.lang.annotation.*;

/**
 * 注解，直接放开
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAccess {
}
