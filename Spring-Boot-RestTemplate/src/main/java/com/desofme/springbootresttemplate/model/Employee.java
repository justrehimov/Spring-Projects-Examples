package com.desofme.springbootresttemplate.model;

import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
}
