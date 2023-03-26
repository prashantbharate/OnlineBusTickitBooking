package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Model.Seat;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seat, Integer> {

		//	@Query("select s.availableseats from Seats s")
		//	public Integer AvailableSeates();
		//
		//	@Query("UPDATE Seats s SET s.availableseats = ?1 WHERE s.sid=?2" )
		//	public void savetodatabase(Integer i1,Integer bid);
	
	
	public List<Seat> FindByBusId(Integer bid);
		
	public Seat FindByBusIdAndSeatNumber(Integer bid,Integer seatnumber);
}
