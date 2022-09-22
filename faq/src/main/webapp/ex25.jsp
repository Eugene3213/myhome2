<%@page import="java.net.InetAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lnag="ko">
<head>
<meta charset="UTF-8">
<title>JSP 5일 차 - 내장객체 설명</title>
</head>
<body>
<!-- 내장 객체 : JAVA 또는 import 또는 라이브러리 사용하지 않고 사용하는 명령어들 
	 전달 시 무조건 name 또는 get으로 보낼 경우 파라미터 이름으로 보내야 함.
	 
	 getParameter: 특정 name을 전달 받을 때 사용
	 getParameterValues: name값 전달 받지만 배열형태로 받음
	 getParameterNames: 모든 name을 다 가져 옴 (Enumeration) 객체 타입형태. String, int , double, float...(X) Enumeration으로 받아야 함
	 getParameterMap(): Map 객체 타입으로 전달 받는 형태. ("파라미터이름","값");
	 
	 [접속자 정보의 확인하는 경우]
	 getHeader("host"): 접속자에 대한 도메인 호스트 URL 및 포트번호
	 getHeader("accept-language"): 페이지 제작에 대한 언어패킷
	 getHeader("User-Agent"): 접속 기기를 확인할 때  사용
	 getRemoteAddr(), getRemoteHost(): 클라이언트 IP주소 확인
	 getRequestURI(): 도메인(X) URI 경로 및 페이명 출력
	 getMethod(): 전송방식 (GET,POST)
	 
	 response.sendRedirect(): 페이지 강제 이동
-->

<%
	request.setCharacterEncoding("utf-8");
	String a = request.getHeader("host");
	String b = request.getHeader("accept-language");
	String c = request.getHeader("User-Agent");
	String d = request.getRemoteAddr();
	String e = request.getRemoteHost();
	String f = request.getRequestURI();
	String g = request.getMethod();	//Servlet (Service)
	String h = request.getQueryString();		//파라미터 문자열을 가져옴
	response.sendRedirect("http://naver.com");
	out.print(h);
	
	InetAddress ia = InetAddress.getLocalHost();
	ia = InetAddress.getLocalHost();
	/*내장 객체는 아님 (import) - 본 서버에서 확인 가능함*/
%>
</body>
</html>