<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<title>JSP 4일 차 - 파일 업로드 -cos</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="ex27_1.jsp">
		첨부파일: <input type="file" name="file">
		<input type="submit" value="전송">
	</form>
</body>
</html>