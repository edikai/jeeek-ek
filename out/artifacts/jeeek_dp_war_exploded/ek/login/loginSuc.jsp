<%@page import="com.ek.entry.user.EkUser"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
EkUser loginUser = (EkUser)request.getSession().getAttribute("loginUser");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>首页</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<frameset rows="40,*,20" framespacing="0" frameborder="yes" border="1" bordercolor="#c0c0c0">
	
		<frame src="<%=path %>/xcom/toTop.html" name="topFrame" scrolling="no" noresize marginwidth="0" marginheight="0">
		<frameset cols="20%,80%" framespacing="0" frameborder="yes" border="1">
			<frame src="<%=path%>/xcom/toLeft.html" name="leftFrame"  scrolling="yes" marginwidth="0" marginheight="0">
			<frame src="<%=path %>/xcom/toMain.html" name="mainFrame" scrolling="auto" noresize marginwidth="0" marginheight="0">
		</frameset>
		<frame src="<%=path %>/xcom/toBottom.html" name="bottomFrame" scrolling="no" noresize marginwidth="0" marginheight="0">
	</frameset>
	<body>
	</body>
</html>
