/*	Andrew Cox
	Bellevue University
	Assignment 4.1
	CoxFormPost.java
*/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

@WebServlet(name = "CoxFormPost", urlPatterns = { "/CoxFormPost" })

public class CoxFormPost extends HttpServlet {
	
	private String target = "localhost:8080";

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{

		PrintWriter out = response.getWriter();
		printHeader(out);
		printForm(out);
		printFooter(out);
	}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
                    ServletException, IOException{
                        
        String newLine = "\n";
        String data = null;
        
		//Declaring where to write to
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:/temp/CoxWeek4.dat", "rw");
        
        //StringBuffer to write to the file
        StringBuffer buffer = new StringBuffer();    
        
		//Setting some values and getting parameters
        buffer.append("Dog Name:");
        buffer.append(request.getParameter("dogName"));
        buffer.append(newLine);
        buffer.append("Dog Breed:");
        buffer.append(request.getParameter("dogBreed"));
        buffer.append(newLine);
        buffer.append("Coat Color:");
        buffer.append(request.getParameter("coatColor"));
        buffer.append(newLine);

        response.setContentType("text/html");

        PrintWriter output = response.getWriter();

        printHeader(output);
        printForm(output);
        
        //Write it!
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.writeChars(buffer.toString());
        randomAccessFile.seek(0);
        
        //Read it!
        while((data = randomAccessFile.readLine()) != null){
            output.println(data + "<br />");
        }

        printFooter(output);
	}

	public void printHeader(PrintWriter out){

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Form Post & Get");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
	}
	
	public void printForm(PrintWriter output){ 
	
		//Show the form so we can get that data!
        output.println("<form method='post' action='CoxFormPost'>");    
        output.println("<label>Dog Name</label>");
        output.println("<input type='text' name='dogName' size='20' maxlength='20' />");
        output.println("<br />");
        output.println("<label>Dog Breed</label>");
        output.println("<input type='text' name='dogBreed' size='20' maxlength='20' />");
        output.println("<br />");
		output.println("<label>Coat Color</label>");
        output.println("<input type='text' name='coatColor' size='20' maxlength='20' />");
		output.println("<input type='submit' />");
        output.println("</form>");
        output.println("<hr />");
	}

	public void printFooter(PrintWriter out){

		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}