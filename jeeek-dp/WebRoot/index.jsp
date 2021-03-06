<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String error = (String) request.getSession().getAttribute("error");
%>
<base href="<%=basePath%>">
<title>欢迎使用JEEEK-DP开发平台</title>

<link href="<%=path%>/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="<%=path%>/css/xcom/login/login.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=path%>/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/bootstrap/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/common/EK.js"></script>
</head>
<body>
 <div class="container">
	<form name="loginForm" action="<%=path%>/xcom/login.html" method="post" class="loginForm">
		<table>
			<tbody>
				<tr>
					<th><h3 style="margin-top: 30px;">用户名：</h3></th>
					<th>
						&nbsp;&nbsp;
						<input type="text" id="logName" name="logName" class="form-control"
							placeholder="Login Name" required autofocus />
						<label for="logName" class="sr-only">Login Name</label>
					</th>
				</tr>
				<tr>
					<th><h3>密&nbsp;&nbsp;&nbsp;&nbsp;码：</h3></th>
					<th>
						&nbsp;&nbsp;
						<input type="password" id="passWord" name="passWord" class="form-control"
							placeholder="PassWord" required autofocus /> 
						<label for="logName" class="sr-only">PassWord</label>
						<input type="hidden" id="nowTime" name="nowTime">
					</th>
				</tr>
				<tr>
					<td colspan="2">
						<div class="checkbox">
							<label> 
								<input id="rembme" name="rembme" type="checkbox" value="true">
								Remember me
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<th colspan="2" class="bot_but">
						<button class="btn btn-lg btn-primary btn-block submit" onclick="submit();">登陆</button>
						&nbsp;&nbsp;
						<button class="btn btn-lg btn-primary btn-block submit" >注册</button>
					</th>
				</tr>
			</tbody>
			<tfoot>
				<%
					if (null != error && "1".equals(error)) {
				%>
				<tr>
					<td>登录失败，请检查你的用户名密码！</td>
				</tr>
				<%
					}
				%>
			</tfoot>
		</table>
	</form>
</div>
</body>
<script type="text/javascript">
function submit(){
	loginForm.submit();
}
$(function(){
	setTime();
	setInfo();
});
function setTime(){
	var nowTime = new Date();
	var year = nowTime.getYear();
	year = year > 1900 ? year : year + 1900;
	var month = nowTime.getMonth() + 1;
	var day = nowTime.getDate();
	var hours = nowTime.getHours();//获取当前小时数
	var minutes = nowTime.getMinutes();//获取当前分钟数
	var seconds = nowTime.getSeconds();//获取当前秒数
	document.getElementById("nowTime").value = year + "-" + month + "-" + day
			+ " " + hours + ":" + minutes + ":" + seconds;
}
function setInfo(){
	var cu = EK.getCookie("loginInfo");
	if(cu.length != 0){
		var u = cu.split(",");
		if(u.length > 0){
			$("#rembme").attr("checked", true);
			$("#logName").val(u[0].replace("\"",""));
			$("#passWord").val(u[1].replace("\"",""));
		}
	}
}
	
</script>
</html>
