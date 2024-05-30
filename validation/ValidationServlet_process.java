package validation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validationServlet_process.do")
public class ValidationServlet_process extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        String id = request.getParameter("id");
        String passwd = request.getParameter("passwd");

        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset='UTF-8'>");
        response.getWriter().println("<title>Validation</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h3>입력에 성공했습니다.</h3>");
        response.getWriter().println("<p> 아이디: " + id + "</p>");
        response.getWriter().println("<p> 비밀번호: " + passwd + "</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
