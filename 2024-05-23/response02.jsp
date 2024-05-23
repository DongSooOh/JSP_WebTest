<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Implicit Objects</title>
	</head>
	<body>
		<p>이 페이지는 5초마다 새로고침됩니다.</p>
		<!-- setIntHeader(String name, int value): 설정한 헤더 이름 name에 정수 값 value를 설정 
		여기서 매개변수로 ("Refresh", 초)를 할당함 -->
		<%
			response.setIntHeader("Refresh", 5);
		%>
		<p><%=(new java.util.Date()) %></p>
	</body>
</html>