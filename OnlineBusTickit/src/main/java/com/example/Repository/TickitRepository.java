package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Tickets;

public interface TickitRepository extends JpaRepository<Tickets, Integer>{

}
