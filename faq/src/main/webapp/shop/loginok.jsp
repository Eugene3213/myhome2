<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<% String mid = request.getParameter("mid"); %>
	<% String mpass = request.getParameter("mpass"); %>
	
	<% 
		if(mid.equals("hong") && mpass.equals("hong1234")){ 
	%>
		<%@ include file="./index.jsp" %>
	<% 
		}else{ 	
	%>
		 <% alert("회원정보를 다시 확인하세요");%>
		 	
	<% }%>
</body>
</html>