<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 2일 차  - AJAX 통신</title>
	<script>
		function ajax(){
			var id = document.getElementById("mid").value;
			if(id=="" || id==null){
				alert("아이디를 입력하세요");
			}
			else{
				var aj;
				function wck(){
					if(window.XMLHttpRequest){
						return new XMLHttpRequest();
					}
				}
				function acall(){
					if(aj.readyState == XMLHttpRequest.DONE && aj.status ==200){
						console.log(this.response);
						
						/*var data = JSON.parse(this.response);
						console.log(data);
						console.log(data["mid"]);
						console.log(data["mname"]);*/
						
// 						if(this.response =="no"){
// 							alert("해당 아이디는 사용할 수 없습니다");	
// 						}			
// 						else{
// 							alert("해당 아이디는 사용가능 합니다");
// 						}
					}
				}
				var gopage="./data.json";
				//var gopage = "./ajax01_ok.jsp?mid="+id;
				aj = wck();
				aj.onreadystatechange = acall
				aj.open("GET",gopage, true);
				aj.send();
			}
		}
	</script>
</head>
<body>
	<input type="text" name="mid" id="mid">
	<input type="button" value="중복확인">
</body>
</html>