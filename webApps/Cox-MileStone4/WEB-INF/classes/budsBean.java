
package myBean;

import java.beans.*;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class budsBean implements Serializable {
    
    String databaseAddress = "jdbc:oracle:thin:@localhost:1521:XE";
    String username = "student1";
    String password = "pass";
    String table1 = "CUSTOMERS";
    String table2 = "PRODUCTS";
    String table3 = "ORDERS";
    String table4 = "ORDER_ITEMS";
    
    Connection connection = null;
    Statement stmt = null;
    ResultSet resultSet = null;
    
    public budsBean() {
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            connection = DriverManager.getConnection(databaseAddress, username, password);
            stmt = connection.createStatement();
        } catch(SQLException e){
                e.printStackTrace();
        }   
    }
    
    public void dropTables(){
        try{
            stmt.executeUpdate("DROP TABLE " + table1);
        } catch (SQLException e){
            System.out.println("Table" + table1 +  "does not exist");
        }
        
        try{
            stmt.executeUpdate("DROP TABLE " + table2);
        } catch (SQLException e){
            System.out.println("Table" + table2 +  "does not exist");
        }
        
        try{
            stmt.executeUpdate("DROP TABLE " + table3);
        } catch (SQLException e){
            System.out.println("Table" + table3 +  "does not exist");
        }
        
        try{
            stmt.executeUpdate("DROP TABLE " + table4);
        } catch (SQLException e){
            System.out.println("Table" + table4 +  "does not exist");
        }
    }
    
    public void createTables(){
        try{
            stmt.executeUpdate("CREATE TABLE " + table1 + " (custID NUMBER, fName VARCHAR2(20), lName VARCHAR2(20), address VARCHAR2(35), city VARCHAR2(20), phone NUMBER)");
            stmt.close();
            connection.close();	
        } catch (SQLException e){
            System.out.println("Table failed to create.<br/>");
        }
        
        try{
            stmt.executeUpdate("CREATE TABLE " + table2 + " (prodID NUMBER, description VARCHAR(50), price NUMBER(5,2))");
            stmt.close();
            connection.close();	
        } catch (SQLException e){
            System.out.println("Table failed to create.<br/>");
        }
        
        try{
            stmt.executeUpdate("CREATE TABLE " + table3 + " (ordID NUMBER, orderDate DATE, custID NUMBER, total NUMBER(5,2), shipDate DATE)");
            stmt.close();
            connection.close();	
        } catch (SQLException e){
            System.out.println("Table failed to create.<br/>");
        }
        
        try{
            stmt.executeUpdate("CREATE TABLE " + table4 + " (orderID NUMBER, itemID NUMBER, prodID NUMBER, price NUMBER(5,2), quantity NUMBER, total NUMBER(5,2))");
            stmt.close();
            connection.close();	
        } catch (SQLException e){
            System.out.println("Table failed to create.<br/>");
        }
    }
    
    public void insertData(){
        try{
            String sql = "INSERT INTO " + table1 + "(custID, fName, lName, address, city, phone) VALUES('" + custID + "','" + fName + "','" + lName + "','" + address + "','" + city + "','" + phone + "')"; 

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e){
            System.out.print("Error: " + e);
        }
        
        try{
            String sql = "INSERT INTO " + table2 + "(custID, fName, lName, address, city, phone) VALUES('" + prodID + "','" + description + "','" + price + "')"; 

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e){
            System.out.print("Error: " + e);
        }
        
        try{
            String sql = "INSERT INTO " + table3 + "(custID, fName, lName, address, city, phone) VALUES('" + orderID + "','" + orderDate + "','" + custID + "','" + total + "','" + shipDate + "')"; 

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e){
            System.out.print("Error: " + e);
        }
        
        try{
            String sql = "INSERT INTO " + table4 + "(custID, fName, lName, address, city, phone) VALUES('" + orderID + "','" + itemID + "','" + prodID + "','" + price + "','" + quantity + "','" + total + "')"; 

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e){
            System.out.print("Error: " + e);
        }
    }
    
    public ResultSet getResultSet(){
        try {
            DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
            connection = DriverManager.getConnection(databaseAddress,username,password);
            stmt = connection.createStatement();
            String sql = "SELECT * FROM " + table1;
            resultSet = stmt.executeQuery(sql);		
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }

        return resultSet;
    }	
}
