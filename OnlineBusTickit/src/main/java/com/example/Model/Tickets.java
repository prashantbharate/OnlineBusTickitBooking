package com.example.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Tickets {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tid; 
	
	private LocalDateTime bookingdate;
	@Column(unique=true)
	private String name;
	private String email;
	private String phone;
	private Integer fare;
	private Integer no_of_seats;
	private String payment_mode;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Bus bus;
//	private LocalDateTime 
	
}
