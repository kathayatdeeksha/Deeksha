package com.airport.AirlineProject.pojo;

public class Airport {
	
	private String airportCode;
	private String airportLocation;
	private String airportName;
	public Airport(String airportCode, String airportLocation, String airportName) {
		super();
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.airportName = airportName;
	}
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Override
	public String toString() {
		return "Airport [airportCode=" + airportCode + ", airportLocation=" + airportLocation + ", airportName="
				+ airportName + "]";
	}
	

}
