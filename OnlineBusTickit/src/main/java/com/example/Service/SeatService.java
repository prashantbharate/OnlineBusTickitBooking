package com.example.Service;

import java.util.List;

import com.example.Model.Seat;

public interface SeatService {

	public List<Seat> findAvailableSeats(Integer bid);
	
	public Seat findSeat(Integer bid, Integer seatnumber);
}
