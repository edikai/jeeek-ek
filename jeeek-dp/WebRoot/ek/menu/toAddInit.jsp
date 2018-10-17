<%@page import="com.ek.entry.menu.EkMenu"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute("returnFlag");
EkMenu menu = (EkMenu)request.getAttribute("menu");
String ml = (String)request.getAttribute("menuList");
String permLists = (String)request.getAttribute("permList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>新增菜单</title>
	<script type="text/javascript" src="<%=path %>/static/js/jquery-1.9.1.js"></script>
</head>
<body>
	<%if(null != returnFlag) {
		if("0".equals(returnFlag)){
	%>
		<span style="color: red;">添加失败，可能原因：菜单名称已存在</span>
	<%} else if("1".equals(returnFlag)){%>
		<span>添加成功</span>
	<%} }%>
	<form action="<%=path%>/menu/toAdd.html" method="post">
		<table>
			<tbody>
				<tr>
					<th>菜单名称：</th>
					<th>
						<input type="text" id="menuName" name="menuName" value="${menu.menuName }"/>
					</th>
				</tr>
				<tr>
					<th>父菜单名称</th>
					<th>
						<select id="parMenuId" name="parMenuId" >
							<option value ="0">-请选择-</option>
						</select>
					</th>
				</tr>
				<tr>
					<th>对应权限</th>
					<th>
						<select id="permsnId" name="permsnId" >
							<option value ="0">-请选择-</option>
						</select>
					</th>
				</tr>
				<tr>
					<th>备注</th>
					<th>
						<input type="text" id="remark" name="remark" value="${menu.remark }" />
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
	var ml = <%=ml %>;
	var permLists = <%=permLists %>;
	$(document).ready(function(){
		initPerm();
	});
	
	function initPerm(){
		//菜单 
		var menuObj = $("#parMenuId")[0];
		$.each(ml, function(idx, item){
			menuObj.options.add(new Option(item.menuName, item.menuId));
		});
		var parMenuId = <%=menu.getParMenuId() %>;
		if(null != parMenuId){
			$("#parMenuId").find("option[value="+parMenuId+"]").attr("selected", true);
		}
		//权限 
		var permObj = $("#permsnId")[0];
		$.each(permLists, function(idx, item){
			permObj.options.add(new Option(item.permsnName, item.permsnId));
			console.info(item.permsnId+","+item.permsnName);
		});
		var permId = <%=menu.getPermsnId() %>;
		if(null != permId){
			$("#permsnId").find("option[value="+permId+"]").attr("selected", true);
		}
	}
</script>
</html>
