package faq;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faq_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public faq_view() {
        
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		try {
			dbcon db =new dbcon();
			Connection con =db.cafe24();
			String idx =request.getParameter("idx");
			String sql ="select *from faq_board where fidx='"+idx+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			response.setContentType("Text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			
			//rs.next(): buffer와 통일하게 한번 코드 입력 시 값이 소멸함.
			if(rs.next()==false) {	//count로 값을 확인합니다. 단, select에 대한 where 부분에 
				pw.write("<script>"
						+ "alert('올바른 입력이 압닌다')"
						+ "history.go(-1);"
						+ "</script>");
			}
			else {
				String fidx = null;
				String fcate= null;
				String fwrite =null;
				String faq_qc =null;
				String faq_aw = null;
				String faq_view = null;
				
				while(rs.next()) {
					fidx =rs.getString("fidx");
					fidx =rs.getString("fcate");
					fidx =rs.getString("fwrite");
					fidx =rs.getString("faq_qc");
					fidx =rs.getString("faq_aw");
					fidx =rs.getString("faq_view");
				}
				request.setAttribute("fidx", fidx);
				request.setAttribute("fcate", fcate);
				request.setAttribute("fwrite", fwrite);
				request.setAttribute("faq_qc", faq_qc);
				request.setAttribute("faq_aw", faq_aw);
				request.setAttribute("faq_view", faq_view);
				
				response.setContentType("text/html;charset=utf-8");
				PrintWriter pr = response.getWriter();
				RequestDispatcher rd = request.getRequestDispatcher("/faq_view.jsp");
				rd.forward(request, response);
				
			}
		}
		catch(Exception e) {
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
