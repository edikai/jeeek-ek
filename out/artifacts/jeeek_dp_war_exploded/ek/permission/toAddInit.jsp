<%@page import="com.ek.entry.permission.EkPermission"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute("returnFlag");
EkPermission permission = (EkPermission)request.getAttribute("permission");
String rss = (String)request.getAttribute("rss");
EkPermission perm = (EkPermission)request.getAttribute("perm");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>新增权限</title>
	<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->
	<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.js"></script>

</head>
<body>
	<%if(null != returnFlag) {
		if("0".equals(returnFlag)){
	%>
		<span style="color: red;">添加失败，可能原因：权限名称已存在</span>
	<%} else if("1".equals(returnFlag)){%>
		<span>添加成功</span>
	<%} }%>
	<form action="<%=path%>/permission/toAdd.html" method="post">
		<table>
			<tbody>
				<tr>
					<th>权限名称：</th>
					<th>
						<input type="text" id="permsnName" name="permsnName" value="${perm.permsnName }"/>
					</th>
				</tr>
				<tr>
					<th>资源名称</th>
					<th>
						<select id="resourceId" name="resourceId" style="width: 100px;">
							<option value="-1">-请选择-</option>
						</select>
					</th>
				</tr>
				<tr>
					<th>操作名称</th>
					<th>
						<select id="operateId" name="operateId" style="width: 100px;">
							<option value="-1">-请选择-</option>
						</select>
					</th>
				</tr>
				<tr>
					<th>备注</th>
					<th>
						<input type="text" id="remark" name="remark" value="${perm.remark }" />
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
<script type="text/javascript">
	var rssJson = <%=rss %>;
	$(document).ready(function(){
		initResource();
	});
	
	/*
	* 初始化资源信息 
	*/
	function initResource(){
		var resObj = $("#resourceId").get(0);
		$.each(rssJson, function(idx, item){
			resObj.options.add(new Option(item.resourceName, item.resourceId));
			console.info(item.resourceId+"-"+item.resourceName);
		});
		var rsId = <%=perm.getResourceId() %>;
		if (null != rsId) {
			$("#resourceId").find("option[value="+rsId+"]").attr("selected", true);
		}
	}
	
</script>
</html>
