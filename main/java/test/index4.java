package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class index4 extends HttpServlet {
	PrintWriter pr =null;
	private static final long serialVersionUID = 1L;
       
    public index4(){
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
			//System.out.println(request.getMethod());
			//request.getMethod(): html에서 PSOT,GET,PUT 확인이 가능함
		String m =request.getParameter("userid").intern();
		this.pr = response.getWriter();
		if(m=="") {
			this.pr.print("error");
			//this.pr.print: ajax post, get으로 넘어올 때 응답만 받아야 할 경우
		}
		else if(m=="hong"){		//아이디가 중복 되었을 때 ajax return
			this.pr.print("no");
		}
		else {		//아이디가 중복 되지 않았을 때 ajax return
			this.pr.print("ok");
		}
	}

}
