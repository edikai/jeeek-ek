<%@page import="com.ek.entry.user.EkUser"%>
<%@page import="com.ek.bo.commons.StaticConst"%>
<%@page import="com.ek.entry.permission.EkPermission"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String returnFlag = (String)request.getAttribute(StaticConst.EK_RETURN_FLAG);
String pageFlag = (String)request.getAttribute(StaticConst.PAGE_EK_PAGE_FLAG);
EkPermission permission = (EkPermission)request.getAttribute("permission");
List<EkPermission> grantList = (List<EkPermission>)request.getAttribute("permGrantList");
List<EkPermission> noList = (List<EkPermission>)request.getAttribute("permList");
String userId = (String)request.getAttribute("userId");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>分配权限</title>
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/common/table.css">
	<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.js"></script>

</head>
<body>
	<%
	if(!pageFlag.equals(StaticConst.PAGE_EK_PAGE_INIT)){
	if(null != returnFlag) {
		if("0".equals(returnFlag)){
	%>
		<span style="color: red;">查询失败</span>
	<%} else if("1".equals(returnFlag)){%>
		<span>查询成功</span>
	<%} }%>
	<table align="center" width="80%">
		<tbody>
			<tr>
				<th width="50%">未授权</th>
				<th>已授权</th>
			</tr>
			<tr>
				<td>
					<%
					if(null != noList && !noList.isEmpty()){
					for(int i=0; i<noList.size(); i++){
						EkPermission perm = noList.get(i);
					%>
					<input  id="perm_<%=perm.getPermsnId()%>" type="checkbox" name="c_subPerm">
					<%=perm.getPermsnName()%><br>
					<%} }%>
				</td>
				<td>
					<%
					if(null != grantList && !grantList.isEmpty()){
					for(int i=0; i<grantList.size(); i++){
						EkPermission perm = grantList.get(i);
					%>
					<input id="perm_<%=perm.getPermsnId()%>" type="checkbox" name="c_revPerm" >
					<%=perm.getPermsnName()%><br>
					<%}} %>
				</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input id="subPerm" onclick="subPerm()" type="button" value="提交授权"/>
					<input id="subPerm" onclick="revPerm()" type="button" value="撤销授权"/>
				</td>
			</tr>
		</tfoot>
	</table>
	<%
	}else{
	%>
	<span>WELCOME</span>
	<%} %>
</body>
<script type="text/javascript">
	var path = "<%=path%>";
	var userId = "<%=userId%>";
	
	function subPerm(obj){
		var $subPerm = $("input[name='c_subPerm']:checked");
		var sl = $subPerm.length;
		console.info(sl);
		if(sl == 0){
			alert("请选择需要授权的权限");
			return ;
		}
		var pid = "";
		$.each($subPerm, function(idx, item){
			pid += item.id.split("_")[1];
			if(idx != sl-1){
				pid += ",";
			}
		});
		window.location.href = path+"/permission/grantPerm.html?userId="+userId+"&pid="+pid;
	}
	function revPerm(obj){
		var $revPerm = $("input[name='c_revPerm']:checked");
		var sl = $revPerm.length;
		if(sl == 0){
			alert("请选择需要撤销的权限");
			return;
		}
		var pid = "";
		$.each($revPerm, function(idx, item){
			pid += item.id.split("_")[1];
			if(idx != sl-1){
				pid += ",";
			}
		});
		window.location.href = path+"/permission/revokePerm.html?userId="+userId+"&pid="+pid;
	}
</script>
</html>
