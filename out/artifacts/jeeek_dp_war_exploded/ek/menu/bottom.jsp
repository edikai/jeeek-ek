<%@page import="com.ek.entry.menu.EKMenu"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
EKMenu menu = (EKMenu)request.getAttribute("menu");
String ml = (String)request.getAttribute("menuList");
String permLists = (String)request.getAttribute("permList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>菜单维护</title>
	<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.js"></script>
</head>
	
<body>
bottom
</body>
<script type="text/javascript">
</script>
</html>
