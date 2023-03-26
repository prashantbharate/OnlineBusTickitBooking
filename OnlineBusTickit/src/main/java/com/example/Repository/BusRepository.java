package com.example.Repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Bus;
@Repository
public interface BusRepository extends JpaRepository<Bus, Integer>{

		List<Bus> FindBySourceAndDestinationAndDepartureDate(String Source, String Destination,Date Departure);
}
