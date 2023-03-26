package com.example.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Model.Route;
import com.example.Model.Seat;

@Repository
public interface RoutesRepository extends JpaRepository<Route, Integer>{

	public Route FindBySourceAndDestination(String source,String destination);
}
