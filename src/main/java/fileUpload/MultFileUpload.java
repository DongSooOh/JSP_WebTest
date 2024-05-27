/*
 * package fileUpload;
 * 
 * import java.io.IOException; import java.util.Enumeration;
 * 
 * import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.oreilly.servlet.MultipartRequest; import
 * com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
 * 
 * @WebServlet("/multupload.do") public class MultFileUpload extends HttpServlet
 * { private static final long serialVersionUID = 1L;
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String savePath =
 * "C:\\file_repo"; int sizeLimit = 1024*1024*15;
 * 
 * MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit,
 * "utf-8", new DefaultFileRenamePolicy());
 * 
 * Enumeration formNames = multi.getFileNames();
 * 
 * String formName = (String) formNames.nextElement();
 * 
 * String fileName = multi.getFilesystemName(formName);
 * 
 * if (fileName == null) { System.out.println("파일 업로드 되지 않았음"); } else {
 * fileName = new String(fileName.getBytes("8859_1"), "utf-8");
 * System.out.println("User Name: " + multi.getParameter("m_name") + " ");
 * System.out.println("Form Name: " + formName);
 * System.out.println("File Name: " + fileName); } }
 * 
 * }
 */