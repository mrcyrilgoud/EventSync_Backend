package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("events")
public class CampusEvent {
    @Id
    private String id;
    private String name;
    private String location;
    private String date;
    private String description;
    @Indexed
    private String label;

    public CampusEvent(String name, String location, String date, String description, String label){
        this.id = name+location+date;
        this.name = name;
        this.location = location;
        this.date = date;
        this.description = description;
        this.label = label;
    }
}
