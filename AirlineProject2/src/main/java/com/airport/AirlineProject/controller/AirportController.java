package com.airport.AirlineProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airport.AirlineProject.pojo.Airport;
import com.airport.AirlineProject.services.AirportService;

@RestController

public class AirportController {
	@Autowired
	
	private AirportService airportService;
	
	@GetMapping("/home")
	public String home() {
		return " Welcome to Airport Home page";
		
		
	}
	
	@GetMapping("/Airports")
	public  List<Airport> getAirports()
	{
		
		return this.airportService.getAirports();
				
		
	}
	
		
		
		
		
	}


