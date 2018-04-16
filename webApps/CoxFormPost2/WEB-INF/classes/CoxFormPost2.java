/*
	Andrew Cox
	Bellevue University
	Assignment 5.1
	CoxFormPost2.java
*/

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class CoxFormPost2 extends HttpServlet

{

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException {

		response.setContentType("text/html");

		String dogName = request.getParameter("dogName");
		String dogBreed= request.getParameter("dogBreed");
		String dogAge = request.getParameter("dogAge");

		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbc");
			Connection co =DriverManager.getConnection("jdbc:odbc:dsn","student1","pass");

			String sql="insert into data(dogName,dogBreed,dogAge)values(?,?,?)";
			PreparedStatement p=co.prepareStatement(sql);

			p.setString(1,dogName);
			p.setString(2,dogBreed);
			p.setString(3,dogAge);
			p.executeUpdate();

			co.commit();
			response.sendRedirect("CoxWeek5.html");
		}

		catch (Exception e) {

			System.out.println(e);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws IOException, ServletException {

		doPost (request,response);
	}
}