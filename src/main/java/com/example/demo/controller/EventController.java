package com.example.demo.controller;

import com.example.demo.model.CampusEvent;
import com.example.demo.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    @PostMapping()
    public CampusEvent addEvent(@RequestBody CampusEvent event){return eventRepository.save(event);}

    @GetMapping
    public List<CampusEvent> getEvents(@RequestParam String label){
        return eventRepository.findByLabelEqualsIgnoreCase(label);
    }
}
