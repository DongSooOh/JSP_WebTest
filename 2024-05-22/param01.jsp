<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Action Tag</title>
	</head>
	<body>
		<h3>param Action Tag</h3>
		<jsp:forward page="param01_data.jsp">
			<!-- encode: 암호화 -->
			<jsp:param name="id" value="admin" />
			<jsp:param name="name" value='<%=java.net.URLEncoder.encode("관리자") %>' />
		</jsp:forward>
		<p>Java Server Page</p>
	</body>
</html>