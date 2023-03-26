package com.example.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Seat {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid; 
	
	private Integer seatnumber;
	private boolean isavailable;
	
	//@ManyToOne
}

