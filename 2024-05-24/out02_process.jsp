<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Implicit Objects</title>
	</head>
	<body>
		<!-- getParameter("A"): A는 문자열 객체의 주소값 -->
		<%
			request.setCharacterEncoding("utf-8");
			String userid = request.getParameter("id");
			String userpw = request.getParameter("passwd");
		%>
		<p>아이디: <% out.println(userid); %></p>
		<p>비밀번호: <% out.println(userpw); %></p>
	</body>
</html>