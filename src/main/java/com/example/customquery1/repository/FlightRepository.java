package com.example.customquery1.repository;

import com.example.customquery1.entites.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository <Flight, Long> {
}

