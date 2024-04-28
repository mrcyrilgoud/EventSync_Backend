package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("quizes")
public class Quiz {
    @Id
    private String id;
    private String majorHobby;
    private String mainCareer;
    private String hobbies;
    private String potentialCareers;

    public Quiz(String majorHobby, String mainCareer, String hobbies, String potentialCareers){
        this.majorHobby = majorHobby;
        this.mainCareer = mainCareer;
        this.hobbies=hobbies;
        this.potentialCareers=potentialCareers;
    }


    // Getters and setters
}
