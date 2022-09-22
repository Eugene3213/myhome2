<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./config.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일 차- 기본문법 형태(날짜 출력) </title>
</head>
<body>
	<%
		Date day=new Date();	//현재 날짜 KST:한국시간  UST:미국시간
			out.print(day);
		int h = day.getHours();
		int m = day.getMinutes();
		int s = day.getSeconds();
			out.print(h+"시"+m+"분"+s+"초"+"<br>");
		//int y = day.getYear();	//2000년 이상에서 버그 생김
		int y = day.getYear()+1900;	//1900 붙이는 이유는 2000년도 이상 년도에 적용하기 위함
		int mm = day.getMonth()+1;	//월
		int w = day.getDate();		//일
		int d = day.getDay();		//요일
			out.print(y+"<br>");
			out.print(mm+"<br>");
			out.print(d+"<br>");
	%>
</body>
</html>