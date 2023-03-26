package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Model.Seat;
import com.example.Repository.SeatsRepository;

public class SeatServiceImpl implements SeatService{

	@Autowired
	private SeatsRepository sr;
	
	@Override
	public List<Seat> findAvailableSeats(Integer bid) {
		// TODO Auto-generated method stub
		List<Seat> s=sr.FindByBusId(bid);
		return s;
	}

	@Override
	public Seat findSeat(Integer bid, Integer seatnumber) {
		// TODO Auto-generated method stub
		Seat s=sr.FindByBusIdAndSeatNumber(bid, seatnumber);
		return s;
	}

}
