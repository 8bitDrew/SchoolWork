<!--// Drew Cox
// CIS404 
// Bellevue University
// Assignment 7.1
-->

<!DOCTYPE html>
<html lang='en'>
<head>
<title>
Cox Week 7
</title>
<meta charset='utf-8'>
</head>
<body>
<jsp:useBean id="dog" class="myBean.CoxBean" />

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.net.*"%>

<%
	if(request.getMethod().equals("GET")){
		dog.getResult();
	}
%>

<form method='POST' action='CoxFormPost4.jsp'>
<h2>Dog Breeds</h2>
<table border='0'> 
	<tr> 
		<td> 
			<label>Dog Name:</label>  
		</td> 
		<td> 
			<input type='text' name='fname' size='35' maxlength='35' required/> 
		</td> 
	</tr> 
	<tr> 
		<td> 
			<label>Dog Breed:</label>  
		</td> 
		<td> 
			<input type='text' name='lname' size='35' maxlength='35' required/> 
		</td> 
	</tr> 
	<tr> 
		<td> 
			<label>Coat Color:</label>  
		</td> 
		<td> 
			<input type='text' name='lname' size='35' maxlength='35' required/> 
		</td> 
	</tr> 
			<input type='submit' value='Submit' /> 
			<input type='reset' value='Reset' /> 
		</td> 
	</tr> 
</table>
<jsp:setProperty name="dog" property="*"/>
</form>

<%
if(request.getMethod().equals("POST")){
	dog.insert();
	ResultSet result = null;
	result = dog.getResult();
	try{
		ResultSetMetaData meta = result.getMetaData();
		int colNumber = meta.getColumnCount();
		int counter = 1;
		out.println("<hr/>");
		out.println("<table border='0'>");
		while(result.next()){
			out.println("<tr><td colspan='2' bgcolor='lightgrey'>Record: "+counter+"</td></tr>");
			for (int i = 1; i <= colNumber; i++){
				//if(i > 1) out.print(", ");
				String colValue = result.getString(i);
				out.println("<tr><td>"+meta.getColumnName(i)  + ": </td><td>" + colValue +"</td></tr>");
			}
			counter++;
		}
		out.println("</table>");
	}
	catch (SQLException s){
		out.println("<i>Failed to select data<i><br/>");
	}
}
%>
</body>
</html>