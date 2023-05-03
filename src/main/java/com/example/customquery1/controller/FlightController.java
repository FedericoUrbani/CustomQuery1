package com.example.customquery1.controller;

import com.example.customquery1.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("")
    public List provisioning(){
        return flightService.createFlightList();
    }

    @GetMapping("/findall")
    public List findAllFlights(){
        return flightService.getAllFlights();
    }





}
