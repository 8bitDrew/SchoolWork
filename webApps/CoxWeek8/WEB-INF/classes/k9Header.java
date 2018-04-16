/*
	Andrew Cox
	Assignment 8.1
	17 Oct 2017
	Bellevue University
*/

package myTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.sql.*;

public class k9Header extends TagSupport{
	
	private String table;
	
	public void setTable(String table){
		this.table = table;
	}
	
	public int doTag() throws JspException{
		JspWriter out = pageContext.getOut();
		
		// display the Customers table data
		try{		
			// open connection to database
			DriverManager.registerDriver (new oracle.jdbc.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","student1","pass");
			
			// select all from table and return result set
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM " + table);
			ResultSet resultSet = ps.executeQuery();
			
			// while there is data left in the result set, print them to the screen
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int colNumber = rsmd.getColumnCount();
			while(resultSet.next()){
				for (int i = 1; i <= colNumber; i++){
					String colValue = resultSet.getString(i);
					out.print(rsmd.getColumnName(i)  + ": " + colValue +"<br/>");
				}
				out.println("<br/>");
				out.println("**************<br/><br/>");
			}
			
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Error: failed to select data"); // error prints to tomcat's console screen
		}
		
		return SKIP_BODY;
	}
}
