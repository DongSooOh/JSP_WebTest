package fileUpload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���γ��� '/download.do'�� ȣ���ϸ� ������̼����� �����Ͽ� �ڵ� ����
@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	
	// <form> �޼ҵ尡 get ����̸� ȣ��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �Ű������� ���� request, response�� �Ű������� �Ͽ� doHandle �޼ҵ� ȣ��
		doHandle(request, response);
	}

	// <form> �޼ҵ尡 post ����̸� ȣ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �Ű������� ���� request, response�� �Ű������� �Ͽ� doHandle �޼ҵ� ȣ��
		doHandle(request, response);
	}
	// doGet() �޼ҵ�� doPost() �޼ҵ� ȣ�� �� doHandle() �޼ҵ� ����
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request ��ü�� setCharacterEncoding() �޼ҵ带 ȣ���Ͽ� 'utf-8'�� �Ű������� �־� ���ڵ� ����
		request.setCharacterEncoding("utf-8");
		
		// response ��ü�� setContextType() �޼ҵ带 ȣ���Ͽ� 'text/html; charset=utf-8'�� �Ű������� �־� ���� 
		response.setContentType("text/html; charset=utf-8");
		
		// "C:\\file_repo" �ش� ��θ� ���ڿ��� file_repo ��ü�� ����
		String file_repo = "C:\\file_repo";
		// fileName�� �Ű������� �ָ鼭 request ��ü�� getParameter() �޼ҵ带 ȣ���Ͽ� ���� �������� �̸� ���ڿ������� ����ȯ �� ���ڿ��� fileName ��ü�� ����  
		String fileName = (String) request.getParameter("fileName");
		// System Ŭ������ println() �޼ҵ带 ȣ���Ͽ� fileName�� ��� 
 		System.out.println("fileName= " + fileName);
		
 		// response ��ü�� getOutputStream() �޼ҵ带 ȣ���Ͽ� OutputStream Ÿ���� out ��ü�� ����
		OutputStream out = response.getOutputStream();
		// file_repo(���) + "\\" + fileName(���ϸ�) = ex) 'C:\\file_repo\\dog.jpg'�� ���ڿ����� downFile ��ü�� ����
		String downFile = file_repo + "\\" + fileName;
		
		// new���� �̿��Ͽ� downFile�� �Ű������� �ָ鼭 File ��ü f�� ���� 
		File f = new File(downFile);
		// set()�� �̿��Ͽ� response ��ü�� Header�� "Cache-Control" �Ӽ��� ���� "no-cache"�� ����
		response.setHeader("Cache-Control", "no-cache");
		// add()�� �̿��Ͽ� response ��ü�� Header�� "Content-disposition" �Ӽ��� ���� attachment�� ���� �� fileName=" + fileName�� ���ϸ� ����
		response.addHeader("Content-disposition", "attachment; fileName=" + fileName);
		
		// f�� �Ű������� �����ָ鼭 new���� ����� FileInputStream �����ڸ� ȣ���Ͽ� ���� �����͸� in�� ����
		FileInputStream in = new FileInputStream(f);
		// new ���� ����� 8KB ũ���� byte�� �迭�� ���� �� buffer�� ����
		byte[] buffer = new byte[1024 * 8];
		// while �ݺ��� ����Ͽ� ó��
		while (true) {
			// FileInputStream Ÿ���� ���� in�� buffer�� �Ű������� �ָ鼭 read() �޼ҵ带 ȣ���Ͽ� ���� ���� ���� Ÿ���� count�� ����
			int count = in.read(buffer);
			// ���� count�� -1�̸� buffer�� ���� �� �ִ� ������ ��� ���� 
			if (count == -1)
				// ���� ����� �ݺ���(���⼭ while)�� ����
				break;
			// out ��ü�� write()�� ����Ͽ� buffer�� 0��° �ε������� count��° �ε������� ���(������ ���� ������ ����)
			out.write(buffer, 0 , count);
		}
		// ���߿� ������ �Է� ��Ʈ�� in ��ü�� ���� �ݾ���
		in.close();
		// ���� ������ ��� ��Ʈ�� out ��ü�� ���߿� �ݾ���
		out.close();
	}
}
