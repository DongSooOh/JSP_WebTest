<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB_Connect</title>
	</head>
	<body>
		<%
			Connection conn = null;
		
			String url = "jdbc:mysql://localhost:3306/jspdb";
			String user = "root";
			String password = "1234";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		%>
	</body>
</html>