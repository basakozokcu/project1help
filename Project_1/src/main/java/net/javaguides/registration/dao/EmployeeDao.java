package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.Employee;

import java.sql.DriverManager;


public class EmployeeDao {
	private static final String usersql = null;
Connection conn=Connectionfactory.getConnection();





	public int registEmployee(Employee employees)throws Exception{
		String usersql= "INSERT INTO employee" +
	"(id, first_name, last_name, username, password, address, contact) VALUES" +
				"(?,?,?,?,?,?,?);";
		
		int result=0;
		String result2="";
		
	
		
		
		
		
				//step2 create a statement using connection object
				
				
			PreparedStatement preparedStatement=conn.prepareStatement(usersql);
			preparedStatement.setInt(1,1);
			preparedStatement.setString(2,employees.getFirstName());
			preparedStatement.setString(3,employees.getLastName());
			preparedStatement.setString(4,employees.getUserName());
			preparedStatement.setString(5,employees.getPassword());
			preparedStatement.setString(6,employees.getAddress());
			preparedStatement.setString(7,employees.getContact());
			
			System.out.println(preparedStatement);
			
			//step 3 execute the query or update the query 
			
			result=preparedStatement.executeUpdate();
	
			
			return result;	
			
	}


		
	
		
		
	}

	
	
	


