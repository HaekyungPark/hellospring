<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>joinform</title>
</head>
<body>
	<form method="post" action="/hellospring/user/join">
		이름: <input type="text" name="name" value=""><br>
		이메일: <input type="text" name="email" value=""><br>
		비밀번호: <input type="text" name="password" value=""><br>
		<input type="submit" value="가입">
	</form>
</body>
</html>