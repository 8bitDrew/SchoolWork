<!DOCTYPE html>
<html>
	<head>
		<title>Buds Duds</title>
		<meta charset="utf-8">
		<link href="budscss.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	<jsp usebean id="bean" class="myBean.budsBean" />
	<%@ page import="java.sql.*"%>
	<%@ page import="java.io.*"%>
	<%@ page import="java.net.*"%>
		<header>
			<img src="META-INF/budslogo.jpg" width="200" height="204" alt="Buds Duds">
		</header>
		
		<div id="nav">
			<ul>
				<li><a href="homepage.jsp">Home</a></li>
				<li><a href="dropTables.jsp">Drop Tables</a></li>
				<li><a href="createTables.jsp">Create Tables</a></li>
				<li>View Data</li>
				<li><a href="postData.jsp">Add Data</a></li>
			</ul>
		</div>
		
		<main>
			<%
			if(request.getMethod().equals("POST")){
				bean.insert();
				ResultSet result = null;
				result = bean.getResult();
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
		</main>
		
		<footer>
			<span>Copyright&copy;2017 
			<a href="mailto:andrew.cox10@gmail.com">Andrew Cox</a></span></p>
		</footer>
		
	</body>
</html>