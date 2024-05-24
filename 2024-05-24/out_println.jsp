<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Implicit Objects</title>
	</head>
	<body>
		<!-- HTML에서는 println 줄바꿈이 안 됨, newLine() 혹은 <br> 태그로 사용 -->
		<p>1번 코드</p>
		<%
			out.println("Hello!");
			out.println("Java Server Pages입니다.");
		%>
		
		<p>2번 코드</p>
		<%
			out.println("Hello!" + "<br>");
			out.println("Java Server Pages입니다.");
		%>
	</body>
</html>