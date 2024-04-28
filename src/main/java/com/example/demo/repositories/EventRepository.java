package com.example.demo.repositories;

import com.example.demo.model.CampusEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends MongoRepository<CampusEvent, String> {

    List<CampusEvent> findByLabelEqualsIgnoreCase(String label);
}
