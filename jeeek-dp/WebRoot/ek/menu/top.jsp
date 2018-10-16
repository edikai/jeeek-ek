<%@page import="com.ek.entry.menu.EkMenu"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List<EkMenu> menuList = (List<EkMenu>)request.getAttribute("menuList");
String returnFlag = (String)request.getAttribute("returnFlag");
String pageFlag = (String)request.getAttribute("pageFlag");
String menuId = (String)request.getAttribute("menuId");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>菜单维护</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common/table.css">
	<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.js"></script>
</head>
<script type="text/javascript">
</script>
<body>
	<%if(pageFlag.equals("1")){
	if(returnFlag.equals("1")) { %>
		<span style="color: red;">查询成功</span>
	<%} else if(returnFlag.equals("0")){%>
		<span>查询失败</span>
	<%}else{ %>
		<span>未查询到数据</span>
	<%} %>
	<table>
		<tbody>
			<tr>
				<th>序号</th>
				<th>菜单名称</th>
				<th>备注</th>
				<th>创建日期</th>
				<th>操作</th>
			</tr>
				<c:forEach var="m" items="${menuList }" varStatus="idx">
					<tr>
						<td>${idx.count }</td>
						<td>${m.menuName }</td>
						<td>${m.remark }</td>
						<td>${m.createTime }</td>
						<td>
							<a href="#">详情</a>
							<a href="#">修改</a>
							<a href="#">删除</a>
						</td>
					</tr>
				</c:forEach>
			<tr>
				<td colspan="5">
					<a href="<%=path %>/menu/toAddSubMenuInit.html?menuId=<%=menuId %>" target="bottomFrame">添加子菜单</a>
				</td>
			</tr>
		</tbody>
	</table>
	<%}else{%>
	<span>WELCOME</span>
	<%} %>
</body>
<script type="text/javascript">
	var menuId = '<%=menuId %>';
</script>
</html>
