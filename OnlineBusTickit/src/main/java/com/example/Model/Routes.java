package com.example.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
public class Routes {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rid; 
	
	private String starting_route;
	private String starting_state;
	private String destination_route;
	private String destination_state;
	private Integer total_stops;
	private LocalDateTime journey_start;
	private LocalDateTime journey_end;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Bus> bus1 = new ArrayList<>();

}
