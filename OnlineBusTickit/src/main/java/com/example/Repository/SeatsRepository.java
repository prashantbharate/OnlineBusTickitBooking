package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Seats;

public interface SeatsRepository extends JpaRepository<Seats, Integer> {

}
