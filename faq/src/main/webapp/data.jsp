<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	//CORS: 도메인 및 IP가 다를 경우 외부에서 .json 파일을 가져가지 못함
 	response.addHeader("Access-Control-Allow-Origin", "*");
 	response.addHeader("Access-Control-Allow-Credentials", "true");
 	//response.addHeader: .bashrc(서버) 입력하게 되어 있음
 	//JSP에 코드를 입력해서 Access-Control-Allow 이용해서 허락을 적용함
 	
 	
 	//A서버에서 자신의 서버로 접속 시 허락된 파라미터명 + 파라미터 값을 확인함
 	String aa= request.getParameter("apikey").intern();
 	if(aa=="aaaa"){
 		String arr[][] = {
				{"hong","홍길동"},
				{"park","박찬호"},
		};
	
	JSONArray ar = new JSONArray();		//JSONArray는 각각의 배열로 만들어진 데이터를 그룹화[] 하여 값을 저장하는 클래스.
	for(int k=0; k<arr.length; k++){
		JSONObject js = new JSONObject();
		js.put("mid",arr[k][0]);
		js.put("mname",arr[k][1]);
		ar.add(js);
	}
	out.print(ar);	//배열값을 전송시켜 줌
 	}
 %>   