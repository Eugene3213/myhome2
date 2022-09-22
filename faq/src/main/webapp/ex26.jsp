<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page buffer="4kb" autoFlush="true"%>
   <!-- 글자 1개당 1byte  -->
   <%@page isThreadSafe="true" %>
   <!-- buffer: 페이지 로드시 읽어 들이는 메모리 사용량 제한 
   		autoFlush: true (메모리를 비우고 다시 페이지를 로드),false(메모리 데이터를 비우지 않고 로드)
   		isThreadSafe: false (멀티스레드를 사용하지 않음), true(멀티스레드를 사용함)
   		isThreadSafe(true)권장: 폼데이터 처리시 다중처리 속도를 높이기 위해서 사용-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4일 차 Buffer 사용법 + Thread</title>
</head>
<body>
	<%=out.getBufferSize() %>byte
	<%
		for(int a=1; a<=300; a++){
			out.println(a);
		}
	%>
</body>
</html>