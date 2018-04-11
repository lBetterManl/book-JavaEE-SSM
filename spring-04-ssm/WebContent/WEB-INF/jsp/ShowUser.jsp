<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show User</title>
</head>
<body>
	<form action="<%=basePath%>user/updateUser" method="post">
		ID：<input type="text" name="id" value="${user.id }" readonly="readonly"/><br/>
		姓名：<input type="text" name="userName" value="${user.userName }"/><br/>
		密码：<input type="text" name="password" value="${user.password }"/><br/>
		年龄：<input type="text" name="age" value="${user.age }"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>