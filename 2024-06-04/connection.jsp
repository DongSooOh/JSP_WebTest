<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Database SQL</title>
	</head>
	<body>
		<%
			Connection conn = null;
			
			try {
				String url = "jdbc:mysql://localhost:3306/jspdb";
				String user = "root";
				String password = "1234";
				
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				out.println("데이터베이스 연결에 성공했습니다.");
			} catch (SQLException ex) {
				out.println("데이터베이스 연결에 실패했습니다.<br>");
				out.println("SQLException: " + ex.getMessage());
			} finally {
				if (conn != null)
					conn.close();
			}
		%>
	</body>
</html>