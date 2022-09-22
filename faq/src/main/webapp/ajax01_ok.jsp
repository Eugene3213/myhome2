<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	//JSONObject js = new JSONObject();	//jsp에서  JSON 파일처럼 배열로 인식되도록 하는 클래스
	//ajax 통신 시 HTML 코드는 별도로 사용하지 않음
		String aa = request.getParameter("mid").intern();	
		String bb =null;	
// 		if(aa=="hong"){
// 			bb="no";	
// 		}
// 		else{
// 			bb="ok";
// 		}
		//js.put("sign",bb);	//put을 이용해서 배열로 생성 ("배열키", 배열값)
		//out.print(js);
	
	String a = "hong";
	String b = "홍길동";
	aj.put("mid",a);
	aj.put("mname",b);
		out.print(js);


%>

	
