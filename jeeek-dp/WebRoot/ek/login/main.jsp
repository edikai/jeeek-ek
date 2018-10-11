<!DOCTYPE html>
<%@page import="com.ek.entry.user.EkUser" %>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@ page language="java" contentType="text/html; charset=UTF-8"
			 pageEncoding="UTF-8" %>
		<%
	EkUser u = (EkUser) request.getSession().getAttribute("loginUser");
	String path = request.getContextPath();
%>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>main</title>
		<link href="<%=path%>/css/bootstrap/bootstrap.min.css" rel="stylesheet">
		<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
		<style type="text/css">
			#ul {
				border: thin solid #66AFE9;
				box-shadow: 0px 1px 1px rgba(0, 0, 0, 0.075) inset, 0px 0px 8px rgba(102, 175, 233, 0.6);
				width: 10%;
				text-align: center;
			}

			#changePwd {
				position: absolute;
				text-align: center;
				width: 400px;
				height: 300px;
				padding: 30px 30px;
				margin: 10% 25%;
				border: thin solid black;
				z-index: 2;
				box-shadow: 0px 1px 1px rgb(40, 0, 0) inset, 0px 0px 8px rgb(40, 0, 0);
			}

			h5 {
				margin-top: 30px;
			}

			.bot_but {
				text-align: center;
				padding-top: 20px;
				padding-left: 20px;
			}

			.submit {
				display: inline;
				width: 40%;
				margin-top: 2px;
			}

			#welcome {
				z-index: 1;
				position: absolute;
				left: 0;
				top: 0;
				background-color: rgba(0, 152, 50, 0.7);
			}

			img {
				filter: alpha(opacity=80);
				-moz-opacity: 0.8;
			}
		</style>
	</head>
<body>
<div id="oper" class="container-fluid" align="right"
	 style="display: none;">
	<div class="row">
		<div class="col-sm-12 sidebar">
			<ul id="ul" class="nav nav-sidebar">
				<li><a href="#">个人信息</a></li>
				<li><a href="#" onclick="changePwd(<%=u.getUserId()%>);">修改密码</a></li>
				<li><a href="#">风格切换</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="container" id="changePwd" style="display: none;">
	<form name="loginForm" action="<%=path%>/xcom/login.html"
		  method="post">
		<table style="">
			<tbody>
			<tr>
				<th><h5>
					原&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;
				</h5></th>
				<th>&nbsp;&nbsp;
					<input type="password" id="oldPwd" name="oldPwd" class="form-control"
						   placeholder="Old PassWord" autofocus/>
					<label for="logName" class="sr-only">LoginName</label>
				</th>
			</tr>
			<tr>
				<th><h5>
					新&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;&nbsp;&nbsp;
				</h5></th>
				<th>&nbsp;&nbsp;
					<input type="password" id="newPwd" name="passWord" class="form-control"
						   placeholder="New PassWord"/>
					<label for="logName" class="sr-only">PassWord</label>
				</th>
			</tr>
			<tr>
				<th><h5>重复新密码：&nbsp;&nbsp;&nbsp;</h5></th>
				<th>&nbsp;&nbsp;
					<input type="password" id="newPwd1" name="passWord" class="form-control"
						   placeholder="New PassWord"/>
					<label for="logName" class="sr-only">PassWord</label>
					<input type="hidden" id="nowTime" name="nowTime">
				</th>
			</tr>
			<tr>
				<th colspan="2" class="bot_but"><a
						class="btn btn-lg btn-primary btn-block submit"
						onclick="submit();">确认</a> &nbsp;&nbsp; <a
						class="btn btn-lg btn-primary btn-block submit"
						onclick="toCancleC();">取消</a></th>
			</tr>
			</tbody>
		</table>
	</form>
</div>
<div id="welcome" style="">
	<h3>WELCOME TO JEEEK-DP</h3>
	<img alt="aa" src="<%=path%>/image/common/index-11.jpg">
</div>
</body>
<script type="text/javascript">
	function toCancleC() {
		$("#changePwd").css("display", "none");
		$("#welcome").css("color", "black");
	}

	function changePwd(uId) {
		$("#changePwd").css("display", "");
		$("#oper").css("display", "none");
		$("#welcome").css("color", "#eee");
	}

	function showOper() {
		var od = $("#oper").css("display");
		if (od == "none") {
			$("#oper").css("display", "");
		} else {
			$("#oper").css("display", "none");
		}
	}
</script>
</html>