<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddUser</title>
</head>
<body>
	<form action="saveUser" method="post">
		用户名：<input type="text" name="name"/>
		年    龄:<input type="text" name="age">
		<input type="submit" value="添加"/>
	</form>
</body>
</html>