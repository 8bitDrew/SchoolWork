/*
	Andrew Cox
	Assignment 8.1
	17 Oct 2017
	Bellevue University
*/

package myBean;

import java.io.*;
import java.sql.*;
import java.net.*;

public class CoxBean implements Serializable {
	
	private String dogName;
	private String dogBreed;
	private String coatColor;
	Connection conn = null;
	ResultSet result = null;
	Statement statement = null;
	String connectionURL = "jdbc:oracle:thin:@localhost:1521:XE";
	String user = "student1";
	String password = "pass";
	String tableName = "DOGBREED";
	
	public CoxBean(){
		try{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			conn = DriverManager.getConnection(connectionURL,user,password);
			statement = conn.createStatement();
		} catch (Exception e){
			System.out.println("Driver error is ; " + e);
		}	

	}

	//setters
	public void setName(String dogname){
		// this.dogName = dogName;
		this.dogName = Character.toUpperCase(dogName.charAt(0)) + dogName.substring(1);
	}
	public void setdogBreed(String dogBreed){
		//this.dogBreed = dogBreed;
		this.dogBreed = Character.toUpperCase(dogBreed.charAt(0)) + dogBreed.substring(1);
	}
	public void setcoatColor(String coatColor){
		this.coatColor = coatColor;
	}
	
	//getters
	public String getdogName(){
		return(this.dogName);
	}
	public String getlanme(){
		return(this.dogBreed);
	}
	public String getcoatColor(){
		return(this.coatColor);
	}

	//insert data
	public void insert(){
		try{
			String sql = "INSERT INTO " + tableName + "(dogName,dogBreed,coatColor,)" +
							"VALUES('"+dogName+"','"+dogBreed+"','"+coatColor+"')";
			// statement = conn.createStatement();
			statement.executeUpdate(sql);
			statement.close();
		} catch(Exception e){
			System.out.println("Insert error is ;" + e);
		}
	}
	
	
	//get data set
	public ResultSet getResult(){
		try {
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			conn = DriverManager.getConnection(connectionURL,user,password);
			statement = conn.createStatement();
			String sql = "SELECT dogName, dogBreed, coatColor FROM " + tableName;
			result = statement.executeQuery(sql);
			
		}
		catch(Exception e){
			System.out.println("Result Set; " + e);
		}
		return result;
	}
	
}