<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일 차  - 값 받기(POST)</title>
</head>
<body>
	<%request.setCharacterEncoding("UTF-8"); 
	//POST로 전송시는 해당 문법을 사용
	//GET 전송 시는 server.xml에 URIEncoding="UTF-8" 사용 시 encoding 하지 않아도 한글이 깨지지 않음%>	
	<%=request.getParameter("mid") %>
</body>
</html>