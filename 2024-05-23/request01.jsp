<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Implicit Objects</title>
	</head>
	<body>
		<!-- form은 백엔드로 값을 전달, post는 노출x, get은 키.값으로 전달하여 노출 -->
		<form action="request01_process.jsp" method="post">
			<!-- 여기서 name은 식별자 -->
			<p> 아이디: <input type="text" name="id">
			<p> 비밀번호: <input type="text" name="passwd">
			<p> <input type="submit" value="전송" />
		</form>
	</body>
</html>