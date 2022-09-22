<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일 차 - Action 태그 활용</title>
</head>
<body>
<!-- 
jsp 태그 사용형태: Server + Client 쪽에 명령을 적용할 수 있음
 -->
<%-- <%@ include %> --%> <!-- 페이지를 불러오기만 가능-->
	<%-- <%@	include file="./ex17_1.jsp" %> --%>
	<!-- <jsp:/>: jsp 액션 태그 -->
	<!--<jsp:forward page="ex17_1.jsp"/>--> 
		<!-- forward: 다른페이지로 이동과 같은 페이지 호출을 제어 -->
	<!-- jsp 태그: 열고 닫기 (/)  -->
	<!-- forward: ex17_1.jsp: 값을 가져옴 -->
	<jsp:include page="ex17_1.jsp" flush="true"/>
		<!-- include: 외부 페이지의 내용을 포함하거나 페이지를 모듈화 함 -->
	<p>테스트 입니다.</p>
</body>
</html>