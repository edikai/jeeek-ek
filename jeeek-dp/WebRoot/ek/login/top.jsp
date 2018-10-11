<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@page import="com.ek.entry.user.EkUser" %>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
			 pageEncoding="UTF-8" %>
		<%
	String path = request.getContextPath();
	EkUser user = (EkUser) request.getSession().getAttribute(
			"loginUser");
	long[] timeIntv = (long[]) request.getSession().getAttribute(
			"timeIntv");
	String time = "";
	for (int i = 0; i < timeIntv.length; i++) {
		time += timeIntv[i];
		if (i != timeIntv.length)
			time += ",";
	}
%>
	<link href="<%=path%>/css/bootstrap/bootstrap.min.css" rel="stylesheet">
	<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="<%=path%>/js/bootstrap/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/vuejs/vue-2.5.16-min.js"></script>
	<style type="text/css">
		#logInfo {
			a: right;
		}

		#logInfo li {
			border-left: thin solid white;
		}
	</style>
	<head>
	</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" style="min-height: 40px; height: 40px;">
	<div class="container" style="width: 100%; ">
		<div class="navbar-header">
			<a class="navbar-brand" style="padding: 5% 5%;" href="#">欢迎使用JEEEK-DP</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse"
			 style="float: right; padding-right: 18px;">
			<ul id="logInfo" class="nav navbar-nav">
				<li>
					<img class="img-circle"
						 style="cursor: pointer; padding: 5% 0 0 0;" alt=""
						 src="<%=path%>/image/login/user.jpg" onclick="showOper();">
					&nbsp;
					<a href="#" style="padding: 5% 0; display: inline; height: 100%;" onclick="showOper();">
						<%=user.getLogName()%>
					</a>
				</li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
</body>
<script type="text/javascript">
	function showOper() {
		var a = window.parent.frames;
		a[2].showOper();
	}
</script>
</html>