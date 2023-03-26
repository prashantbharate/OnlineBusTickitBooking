package com.example.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class TicketBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tid; 
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Bus bus;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Seat seat;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	private Date bookingdate;
	
	private Date JourneyDate;
	
	
	
	
//	private LocalDateTime 
	
}
