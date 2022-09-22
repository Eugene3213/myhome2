<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="./config.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일 차 -데이터 처리</title>
</head>
<body>
<table border="1">
	<tr>
		<td>POST전송이름</td>
		<td>POST전송값</td>
	</tr>
	<% 
		Enumeration pm = request.getParameterNames(); 
		//Enumeration: 자료형 클래스이며, 배열 형태로 모든 값을 받을 때 사용(name 값에 한해서만 사용함)
		//gerParameterNames: 전송된 페이지에서 모든 name을 가져오는 부분
		//out.print(pm.nextElement());
		String bb = null;
		int j=0;
		while(pm.hasMoreElements()){	//hasMoreElements: 해당 자료형 클래스에 있는 모든 개체 요소를 가져올 때(=.. buffer)
			String aa = (String)pm.nextElement();	//name값 모두 확인하는 함수
			//out.print(aa);
			if(!aa.equals("userpw2")){	//==, != 사용하지 못함. intern을 사용ㅎ지 못하기 때문
				bb = request.getParameter(aa);
				request.setAttribute("code"+j, bb);	//디렉티브  태그로 변환하여 반복문 밖에서 출력할 때 사용
	%>
	<tr>
		<td><%=aa %></td>
		<td><%=bb %></td>
	</tr>
	<% 
			}
			j++;
		}
	%>
</table>
	<span>${code0 }</span>
</body>
</html>