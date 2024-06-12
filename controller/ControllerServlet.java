package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.LoginBean;

public class ControllerServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("passwd");
		
		LoginBean bean = new LoginBean();
		bean.setId(id);
		bean.setPassword(password);
		request.setAttribute("bean", bean);
		
		boolean status = bean.validate();
		
		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("../2024-06-12/mvc_success.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("../2024-06-12/mvc_error.jsp");
			rd.forward(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
