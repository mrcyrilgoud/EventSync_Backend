package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
    @Id
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String school;
    private String major;

    public User(String name, Integer age, String email, String school, String major){
        this.name = name;
        this.age = age;
        this.email = email;
        this.school = school;
        this.major = major;
    }

    // Getters and setters
}

