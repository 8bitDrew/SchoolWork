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
				<li><a href="getData.jsp">View Data</a></li>
				<li>Add Data</li>
			</ul>
		</div>
		
		<main>
			<form action="/ServletJspDemo" method="post">
				<div align="center">
				Customer ID: <input type="text" size="20" name="custID"/>
				<br><br>
				Customer Name: <input type="text" size="20" name="custName"/>
				<br><br>
				Address: <input type="text" size="20" name="address"/>
				<br></br>
				City: <input type="text" size="20" name="city"/>
				<br></br>
				Phone: <input type="text" size="20" name="phone"/>
				<br></br>
				<input type="submit" value="insert" />
				<div>
			</form>
		</main>
		
		<footer>
			<span>Copyright&copy;2017 
			<a href="mailto:andrew.cox10@gmail.com">Andrew Cox</a></span></p>
		</footer>
		
	</body>
</html>