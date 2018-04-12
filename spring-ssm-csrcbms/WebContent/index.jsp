<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CSRCBMS</title>
<style >
.index{
 color: #fff;
   float:right;
   font-size:29px;
   display:block;
   text-decoration: none;
}
</style>
<link type="text/css" rel="stylesheet" media="all" href="css/global.css" />
<link type="text/css" rel="stylesheet" media="all" href="cssles/global_color.css" /> 
    
<script  type="text/javascript">      
	window.self.location ="login/toLogin"
</script> 
</head>
<body class="index">

</body>
</html>