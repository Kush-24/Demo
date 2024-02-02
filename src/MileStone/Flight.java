package com.wipro.flight.bean;


public class Flight {

	
	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", flightName=" + flightName + ", source=" + source + ", destination="
				+ destination + ", economySeats=" + economySeats + ", businessSeats=" + businessSeats
				+ ", firstClassSeats=" + firstClassSeats + ", flightType=" + flightType + "]";
	}
	public Flight(String flightID, String flightName, String source, String destination, int economySeats,
			int businessSeats, int firstClassSeats, String flightType) {
		super();
		this.flightID = flightID;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.economySeats = economySeats;
		this.businessSeats = businessSeats;
		this.firstClassSeats = firstClassSeats;
		this.flightType = flightType;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String flightID;
	private String flightName;
	private String source;
	private String destination;
	private int economySeats;
	private int businessSeats;
	private int	firstClassSeats;
	private String	flightType;
	public String getFlightID() {
		return flightID;
	}
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	public int getBusinessSeats() {
		return businessSeats;
	}
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	public int getFirstClassSeats() {
		return firstClassSeats;
	}
	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	
	
}
