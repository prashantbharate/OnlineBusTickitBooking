package com.example.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.TicketBooking;
import com.example.Repository.TickitBookingRepository;

@Service
public class TickitBookingServiceImpl implements TickitBookingService{
	
	@Autowired
	private TickitBookingRepository tbr;

	@Override
	public List<TicketBooking> findBookingByUser(Integer uid) {
		// TODO Auto-generated method stub
		List<TicketBooking> tb = tbr.FindByUserId(uid);
		return tb;
	}

	@Override
	public List<TicketBooking> findBookingByBusAndDate(Integer bid, Date journeydate) {
		// TODO Auto-generated method stub
		List<TicketBooking> tb = tbr.FindByBusIdAndJourneyDate(bid, journeydate);
		return tb;
	}

	@Override
	public List<TicketBooking> findBookingsByDate(Date Journey) {
		// TODO Auto-generated method stub
		List<TicketBooking> tb = tbr.FindByJourneyDate(Journey);
		return tb;
	}

	@Override
	public TicketBooking makeBooking(TicketBooking tb) {
		// TODO Auto-generated method stub
		return null;
	}

}
