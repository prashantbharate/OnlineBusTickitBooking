package com.example.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seats {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid; 
	
	private String availableseats;
}

