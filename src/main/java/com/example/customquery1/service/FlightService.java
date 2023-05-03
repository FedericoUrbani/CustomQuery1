package com.example.customquery1.service;

import com.example.customquery1.entites.Flight;
import com.example.customquery1.entites.FlightStatus;
import com.example.customquery1.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepository flightRepository;

    public List getAllFlights(){
        return flightRepository.findAll();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String randomeStringGenerator(){

        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for(int i=0;i<targetStringLength;i++){
            buffer.append((char) getRandomNumber(97,122));
        }
        String returnedString= buffer.toString();
        return returnedString;
    }


    public List<Flight> createFlightList(){
        List<Flight> flightList = new ArrayList<>();

        for (int i=0;i<50;i++){
            Flight flight= new Flight();
            flight.setFlightStatus(FlightStatus.ON_TIME);
            flight.setDescription(randomeStringGenerator());
            flight.setFromAirport(randomeStringGenerator());
            flight.setToAirport(randomeStringGenerator());
            flightRepository.save(flight);
            flightList.add(flight);
        }

        return flightList;
    }

}
