<!--// Drew Cox
// CIS404 
// Bellevue University
// Assignment 8.1
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
if (request.getMethod().equals("POST")){
	dog.insert();
%>
<!-- Import TLD tag-->
<%@ taglib uri="/WEB-INF/tag/k9Header.tld" prefix="tag" %>
<!-- display records tag -->
<tag:k9HeaderTag table="DOGBREED" />

<%	
}
%>

</body>
</html>