<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Database SQL</title>
	</head>
	<body>
		<%@ include file = "dbconn.jsp" %>
		
		<%
			request.setCharacterEncoding("utf-8");
		
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			
			Statement stmt = null;
			
			try {
				String sql = "INSERT INTO Member(id, passwd, name) VALUES('" + id + "', '" + passwd + "', '" + name + "')";
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				out.println("Member 테이블 삽입에 성공했습니다.");
			} catch (SQLException ex) {
				out.println("Member 테이블 삽입에 실패했습니다.<br>");
				out.println("SQLException: " + ex.getMessage());
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		%>
	</body>
</html>