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

// 매핑네임 '/download.do'로 호출하면 어노테이션으로 응답하여 코드 실행
@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	
	// <form> 메소드가 get 방식이면 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 매개변수로 받은 request, response를 매개변수로 하여 doHandle 메소드 호출
		doHandle(request, response);
	}

	// <form> 메소드가 post 방식이면 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 매개변수로 받은 request, response를 매개변수로 하여 doHandle 메소드 호출
		doHandle(request, response);
	}
	// doGet() 메소드와 doPost() 메소드 호출 시 doHandle() 메소드 실행
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request 객체의 setCharacterEncoding() 메소드를 호출하여 'utf-8'을 매개변수로 주어 인코딩 설정
		request.setCharacterEncoding("utf-8");
		
		// response 객체의 setContextType() 메소드를 호출하여 'text/html; charset=utf-8'을 매개변수로 주어 설정 
		response.setContentType("text/html; charset=utf-8");
		
		// "C:\\file_repo" 해당 경로를 문자열형 file_repo 객체에 대입
		String file_repo = "C:\\file_repo";
		// fileName을 매개변수로 주면서 request 객체의 getParameter() 메소드를 호출하여 값을 가져오고 이를 문자열형으로 형변환 후 문자열형 fileName 객체에 대입  
		String fileName = (String) request.getParameter("fileName");
		// System 클래스의 println() 메소드를 호출하여 fileName을 출력 
 		System.out.println("fileName= " + fileName);
		
 		// response 객체의 getOutputStream() 메소드를 호출하여 OutputStream 타입의 out 객체에 대입
		OutputStream out = response.getOutputStream();
		// file_repo(경로) + "\\" + fileName(파일명) = ex) 'C:\\file_repo\\dog.jpg'를 문자열형인 downFile 객체에 대입
		String downFile = file_repo + "\\" + fileName;
		
		// new예약어를 이용하여 downFile을 매개변수로 주면서 File 객체 f에 대입 
		File f = new File(downFile);
		// set()을 이용하여 response 객체의 Header에 "Cache-Control" 속성의 값을 "no-cache"로 설정
		response.setHeader("Cache-Control", "no-cache");
		// add()를 이용하여 response 객체의 Header에 "Content-disposition" 속성의 값을 attachment로 설정 후 fileName=" + fileName로 파일명 지정
		response.addHeader("Content-disposition", "attachment; fileName=" + fileName);
		
		// f를 매개변수로 던져주면서 new예약어를 사용해 FileInputStream 생성자를 호출하여 나온 데이터를 in에 대입
		FileInputStream in = new FileInputStream(f);
		// new 예약어를 사용해 8KB 크기의 byte형 배열을 생성 후 buffer에 대입
		byte[] buffer = new byte[1024 * 8];
		// while 반복문 사용하여 처리
		while (true) {
			// FileInputStream 타입의 변수 in에 buffer를 매개변수로 주면서 read() 메소드를 호출하여 나온 값을 정수 타입형 count에 대입
			int count = in.read(buffer);
			// 만약 count가 -1이면 buffer에 읽을 수 있는 파일이 없어서 도달 
			if (count == -1)
				// 가장 가까운 반복문(여기서 while)을 나감
				break;
			// out 객체의 write()를 사용하여 buffer의 0번째 인덱스부터 count번째 인덱스까지 출력(실제로 읽은 파일의 길이)
			out.write(buffer, 0 , count);
		}
		// 나중에 생성한 입력 스트림 in 객체를 먼저 닫아줌
		in.close();
		// 먼저 생성한 출력 스트림 out 객체를 나중에 닫아줌
		out.close();
	}
}
