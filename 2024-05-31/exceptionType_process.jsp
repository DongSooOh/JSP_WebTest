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
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			int a = Integer.parseInt(num1);
			int b = Integer.parseInt(num2);
			int c = a / b;
			out.println(a + " / " + b + " = " + c + "<br>");
		%>
		<%
			String num3 = request.getParameter("num3");
			String num4 = request.getParameter("num4");
			double d = Double.parseDouble(num3);
			double e = Double.parseDouble(num4);
			double f = d / e;
			out.print(d + " / " + e + " = " + f);
		%>
	</body>
</html>