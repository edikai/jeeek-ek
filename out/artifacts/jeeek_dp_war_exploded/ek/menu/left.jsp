<%@page import="com.ek.entry.menu.EKMenu"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
EKMenu menu = (EKMenu)request.getAttribute("menu");
String ml = (String)request.getAttribute("menuList");
String permLists = (String)request.getAttribute("permList");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<title>菜单维护</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTree/zTreeStyle.css">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/json2.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/zTree/jquery.ztree.all-3.5.js"></script>
</head>
<script type="text/javascript">
	var path = "<%=request.getContextPath() %>";
	var mList = <%=ml %>;
	var setting = {
		data: {
			simpleData: {
				enable: true
			}
		},
		callback: {
			onClick: this.onClick
		}
	};
	function onClick(e, treeId, node){
	}
	$(function(){
		var nodeStr = "[";
		$.each(mList, function(idx, item){
			var menuId = item.menuId;
			var menuName = item.menuName;
			var pMenuId = item.parMenuId;
			var permId = item.permsnId;
			nodeStr += '{"id":'+menuId+',"pId":'+pMenuId+',"name":"'+menuName+'"';
			nodeStr += ', "url":"'+path+'/menu/toQuerySubMenu.html?menuId='+menuId+'", "target":"mainFrame1"';
			if(pMenuId == 0){
				nodeStr += ',"open":true';
			}
			nodeStr += '}';
			if(idx != mList.length-1){
				nodeStr += ',';
			}
		});
		nodeStr += "]";
		console.info(nodeStr);
		$.fn.zTree.init($("#menuTree"), setting, JSON.parse(nodeStr));
	});
</script>
</head>
<body>
	<div class="zTreeDemoBackground left">
		<ul id="menuTree" class="ztree"></ul>
	</div>
</body>
<script type="text/javascript">
</script>
</html>
