<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="./error.jsp" %>
<!-- errorPage: 코드 또는 DB 또는 Servlet등 다양한 오류 발생 ㅣ
	해당 페이지로 이동 시키게 됨.
	web.xml에  error 코드를 입력하여 페이지가 로드 되도록 설정함.
	<error-page>
  	<error-code>500</error-code>
  	<location>/error.jsp</location>
  </error-page> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일 차 - page 디렉티브</title>
</head>
<body>
	<%=(String)request.getParameter("test").toUpperCase() %>
</body>
</html>