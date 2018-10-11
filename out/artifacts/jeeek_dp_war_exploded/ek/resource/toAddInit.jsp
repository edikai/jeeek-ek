<%@page import="com.ek.entry.permission.EkResource"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute("returnFlag");
EkResource resource = (EkResource)request.getAttribute("resource");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>新增资源</title>

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
		<%if(null != returnFlag) {
			if("0".equals(returnFlag)){
		%>
			<span style="color: red;">添加失败，可能原因：资源名称URL值对已存在</span>
		<%} else if("1".equals(returnFlag)){%>
			<span>添加成功</span>
		<%} }%>
		<form action="<%=path%>/resource/toAdd.html" method="post">
			<table>
				<tbody>
					<tr>
						<th>资源名称：</th>
						<th>
							<input type="text" id="resourceName" name="resourceName" value="${resource.resourceName }"/>
						</th>
					</tr>
					<tr>
						<th>资源URL</th>
						<th>
							<input type="text" id="resourceURL" name="resourceURL" value="${resource.resourceURL }" />
						</th>
					</tr>
					<tr>
						<th>备注</th>
						<th>
							<input type="text" id="remark" name="remark" value="${resource.remark }" />
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
