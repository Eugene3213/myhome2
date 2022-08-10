package reviews;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;

import javax.mail.MultipartDataSource;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig( //파일 업로드 기능 처리시 사용되는 어노테이션 속성
		
		fileSizeThreshold = 1024 * 1024 *1, //업로드에 사용되는 메모리 용량
		maxFileSize= 1024*1024*2, //업로드파일 최대크기
		maxRequestSize = 1024*1024*2 //전송에 따른 최대크기
	)

public class review_board extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public review_board() {

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//HTML에서 enctype을 확인함
		//String enctype =request.getMethod(); //FORM POST형태
		String enctypec = request.getContentType();	//enctype
		String uname = null;
		String pname = null;
		String rd = null;
		String prd_txt = null;
		String filename = null;
		String path = null;
		String upload = null;
		String url = null;
		String url2 = null;
		
		if(enctypec.equals("application/x-www-form-urlencoded")){
			uname = request.getParameter("uname");
			pname = request.getParameter("pname");
			rd = request.getParameter("rd");
			prd_txt = request.getParameter("prd_txt");
		}
		else {
			//URLDecoder.decode : multipart/form-data 역해석
			uname = URLDecoder.decode(request.getParameter("uname"),"UTF-8");
			pname = URLDecoder.decode(request.getParameter("pname"),"UTF-8");
			rd = URLDecoder.decode(request.getParameter("rd"),"UTF-8");
			prd_txt = URLDecoder.decode(request.getParameter("rd"),"UTF-8");
			Part part = request.getPart("file");
			filename = part.getSubmittedFileName().intern();
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pr = response.getWriter();
		config cff = new config();
		String indate = cff.nowtimer();
		String outdate = "0001-01-01 01:00:00";
		if(filename=="") {
			url2 = null;
		}
		else {
			path = request.getServletContext().getRealPath("");
			upload = path + "upload/";	//실제 저장 공간
			
			
			url = upload + filename;
			//url2 = url.replace("/leejongh/tomcat/webapps", ".");//DB경로
			
			for(Part p : request.getParts()) {
				p.write(upload + filename);
			}
		}
		String [] data = {"pd_review",uname,pname,rd,prd_txt,indate,outdate,url};
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(data)); 
		config cf = new config();
		String sign = cf.insert(ar).intern();
		if(sign=="ok") {
			pr.write("<script>alert('리뷰등록 완료'); location.href='./index.do';</script>");
		}
		else {
			pr.write("<script>alert('리뷰등록 오류'); history.go(-1);</script>");
		}
	
	}

}
