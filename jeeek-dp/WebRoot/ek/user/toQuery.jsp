<%@page import="com.ek.entry.user.EkUser"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="funt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute("returnFlag");
List<EkUser> users = (List<EkUser>)request.getAttribute("users");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>用户列表</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/common/table.css">
</head>
<body>
	<%if(returnFlag.equals("1")) {%>
		<span  style="color: green;">&nbsp;&nbsp;查询成功</span>
	<%} else if(returnFlag.equals("0")){%>
		<span style="color: red;">&nbsp;&nbsp;查询失败</span>
	<%}else{ %>
		<span>&nbsp;&nbsp;为查询到数据</span>
	<%} %>
	<table class="table table-bordered">
		<tbody>
			<tr>
				<th>序号</th>
				<th>登录名称</th>
				<th>用户名称</th>
				<th>注册时间</th>
				<th>操作</th>
			</tr>
			<c:if test="${returnFlag==1 }">
				<c:forEach var="user" items="${users }" varStatus="idx">
					<tr>
						<td>${idx.count }</td>
						<td>${user.logName }</td>
						<td>${user.userName }</td>
						<td>${user.createTime }</td>
						<td>
							<a href="#">详情</a>
							<a href="#">修改</a>
							<a href="#">删除</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
			<tr>
				<td colspan="5">
					<a href="<%=path %>/user/toAddInit.html">添加用户</a>
				</td>
			</tr>
		</tbody>
	</table>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
</html>
