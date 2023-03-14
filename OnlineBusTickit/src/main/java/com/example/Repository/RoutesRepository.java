package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Model.Routes;

public interface RoutesRepository extends JpaRepository<Routes, Integer>{

	@Query("");
	public List<Routes> findRoutes(String start,String end);
}
