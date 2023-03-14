package com.example.Model;

import java.time.LocalDateTime;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Bus {

	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bid; 
	
	@Column(unique=true)
	private String bus_no;
	private Integer capacity;
	private String bus_type;
	private LocalDateTime added_date;
	//private LocalDateTime destination_date;
	//private String bus_price;
	@OneToMany(cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Tickets> tikit = new ArrayList<>();

	@OneToMany(cascade=CascadeType.ALL)
	private List<Seats> seats = new ArrayList<>();
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Routes routes;
	
}

