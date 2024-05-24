<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Form Processing</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<th>요청 파라미터 이름</th>
				<th>요청 파라미터 값</th>
			</tr>
			<%
				request.setCharacterEncoding("utf-8");
			
				Enumeration paramNames = request.getParameterNames();
				while (paramNames.hasMoreElements()) {
					String name = (String) paramNames.nextElement();
					out.print("<tr><td>" + name + " </td>\n");
					String paramValue = request.getParameter(name);
					out.println("<td> " + paramValue + "</td></tr>\n");
				}
			%>
		</table>
	</body>
</html>
<!-- Enumeration paramNames = request.getParameterNames(): 모든 파라미터 이름들을 Enumeration 객체로 반환, iteration을 통해 순차적 접근 -->
<!-- while (paramNames.hasMoreElements()): Enumeration 객체에 더 이상 요소가 없을 때까지 반복문 실행(모든 파라미터 이름들을 처리할 때까지 반복) -->
<!-- String name = (String) paramNames.nextElement(): Enumeration 객체에서 다음 요소를 가져오고 name 변수에 저장, Object 타입을 String형으로 변환 -->
<!-- out.print("<tr><td>" + name + " </td>\n"): 새로운 행('<tr>')과 첫 번째 열('<td>')에 파라미터 출력, 이름은 '<td>'태그 안에 출력 -->
<!-- String paramValue = request.getParameter(name): 파라미터 이름에 해당하는 값 반환, name은 파라미터 이름, 값은 paramValue 변수에 저장 -->
<!-- out.println("<td> " + paramValue + "</td></tr>\n"): 두 번째 열('<td>')에 현재 파라미터 값을 출력, 테이블 행을 닫는 태그('</tr>')와 함께 출력 -->