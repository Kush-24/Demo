package com.wipro.flight.service;

import java.util.List;

import com.wipro.flight.bean.Flight;
import com.wipro.flight.dao.FlightDAO;


public class FlightService  {
FlightDAO fd=new FlightDAO();
public String seqName="FlightId_Seq";	
	public String createFlight(Flight flight) {
		String result="";
		
		//write code
		if(flight==null)
		{
			result="FAIL";
		}
		else{
			String fid=fd.getComputedId(flight.getFlightName(), seqName);
		 if((fid.equals("FAIL"))||fid.equals("INVALID_INPUT")){
				
			result="INVALID_INPUT";
		 	}
		else
		{
			flight.setFlightID(fid);
			String p=fd.addFlight(flight);
			if(p.equals("SUCCESS"))
			{
				result="SUCCESS";
			}
			else
				result="FAIL";
		}
		}
		
		return result;
	}

}
