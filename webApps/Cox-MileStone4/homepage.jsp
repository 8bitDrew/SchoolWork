<!DOCTYPE html>
<html>
	<head>
		<title>Buds Duds</title>
		<meta charset="utf-8">
		<link href="budscss.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.io.*"%>
	<%@ page import="java.net.*"%>
		<header>
			<img src="META-INF/budslogo.jpg" width="200" height="204" alt="Buds Duds">
		</header>
		
		<div id="nav">
			<ul>
				<li>Home</li>
				<li><a href="dropTables.jsp">Drop Tables</a></li>
				<li><a href="createTables.jsp">Create Tables</a></li>
				<li><a href="getData.jsp">View Data</a></li>
				<li><a href="postData.jsp">Add Data</a></li>
			</ul>
		</div>
		
		<main>
			<p>Buds Duds</p>
			<p>Providing affordable kids clothing to Oz</p>
			<p>Choose an option above</p>
		</main>
		
		<footer>
			<span>Copyright&copy;2017 
			<a href="mailto:andrew.cox10@gmail.com">Andrew Cox</a></span></p>
		</footer>
		
	</body>
</html>