<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<%
	Connection con = null;
	try{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://umj7-016.cafe24.com/parkyj3089";
		String user = "parkyj3089";
		String userpw = "fuckyj33";
		Class.forName(driver);
		
		con = DriverManager.getConnection(url, user,userpw);
		out.print("DB 접속 성공");
		
	}catch(Exception e){
		e.getMessage();
	}

%>
