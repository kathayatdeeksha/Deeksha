package com.airport.AirlineProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.airport.AirlineProject.pojo.Airport;

@Service

public class AirportServiceImpl  implements AirportService{
	
	List<Airport> list;
	
  public AirportServiceImpl() {
	  list=new ArrayList<>();
	  list.add(new Airport("101","Dehradun","Jolly Grant Airport"));
	  list.add(new Airport("102","Delhi","Indira Gandhi  Airport"));
	  list.add(new Airport("103","Mumbai","Chhatrpati Shivaji Maharaj Airport"));
		
	}

	@Override
	public List<Airport> getAirports() {
		// TODO Auto-generated method stub
		return list;
	}

	

}
