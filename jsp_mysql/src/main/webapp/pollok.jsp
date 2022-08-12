<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 참여자 저장파일</title>
</head>
<body>
	<%@ include file ="./dbconnect.jsp" %>
	<%
		request.setCharacterEncoding("utf-8");
		String mname = request.getParameter("mname").replaceAll(" "," ");
		String mid = request.getParameter("mid").replaceAll(" "," ");
		String mtel = request.getParameter("mtel").intern();
		String mpoll = request.getParameter("mselect");
			out.print(mpoll);
		if(mtel.length() < 10){
			out.print("<script>alert('올바른 값이 아닙니다'); history.go(-1);</script>");
		}
		else{
			//한번만 참여 가능하도록 하는 확인 작업
			String sql = "select * from poll where pid='"+mid+"'";
			PreparedStatement ps = null;
			try{
				ps =con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if(rs.next()==true){
					out.print("<script>alert('이미 참여했습니다'); history.go(-1);</script>");
				}
				else{
					
				}
				
			}catch(Exception e){
				
			}finally{
				
			}
		}
	%>
	
</body>
</html>