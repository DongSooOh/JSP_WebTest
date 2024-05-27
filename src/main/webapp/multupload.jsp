<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath} }" />

<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="${contextPath}/multupload.do" method="post" enctype="multipart/form-data">
			<회원가입 양식><br>
			이름: <input type="text" name="m_name"><br>
			별명: <input type="text" name="m_nickname"><br>
			사진: <input type="file" name="m_file"><br>
			<input type="submit" value="전송">
		</form>
	</body>
</html>