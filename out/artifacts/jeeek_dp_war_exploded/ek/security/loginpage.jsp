<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common/index.css">
<title>JEEEK-DP 登陆</title>
</head>  
<body>
	<div class="i_img">
		<div class="top">
			JEEEK-DP 开发平台
		</div>
		<div class="img"></div>
		<div class="loginForm">
			<div class="loginForm1">
				<div id="login-error">${error}</div>
				<div style="width: 40%; text-align: center;">
					<form action="../j_spring_security_check" method="post">
						<p>
							<label for="j_username">用户名</label>
								<input id="j_username" name="j_username" type="text" />  
						</p>
				
						<p>
							<label for="j_password">密&nbsp;&nbsp;码</label>
							<input id="j_password" name="j_password" type="password" />  
						</p>
						<input type="submit" value="登陆" class="button">
						&nbsp;&nbsp;&nbsp;
						<input type="submit" value="注册" class="button">
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="bottom">
		<hr style="color: #A9D7F1;width: 98%;"/>
		Copyright@2014 All Rights Reserved JEEEK-DP工程股份有限公司版权所有
	</div>
</body>
</html>