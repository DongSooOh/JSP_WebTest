<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Exception</title>
	</head>
	<body>
		<%
			try {
				String num1 = request.getParameter("num1");
				String num2 = request.getParameter("num2");
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				int c = a / b;
				out.print(a + " / " + b + " = " + c);
			} catch (NumberFormatException e) {
				/* 
				  ★	RequestDispatcher dispatcher = request.getRequestDispatcher("tryCatch_error.jsp");
					dispatcher.forward(request, response);
					
					Java Servlet에서 사용되는 코드로, RequestDispatcher를 사용하여 
					현재 요청을 다른 서블릿이나 JSP 페이지로 전달하는 방법

					getRequestDispatcher("tryCatch_error.jsp"): 현재 요청을 처리하는 서블릿이나 JSP 페이지 중 하나인
					"tryCatch_error.jsp"로부터 RequestDispatcher 객체를 가져옴
					
					dispatcher.forward(request, response): 이전 단계에서 가져온 RequestDispatcher를 사용하여
					현재 요청(request)과 응답(response)을 "tryCatch_error.jsp"로 전달합니다. 이것은 현재 서블릿의 실행을 중단하고
					"tryCatch_error.jsp"로 제어를 넘김 그 후 "tryCatch_error.jsp"에서 요청을 처리하고 응답을 생성
	
					따라서 위의 코드는 
					현재 서블릿에서 "tryCatch_error.jsp"로 제어를 전달하여, 
					이후의 요청 처리와 응답 생성을 "tryCatch_error.jsp"에서 처리
				*/
				RequestDispatcher dispatcher = request.getRequestDispatcher("tryCatch_error.jsp");
				dispatcher.forward(request, response);
			}
		%>
	</body>
</html>