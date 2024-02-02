package com.wipro.flight.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.flight.bean.Flight;
import com.wipro.flight.util.DBUtil;

public class FlightDAO  {
	static Connection con=DBUtil.getDBConnection();
	public String seqName="FlightId_Seq";
	
	public String addFlight(Flight flight) {
		String result=null;
		
		//write code here
		String id3=getComputedId(flight.getFlightName(),seqName);
		String sql="insert into Flight_Tbl Values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id3);
			ps.setString(2, flight.getFlightName());
			ps.setString(3, flight.getSource());
			ps.setString(4, flight.getDestination());
			ps.setInt(5,flight.getEconomySeats());
			ps.setInt(6, flight.getBusinessSeats());
			ps.setInt(7, flight.getFirstClassSeats());
			ps.setString(8, flight.getFlightType());
			int count=ps.executeUpdate();
			if(count==1)
				result= "SUCCESS";
			else
				result= "FAIL";
			
		} catch (SQLException e) {
			
			result= "FAIL";
			
		}
				
		return result;
	}

	
	public String getComputedId(String name, String seqName) {
		String result="";
		//write code here
		
		if((name==null)||(seqName==null))
		{
			result="FAIL";
			System.out.println(result);
		}
		else if((name.length()<2))
		{
			result="INVALID_INPUT";
			System.out.println(result);
		}
		else if(((((int)(name.toLowerCase().charAt(0)))<97)&&((int)(name.toLowerCase().charAt(0))>122)))
		{
			result="INVALID_INPUT";
		}
		else if((((int)(name.toLowerCase().charAt(0))<97)&&((int)(name.toLowerCase().charAt(0))>122)))
		{
		result="INVALID_INPUT";
		}
		else if(!seqName.equals("FlightId_Seq"))
		{
			result="INVALID_INPUT";
		}
		else
		{
			
			String id2="";
			try{
			String sql="select FlightId_Seq.nextval from dual";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			int id1=0;
			while(rs.next())
			{
				id1=rs.getInt(1);
				
			}
			System.out.println(id1);
			 id2=name.substring(0,2).toUpperCase().concat(id1+"");
			 System.out.println(id2);
			
			}
			catch(SQLException s)
			{}
			result=id2;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		FlightDAO fd1=new FlightDAO();
		fd1.getComputedId("anam", "FlightId_Seq");
	}
}
