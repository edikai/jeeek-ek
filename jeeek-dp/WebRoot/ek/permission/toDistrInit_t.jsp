<%@page import="com.ek.entry.user.EkUser"%>
<%@page import="com.ek.bo.commons.StaticConst"%>
<%@page import="com.ek.entry.permission.EkPermission"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute(StaticConst.EK_RETURN_FLAG);
EkPermission permission = (EkPermission)request.getAttribute("permission");
List<EkUser> userList = (List<EkUser>)request.getAttribute("userList");
EkPermission perm = (EkPermission)request.getAttribute("perm");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>分配权限</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/common/table.css">
<script type="text/javascript" src="<%=path%>/static/js/jquery-1.9.1.js"></script>

</head>
<body>
	<%
		if(null != returnFlag) {
			if("0".equals(returnFlag)){
	%>
	<span style="color: red;">查询失败</span>
	<%
		} else if("1".equals(returnFlag)){
	%>
	<span>查询成功</span>
	<%
		} }
	%>
	<table align="center">
		<tbody>
			<tr>
				<th>序号</th>
				<th>用户登录名</th>
				<th>用户姓名</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<%
				for(int i=0; i<userList.size(); i++){
					EkUser user = (EkUser)userList.get(i);
			%>
			<tr>
				<td><%=i+1%></td>
				<td><%=user.getLogName()%></td>
				<td><%=user.getUserName()%></td>
				<td><%=user.getRemark()%></td>
				<td><a href="javascript:void(0);" target="bottomFrame"
					onclick="distrPerm(this, <%=user.getUserId()%>)">权限分配</a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>
<script type="text/javascript">
	var path = "<%=path%>";
	$(document).ready(function(){
	});
	
	/*
	* 权限分配
	*/
	function distrPerm(obj, userId){
		obj.href = path+"/permission/getPerm.html?userId="+userId;
	}
	
</script>
</html>
