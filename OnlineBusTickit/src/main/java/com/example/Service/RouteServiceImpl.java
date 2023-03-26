package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Route;
import com.example.Repository.RoutesRepository;

@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	private RoutesRepository rr;
	@Override
	public Route FindRoute(String source, String destination) {
		// TODO Auto-generated method stub
	Route r=rr.FindBySourceAndDestination(source, destination);
		return r;
	}

}
