<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일 차 - SQL연동(select)</title>
</head>
<body>
	<%@ include file ="dbconnect.jsp" %><!-- DB 접속환경 로드함 -->
	<%
		String sql = "select * from poll";	//SQL문법
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			//PreparedStatement: SQL 문법을 실행 시키는 클래스
			ResultSet rs = ps.executeQuery();
			//select에서만 ResultSet: 값을 받아서 처리하는 클래스
			while(rs.next()){ 	//SQL에 있는 데이터를 반복시킴
			//getString: 문자
			//getInt: 숫자
			//getBoolean: true, false
			//getfloat: ......
	%>
		<ul>
			<li>고유번호: <%=rs.getString("idx") %></li>
			<li>고객명: <%=rs.getString("pname") %></li>
			<li>고객아이디: <%=rs.getString("pid") %></li>
			<li>연락처: <%=rs.getString("ptell") %></li>
			<li>설문조사내용: <%=rs.getString("ptext") %></li>
			<li>참여일자: <%=rs.getString("pdate").substring(0,19) %></li>
		</ul>
	<%
			}
		}catch(Exception e){
			out.print("DB 연결 실패 및 테이블 오류");
		}finally{	//DB 연결 및ㅊ 출력 모두 완료 되면 DB 접속 해제
			if(con!=null){
				con.close();
			}
		}
	%>
</body>
</html>