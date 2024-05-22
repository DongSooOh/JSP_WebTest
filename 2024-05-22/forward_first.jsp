<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Action Tag</title>
	</head>
	<body>
		<h3>이 파일은 forward_first.jsp입니다.</h3>
		<jsp:forward page="forward_second.jsp" />
		<p> ===forward_first.jsp의 페이지=== </p>
	</body>
</html>