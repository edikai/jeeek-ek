<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="funt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute("returnFlag");
List resouList = (List)request.getAttribute("resouList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>资源列表</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/static/css/common/table.css">
</head>
<body>
	<%if(returnFlag.equals("1")) {%>
		<span style="color: red;">查询成功</span>
	<%} else if(returnFlag.equals("0")){%>
		<span>查询失败</span>
	<%}else{ %>
		<span>为查询到数据</span>
	<%} %>
	<table>
		<tbody>
			<tr>
				<th>序号</th>
				<th>资源名称</th>
				<th>资源URL</th>
				<th>备注</th>
				<th>添加时间</th>
				<th>操作</th>
			</tr>
			<c:if test="${returnFlag==1 }">
				<c:forEach var="reso" items="${resouList }" varStatus="idx">
					<tr>
						<td>${idx.count }</td>
						<td>${reso.resourceName }</td>
						<td>${reso.resourceURL }</td>
						<td>${reso.remark }</td>
						<td>${reso.createTime }</td>
						<td>
							<a href="#">详情</a>
							<a href="#">修改</a>
							<a href="#">删除</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
			<tr>
				<td colspan="6">
					<a href="<%=path%>/resource/toAddInit.html">添加资源</a>
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
