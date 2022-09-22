<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isScriptingEnabled = "false"%>
<!-- isScriptingEnabled: 디렉티브 태그를 사용하는지 유/무 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일 차 page 디렉티브2</title>
</head>
<body>
	<%
		String name="hong";
		request.setAttribute("names", name);
	%>
	<input type="text" name="mid" value="<%=name %>" readonly="readonly">
	<input type="text" name="mid2" value="${names }" readonly="readonly">
	<br><br>
	${requestScope.names} <!-- requestScope: 디렉티브 태그를 이용하여 값을 출력함 -->
</body>
</html>