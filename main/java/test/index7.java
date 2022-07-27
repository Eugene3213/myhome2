package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index7 extends HttpServlet {
	PrintWriter pr =null;
	private static final long serialVersionUID = 1L;
       
 
    public index7() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String msg = "<script>\r\n"
				+ "alert('test');\r\n"
				+ "</script>";
		String mid =request.getParameter("mid").intern();
		String mpw =request.getParameter("mpw").intern();
		this.pr = response.getWriter();
		
		if(mid=="kim") {
			if(mpw=="a123456") {
				this.pr.print("<script>alert('로그인 하셨습니다.');history.go(-1);</script>");
			}
			else {
				this.pr.print("<script>alert('아이디와 패스워드를 다시 확인하세요');history.go(-1);</script>");
			}
		}
		else {
			this.pr.print("<script>alert('아이디와 패스워드를 확인하세요');history.go(-1);</script>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
