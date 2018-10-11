
<!DOCTYPE html>
<%@include file="../../WEB-INF/taglib/taglibs.inc"%>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@ page pageEncoding="UTF-8" %>
	
	<%@include file="../../jsp/common.jsp"%>

	<title>欢迎使用JEEEK-DP开发平台</title>

	<link href="${pageContext.request.contextPath}/css/xcom/login/login.css" rel="stylesheet">

	<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/EK.js"></script>
	<style>

	</style>
</head>
<body>
<form name="loginForm" action="${pageContext.request.contextPath}/xcom/login.html" method="post"
	  class="form-horizontal loginForm" role="form">
	<div id="loginForm">
		<div class="form-group">
			<label for="logName" class="col-sm-3 control-label" >
				<h3>用户名</h3>
			</label>
			<div class="col-sm-9" style="text-align: center;">
				<input type="text" id="logName" name="logName" class="form-control"
					   placeholder="Login Name" required autofocus onchange="userNameChanged()"
					   v-model="logName"
				/>
			</div>
		</div>

		<div class="form-group">
			<label for="passWord" class="col-sm-3 control-label">
				<h3>密&nbsp;&nbsp;&nbsp;&nbsp;码</h3>
			</label>
			<div class="col-sm-9">
				<input type="password" id="passWord" name="passWord" class="form-control"
					   placeholder="PassWord" required autofocus onchange="pwdOnChanged()"
					   v-model="passWord"
				/>

				<input type="hidden" id="nowTime" name="nowTime" v-model="nowTime">
				<input type="hidden" id="pwdChanged"  name="pwdChanged" value="">
			</div>
		</div>

		<div class="form-group">
			<label class="eklabel">
				<input id="rembme" name="rembme" type="checkbox" value="true"
					v-model="rembme"/>
				Remember me
			</label>
		</div>

		<div class="form-group">
			<label class="eklabel">
				<button class="btn btn-lg btn-primary submit" onclick="submit();">登陆</button>
				&nbsp;&nbsp;
				<button class="btn btn-lg btn-primary submit">注册</button>
			</label>
		</div>
		<c:if test="${error != null }">
			<div id="errorInfo" class="form-group">
				<label class="eklabel" style="color: red; ">
					${error}
				</label>
			</div>
		</c:if>
	</div>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/xcom/loginJs.js"></script>
</html>
