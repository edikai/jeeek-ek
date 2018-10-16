<%@page import="com.ek.entry.menu.EkMenu"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String mList = (String)request.getAttribute("menuList");
String rList = (String)request.getAttribute("resList");
%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTree/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/json2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/zTree/jquery.ztree.all-3.5.js"></script>
<script type="text/javascript">
	var path = "<%=request.getContextPath() %>";
	var mList = <%=mList %>;
	var rList = <%=rList %>;
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
		var nodeStr = '[{"id":-1,"pId":0,"name":"首页","url":"'+path+'/xcom/toMain.html","target":"mainFrame"},';
		$.each(mList, function(idx, item){
			var menuId = item.menuId;
			var menuName = item.menuName;
			var pMenuId = item.parMenuId;
			var permId = item.permsnId;
			//nodeStr += '{"id":'+menuId+',"pId":'+pMenuId+',"name":"'+menuName+'", "url":"'+path+'/user/toQuery.html", "target":"mainFrame"';
			nodeStr += '{"id":'+menuId+',"pId":'+pMenuId+',"name":"'+menuName+'"';
			var rurl = "";
			$.each(rList, function(ri, ritem){
				var rpid = ritem.permsnId;
				if(rpid == permId){
					rurl = ritem.resourceURL;
				}
			});
			if(permId != 0){
				nodeStr += ', "url":"'+path+rurl+'", "target":"mainFrame"';
			}
			
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
		$.fn.zTree.init($("#treeDemo"), setting, JSON.parse(nodeStr));
	});
</script>
</head>
<body>
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
</body>
</html>