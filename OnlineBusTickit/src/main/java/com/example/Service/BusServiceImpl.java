package com.example.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Bus;
import com.example.Repository.BusRepository;

@Service
public class BusServiceImpl implements BusService{

	@Autowired 
	private BusRepository br;
	
	@Override
	public List<Bus> FindBuses(String source, String destination, Date department) {
		// TODO Auto-generated method stub
		List<Bus> b= br.FindBySourceAndDestinationAndDepartureDate(source, destination, department);
		return b;
	}

	
}
