<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!-- 
contentType="text/html; charset=UTF-8" : HTML에서 JSP페이지를 적용할 때 코드라인을 사용하지 않아도 무방함
 
 text/html: html에서 JSP출력
 text/xml: xml로 변환
 text/plain: 코드가 전부 출력
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일 차 - 반복문 1</title>
</head>
<body>
	<%
		int f;
		for(f=1; f<6; f++){
	%>
	<input type="radio" name="rd" id="rd<%=f %>">설문조사<%=f %>
	<%
		}
	%>
	<br><br>
	
	<input type="checkbox" value="">전체선택<br>
	<%
		int a=1;
		while(a<7){
	%>
	<input type="checkbox" name="ck" id="ck<%=a %>" value="">체크<%=a %><br>
	<%
		a++;
		}
	%>
	<br><br>
	
	<select>
		<option value="">메뉴를 선택해 주세요</option>
		<%
			int ww=0;
			do{
		%>
			<option value="<%=ww %>">메뉴<%=ww %>
		<% 
			ww++;
			}while(ww<6);
		%>				
	</select>
	
</body>
</html>