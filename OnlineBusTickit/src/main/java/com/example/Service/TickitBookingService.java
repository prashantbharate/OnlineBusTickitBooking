package com.example.Service;

import java.util.Date;
import java.util.List;

import com.example.Model.TicketBooking;

public interface TickitBookingService {
	
	public TicketBooking makeBooking(TicketBooking tb);

	public List<TicketBooking> findBookingByUser(Integer uid);
	
	public  List<TicketBooking> findBookingByBusAndDate(Integer bid, Date journeydate);
	
	public List<TicketBooking> findBookingsByDate(Date Journey);
	
}
