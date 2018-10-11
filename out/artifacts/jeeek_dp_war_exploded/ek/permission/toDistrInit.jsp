<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>分配权限</title>
</head>
<frameset rows="50%,50%" frameborder="yes" frameborder="1"
	framespacing="1">
	<frame src="<%=path%>/permission/toDistrInit_t.html" name="mainFrame"
		frameborder="yes" border="1" scrolling="auto" noresize marginwidth="0"
		marginheight="0">
	<frame src="<%=path%>/permission/toDistrInit_b.html"
		name="bottomFrame" frameborder="no" scrolling="no" noresize
		marginwidth="0" marginheight="0">
</frameset>
<body>
</body>
</html>
