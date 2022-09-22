<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일 차 - JAVA + JSP </title>
<%!
	
	public class abc{
		String a ="홍길동";
		String b ="이순신";
		String zz =null;
		public String[] getter(){
			String data[] = new String[2];
			data[0] =a;
			data[1] =b;
			return data;		
		}
		public void setter(String z){		//setter에 값을 적용 후 산술처리 완료되면 this로 값을 보냄
			this.zz =z;
		public String getter2(){		//JSP의 출력 역할
			return this.zz;
		}
		}
	}
%>
<%
	//JSP 에서  JAVA를 로드해서 사용함
	abc aa = new abc();		//Controller
	String result[] = aa.getter();
	request.setAttribute("result0", result[0]);
	request.setAttribute("result1", result[1]);
	
	aa.setter("유관순");
	String name2 =zz.getter2();
%>
</head>
<!-- View -->
<body>
	고객명: <%=result[0] %> <%=result[1] %><br>
	고객명: ${result}<br>
	리턴값 이롬: <%=name2 %>
</body>
</html>