package com.abhisek.gateway.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDetailsRepository extends CrudRepository<CardDetails, Integer>{
	 
	}


