<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일 차 - 기초문법 </title>
</head>
<body>
	<%-- <%(JSP시작)%>(JSP종료)--%>
	<%--<%!.....%> : 자바 변수나 메소드를 정의 할 때 사용 --%>
	<%--<%=...%> : 해당 값을 출력하는 문자열, 숫자등 사용 --%>
	<%--<%@...%> : 페이지 속성 지정, 외부 페이지를 로드 할 수 있음 --%>
<%@ include file="ex02.jsp" %>

<!-- JAVA -->
<%!
	int a;
	int b;
	public int sum(int aa,int bb){
		return aa+bb;
	}
%>
<!--  JSP -->
<%
	a= 20;
	b= 10;
	out.print(sum(a,b)); 	//out.print : JSP 출력 파트 
%>

<!--  JSP문법만 사용 -->
	<ul>
	<% for(int i=0; i<9; i++){ %>
		<li><%=i %></li>
		<% } %>
	</ul>
</body>
</html>












