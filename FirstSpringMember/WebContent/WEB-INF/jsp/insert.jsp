<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<form action="member_insert">
<tr>
	<td>
		<h1>회원가입</h1>
	</td>
</tr>
<tr>
	<td>
		아이디:<input type="text" name="id">
	</td>
</tr>
<tr>
비밀번호:<input type="text" name="pass">
성명:<input type="text" name="name">
주소:<input type="text" name="addr">
메모:<input type="text" name="memo">
<input type="submit" value="가입">
</form>
</table>

</body>
</html>