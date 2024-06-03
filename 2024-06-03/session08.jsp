<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Session</title>
	</head>
	<body>
		<%
			String session_id = session.getId();
			
			// getLastAccessedTime(): 세션이 마지막으로 클라이언트에 의해 접근된 시간을 반환
			long last_time = session.getLastAccessedTime();
			
			// getCreationTime(): 세션이 생성된 시간을 반환
			long start_time = session.getCreationTime();
			
			long used_time = (last_time - start_time) / 60000;
			
			out.println("세션 아이디: " + session_id + "<br>");
			out.println("요청 시작 시각: " + start_time + "<br>");
			out.println("요청 마지막 시각: " + last_time + "<br>");
			out.println("웹 사이트의 경과 시간: " + used_time + "<br>");
		%>
	</body>
</html>