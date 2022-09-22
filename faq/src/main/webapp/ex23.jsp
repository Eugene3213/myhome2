<%@page import="faqprocess.ex23"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일 차 - JAVA 파일 load</title>
</head>
<body>
<%
	/* 권장사항은 아님: 기본 지식정도로 알고 있으면 됨 */
	//ex23 ex = new ex23();
	//ex.inname();
%>
<!-- useBean: JAVA 파일에 대한 Class를 로드할 때 사용하는 jsp 태그 -->
	<jsp:useBean id="abc" class="faqprocess.ex23" scope="request">
	<%	//abc.inname(); 
		abc.inname2("강감찬","골드회원");
	%>
		request.setCharacterEncoding("utf-8");
	</jsp:useBean>
	<p>고객명: <%=abc.names() %></p>
	<p>고객등급: <%=abc.level() %></p>
	<jsp:include page="ex23_1.jsp">
		<jsp:param value="<%=abc.names() %>" name="person"/>
	</jsp:include>
	
</body>
</html>