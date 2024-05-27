package fileUpload;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

// import org.apache.commons.fileupload.*;

@WebServlet("/fileupload03_process.do")
public class Fileupload03_process extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아래 코드 숙지해야 함!
		String encoding = "utf-8";
		
		File fileUploadPath = new File("C:\\file_repo");
		
		// DiskFileUpload upload - new DiskFileUpload();
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(fileUploadPath);
		factory.setSizeThreshold(1024 * 1024);
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List items = upload.parseRequest(request);
			Iterator params = items.iterator();
			
			while (params.hasNext()) {
				FileItem fileItem = (FileItem) params.next();
				
				if (!fileItem.isFormField()) {
					String fileName = fileItem.getName();
					fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
					File file = new File(fileUploadPath + "/" + fileName);
					fileItem.write(file);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
