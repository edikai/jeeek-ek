<%@page import="com.ek.entry.user.EkUser"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String error = (String)request.getAttribute("error");
String succ = (String)request.getAttribute("success");
EkUser user = (EkUser)request.getAttribute("user");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>新增用户</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
		<script type="text/javascript">
			
		</script>
	
	</head>
	<body>
		<%if(null != error) {%>
			<span style="color: red;">添加失败，可能原因：用户名已存在</span>
		<%} else if(null != succ){%>
			<span>添加成功</span>
		<%} %>
		<form action="<%=path%>/user/toAdd.html" method="post">
			<table>
				<tbody>
					<tr>
						<th>登录名：</th>
						<th>
							<input type="text" id="logName" name="logName" value="${user.logName }"/>
						</th>
					</tr>
					<tr>
						<th>密码</th>
						<th>
							<input type="password" id="passWord" name="passWord" value="${user.passWord }" />
						</th>
					</tr>
					<tr>
						<th>用户姓名</th>
						<th>
							<input type="text" id="userName" name="userName" value="${user.userName }" />
						</th>
					</tr>
					<tr>
						<th>备注</th>
						<th>
							<input type="text" id="remark" name="remark" value="${user.remark }" />
						</th>
					</tr>
					<tr>
						<th colspan="2">
							<input type="submit" value="添加" />
							<input type="button" value="重置" onclick="toReset()"/>
						</th>
					</tr>
				</tbody>
			</table>
		</form>
	</body>
</html>
