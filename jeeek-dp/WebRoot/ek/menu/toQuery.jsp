<%@page import="com.ek.entry.menu.EkMenu"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
		<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
EkMenu menu = (EkMenu)request.getAttribute("menu");
String ml = (String)request.getAttribute("menuList");
String permLists = (String)request.getAttribute("permList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>菜单维护</title>
</head>
	
	<frameset cols="20%,80%" framespacing="0" frameborder="yes" border="1">
		<frame src="<%=path%>/menu/toLeft.html" name="leftMenu" scrolling="yes" marginwidth="0" marginheight="0">
		<frameset rows="50%,50%" frameborder="yes" framespacing="1">
			<frame src="<%=path %>/menu/toTop.html" name="mainFrame1" scrolling="auto" noresize marginwidth="0" marginheight="0">
			<frame src="<%=path %>/menu/toBottom.html" name="bottomFrame" scrolling="no" noresize marginwidth="0" marginheight="0">
		</frameset>
	</frameset>

<body>
</body>
<script type="text/javascript">
</script>
</html>
