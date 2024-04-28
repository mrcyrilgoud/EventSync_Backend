package com.example.demo.controller;

import com.example.demo.model.Quiz;
import com.example.demo.model.User;
import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.QuizRepository;
import com.example.demo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hcd")
public class HcdController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private EventRepository eventRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PostMapping("/quiz")
    public Quiz addQuiz(@RequestBody Quiz quiz){return quizRepository.save(quiz);}
}
