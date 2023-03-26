package com.example.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.TicketBooking;

@Repository
public interface TickitBookingRepository extends JpaRepository<TicketBooking, Integer>{
	
	List<TicketBooking> FindByUserId(Integer uid);
	
	List<TicketBooking> FindByBusIdAndJourneyDate(Integer bid, Date journeyDate);
	
	List<TicketBooking> FindByJourneyDate(Date journeyDate);
	

}
