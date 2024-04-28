package com.example.demo;

import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.QuizRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@Configuration
public class HcdApplication {
	@Autowired
	UserRepository userRepository;
	@Autowired
	QuizRepository quizRepository;
	@Autowired
    EventRepository eventRepository;

	public static void main(String[] args) {
		SpringApplication.run(HcdApplication.class, args);
	}

}
