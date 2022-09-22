<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 3일 차 - Jquery Ajax 그래프+타이며+배ㅕ열</title>
<script src="./js/jquery.js"></script>
	<script>
		$(function(){
			$.fn.weather = function(){
				var $apikey = "abc123";
				$.ajax({
					url:"./ajax2_ok.jsp",
					cache:false,
					dataType:"html",
					data:{
						apikey:$apikey	
					},
					type:"GET",
					success:function($data){
						var $jdata =jQuery.parseJSON($data);
						$.fn.ani($jdata);
						console.log($jdata);
					},
					error:function(){
						console.log("AJAX 통신오류");
					}
				});
				setTimeout($.fn.weather,5000);
			}
			setTimeout($.fn.weather,5000); 
			
			$.fn.ani = function($jdata){
				var $area =$jdata[0]["area"];
				var $areanum =$jdata[0]["areanum"];
				console.log($area + $areanum);
			}
		});
	</script>
</head>
<body>
	<p>각 지역구 강수량</p>
	<div id="dataload" style="width:700px; height:500px; border-left:1px solid black;">
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">강동구</li>
	<li style="width:100px; height:25px; background-color:purple;"></li>
	</ul>
	</span>
	
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">중랑구</li>
	<li style="width:100px; height:25px; background-color:blue;"></li>
	</ul>
	</span>
	
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">강남구</li>
	<li style="width:100px; height:25px; background-color:orange;"></li>
	</ul>
	</span>
	
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">동대문구</li>
	<li style="width:100px; height:25px; background-color:red;"></li>
	</ul>
	</span>
	
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">중구</li>
	<li style="width:100px; height:25px; background-color:skyblue;"></li>
	</ul>
	</span>
	
	<span style="display:block; width:inherit; height:50px;">
	<ul style="list-style:none; margin:0; padding:0; width:inherit; height:inherit;">
	<li style="height:25px;">성동구</li>
	<li style="width:100px; height:25px; background-color:yellowgreen;"></li>
	</ul>
	</span>
</body>
</html>