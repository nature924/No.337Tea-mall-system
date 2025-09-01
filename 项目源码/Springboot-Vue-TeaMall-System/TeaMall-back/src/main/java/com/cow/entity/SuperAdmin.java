package com.cow.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 */
@Data
@ConfigurationProperties(prefix = "admin")
@Component
public class SuperAdmin {
    private String email;
    private String userName;
    private String password;
}
