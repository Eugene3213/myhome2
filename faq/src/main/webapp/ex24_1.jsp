<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 검색 리스트 출력 파트</title>
</head>
<%@ include file ="./ex24.jsp" %>
<%
	String product[][]={
			{"딸기","",""},
			{"청포도 2Kg","35000","10%"},
			{"적포도 1Kg","18000","5%"}
	};
	request.setCharacterEncoding("utf-8");
	String pronm =request.getParameter("search").intern();
	
	String a_pnm = null;	//상품명
	String a_pmoney = null;	//상품가격
	String a_psales = null;	//할인율
	Boolean ck =false;		//검색 상품 결과 유무
%>
<jsp:include page="ex24.jsp"> <!-- 지속적으로 검색을 할 수 있도록 하기 위함 -->
	<jsp:param value="<%=pronm %>" name="search"></jsp:param>
	<!-- 검색 받은 값을 return -->
</jsp:include>
<body>
<% 
int w= 0;
	while(w < product.length){
		if(product[w][0].indexOf(pronm)>-1){	//-1이상은 해당 단어가 있는 경우
			a_pnm = product[w][0];
			a_pmoney = product[w][1];
			a_psales = product[w][2];
			ck=true;
			if(a_pmoney!=""){	//가격이 비어 있지 않을 경우
%>
	<ul>
		<li>상품명: <%=a_pnm %></li>
		<li>상품가격: <%=a_pmoney %></li>
		<li>할인율: <%=a_psales %></li>
	</ul>
<%
			}
			else{	//가격이 비어 있을 경우
				out.print("<span>해당 상품은 판매 종료 된 상품입니다.</span>");
			}
		};
		w++;
	}
%>
<%
	if(ck==false){	//모든 배열을 반복 하였지만 해당 값을 확인 하지 못할 경우
%>
	<span>상품명을 다시 한번 확인해 주세요</span>
<%} %>	

</body>
</html>