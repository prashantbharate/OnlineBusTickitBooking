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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Bus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bid; 
	
	@Column(unique=true)
	private String busnumber;
	private String source;
	private String destination;
	private Date departuredate ;
	private Date arrivaldate;
	private double fare;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Seat> s;
	
	
	
}

