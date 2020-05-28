package com.abhisek.gateway.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
	
	
	@Autowired
	private CardDetailsRepository  cardDetailsRepository;
 
    // Save student entity in the h2 database.
    public void save(final CardDetails student) {
    	cardDetailsRepository.save(student);
    }
 
    // Get all students from the h2 database.
    public List<CardDetails> getAll() {
        final List<CardDetails> students = new ArrayList<>();
        cardDetailsRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

}
