<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Action Tag</title>
	</head>
	<body>
		<!-- id="person"에서 person은 참조변수 -->
		<jsp:useBean id="person" class="webtest.Person" scope="request" />
		<p> 아이디: <%= person.getId() %></p>
		<p> 이 름: <%= person.getName() %></p>
	</body>
</html>