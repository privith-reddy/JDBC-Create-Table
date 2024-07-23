package com.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyProgram 
{

	public static void main(String[] args) 
	{
		//coding steps for creating table through jdbc
		try 
		{
			//step 1: Load the Driver class:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step 2: Establish connection to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/palle","root","sadhu");
			
			//step 3: Prepare SQL statement :(by using  connection variable)
			Statement s = con.createStatement();
			
			//step 4: Execute query
			s.executeUpdate("create table employee(eid int,ename varchar(40),ecity varchar(50))");
			
			//step 5: close connection and statement
			s.close();
			con.close();	
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
