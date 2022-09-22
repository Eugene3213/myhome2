package faq;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class faq_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public faq_update() {


    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw =response.getWriter();
		try {
			dbcon db =new dbcon();
			Connection con =db.cafe24();
			String idx = request.getParameter("fidx");
			String fcate = request.getParameter("fcate");
			String faq_qc = request.getParameter("faq_qc");
			String faq_aw2 = request.getParameter("faq_aw2");
			String faq_view = request.getParameter("faq_view").intern();
			if(faq_view=="" || faq_view==null) {
				faq_view="N";
			}
			String sql = "update faq_board set fcate='"+fcate+"',faq_qc='"+faq_qc+"',faq_qw='"+faq_aw2+"'where fidx='"+idx+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			int n =0;
			n= ps.executeUpdate();
			if(n>0) {
				pw.print("<script>"
						+"alert('FAQ 수정이 완료 되었습니다.');"
						+"location.href='./faq_list.html';"
						+"</script>");
			}
			else {
				throw new Exception("error");
			}
			con.close();
		}
		catch(Exception e) {
			pw.print("<script>"
					+"alert('올바른 접근이 아닙니다'"
					+ "history(-1)"
					+ "</script>");
		}
	}

}
