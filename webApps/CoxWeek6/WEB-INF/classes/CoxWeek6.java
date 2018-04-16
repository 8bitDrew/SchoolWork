package com.post;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoxWeek6 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException {

	}

	/**

	* handles HTTP POST request

	*/

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException {

		response.setContentType ("text/html");
		PrintWriter pw=response.getWriter ();
		String employeeno = request.getParameter("empno");//getting details from jsp page
		String ename = request.getParameter("ename");//getting details from jsp page
		String empsal = request.getParameter("sal");//getting details from jsp page
		int empno = Integer.parseInt(employeeno);//convert into integer
		int sal = Integer.parseInt(empsal); //convert into integer

		//exception handling
		try
		{
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver ());
			Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:8080","student1","pass");//dsn value=chegg username =scott password=tiger
			PreparedStatement ps=con.prepareStatement ("insert into employee values (?,?,?)");
			ps.setInt (1, empno);
			ps.setString (2, ename);
			ps.setFloat (3, sal);
			int i=ps.executeUpdate ();
			pw.println ("<h4>"+i+" Empdetails are succesfully INSERTED...");
			con.close ();
		}

		catch (Exception e)
		{
			response.sendError (503, "PROBLEM IN DATABASE...");
		}

		finally {

		}
	}
}