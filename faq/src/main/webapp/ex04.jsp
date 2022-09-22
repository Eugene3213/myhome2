<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일 차 반복문 응용</title>
</head>
<body>
<!--  절대 하지 말아야 할 사항: JSP 코드에 HTML 태그를 넣지 않음 -->
	<table border="1">
		<% for(int a=1; a<5; a++){	%>
		<tr>
		<% for(int b=1; b<5; b++){	%>
		<td style="width:100px; heigth:30px;"></td>
		<%	}	%>
		</tr>
		<%	}	%>
	</table>
	<br><br>
	
	<table border="1" cellspacing="0">
	<% for(int c=1; c<9; c++){ %>
		<tr>
			<% if(c%2==0){ %>
				<td style="background-color:red; width:300px; height:30px;"></td>
			<%} else { %>
				<td style="width:300px; height:30px;"></td>
			<% } %>
		</tr>
	<%} %>
	</table>
	<br></br>
	
</body>
</html>