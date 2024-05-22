<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives Tag</title>
</head>
<body>
	<!-- ★ isELIgnored="true"일 경우 표현언어 출력, "false"일 경우 표현식 출력  -->
	
	<!-- 이하 표현식 -->
	<%
		request.setAttribute("RequestAttribute", "request 내장 객체");
	%>
	<!-- 이하 표현언어  -->
	${requestScope.RequestAttribute}
</body>
</html>