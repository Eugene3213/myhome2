<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 1일 차 - 선택문</title>
</head>
<body>
	<%
		String level="3";
		String msg="";
		switch(level){
		case "1":
			msg="일반회원";
			break;
		case "2":
			msg="실버회원";
			break;
		case "3":
			msg="골드회원";
			break;
		default:
			msg="비가입회원";
			break;
		}
	%>
	<input type="text" value="<%=msg %>">
	<br><br>

	<!-- 응용문제  반복문+ 선택문 -->
	<%
	String pay = "1";
	for (int a = 1; a < 5; a++) {
		switch (a) {
		case 1:
			pay = "무통장 입금";
			break;
		case 2:
			pay = "신용카드";
			break;
		case 3:
			pay = "도서상품권";
			break;
		case 4:
			pay = "휴대폰 결제";
			break;
		}
	%>
	<input type="radio" value=""><%=pay%>
	<%
	}
	%>













</body>
</html>