<%@ page import="com.ek.entry.user.EkUser" %>
<%@include file="../../WEB-INF/taglib/taglibs.inc"%>
<%@include file="../../static/jsp/common.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Edi_Kai
  Date: 2018/10/10
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	long[] timeIntv = (long[]) request.getSession().getAttribute(
			"timeIntv");
	String time = "";
	for (int i = 0; i < timeIntv.length; i++) {
		time += timeIntv[i];
		if (i != timeIntv.length)
			time += ",";
	}
%>

<html>
<head>
	<title>JEEEK-DP 首页</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/xcom/login/loginSuc.css">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap-treeview.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap-treeview.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">JEEEK-DP</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li style="margin-top: 8px;">
						<img class="img-circle"
							 style="cursor: pointer;" alt=""
							 src="${pageContext.request.contextPath}/image/login/user.jpg" onclick="showOper()">
					</li>
					<li><a href="#" onclick="showOper()">
						${pageContext.request.session.getAttribute("loginUser").logName}
					</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<div id="treemenu" class=""></div>
			</div>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">Dashboard</h1>

				<div class="row placeholders">
					<div class="col-xs-6 col-sm-3 placeholder">
						<img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
					<div class="col-xs-6 col-sm-3 placeholder">
						<img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
						<h4>Label</h4>
						<span class="text-muted">Something else</span>
					</div>
				</div>

				<h2 class="sub-header">Section title</h2>
				<%=time %>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var path = '${pageContext.request.contextPath}';
		$(function () {
			$.ajax({
				type: 'post',
				url: path+'/xcom/toLeft.html',
				cache: false,
				success: function (msg) {
					$('#treemenu').treeview({
						color: "#428bca",
						expandIcon: 'glyphicon glyphicon-chevron-right',
						collapseIcon: 'glyphicon glyphicon-chevron-down',
						//nodeIcon: 'glyphicon glyphicon-bookmark',
						data: msg,
						onNodeSelected: function (event, data) {
							var selectedNode = $('#treemenu').treeview('getSelected');
							var permsnId = selectedNode[0].permsnId;
							getPermsnUrl(permsnId);
						}
					});
				}
			});

		});

		function getPermsnUrl(permsnId) {
			if (EK.isEmpty(permsnId) ) {
				throw DOMException("getPermsnUrl param[permsnId] is null or empty.");
			}
			$.ajax({
				type: 'post',
				url: path+'/permission',
				data: 'permsnId='+permsnId,
				success: function (msg) {
					console.info(msg)
				}
			});
				
		}

	</script>
</body>
</html>
