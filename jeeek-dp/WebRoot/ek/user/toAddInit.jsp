<%@include file="../../WEB-INF/taglib/taglibs.inc"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String succ = (String)request.getAttribute("success");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>新增用户</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
		<style type="text/css">
			.green {
				color: green;
			}
			.red {
				color: red;
			}
		</style>
	
	</head>
	<body>
		<c:if test="${not empty error}">
			<span style="color: red;">添加失败，可能原因：用户名已存在</span>
		</c:if>
		<c:if test="${not empty succ}">
			<span  style="color: green;">添加成功</span>
		</c:if>

		<div id="addForm">
			<form action="${pageContext.request.contextPath}/user/toAdd.html" method="post"
				  class="form-horizontal" role="form">
				<div class="form-group">
					<label for="logName" class="col-sm-3 col-sm-1-ml-1 control-label">{{logNameTag}}</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="logName"
								placeholder="请输入登陆名称" v-model="logName" required
								@blur.prevent="checkLogName">
						<span v-bind:class="[alert, checkRes ? green:red]">{{logNameCheckInfo}}</span>
					</div>
				</div>
				<div class="form-group">
					<label for="userName" class="col-sm-3 control-label">{{userNameTag}}</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="userName"
							   placeholder="请输入用户名称" v-model="userName" required>
					</div>
				</div>
				<div class="form-group">
					<label for="userName" class="col-sm-3 control-label">{{remarkTag}}</label>
					<div class="col-sm-8">
						<textarea class="form-control" id="remark" rows="3" v-model="remark"></textarea>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-5 col-sm-3">
						<button type="submit" class="btn btn-sm btn-primary" data-toggle="modal"
								data-target="#user_add" >添加</button>
						&nbsp;&nbsp;
						<button type="button" class="btn btn-sm btn-default" @click.prevent="resetAddForm">重置</button>
					</div>
				</div>
			</form>
		</div>
	</body>

	<script type="text/javascript">
		var addVm = new Vue({
			el: '#addForm',
			data: {
				logNameTag: '登陆名称',
				userNameTag: '用户名称',
				remarkTag: '备注',
				logName: '',
				userName: '',
				remark: '',
				logNameCheckInfo: '',
				checkRes: false,
				green: 'alert-success',
				red: 'alert-danger'
			},
			methods:{
				checkLogName: function () {
					if (this.logName){
						fetch(path+'/user/checkLogName/'+this.logName, {
							method: 'post',
							headers: {
								'Content-Type': 'application/x-www-form-urlencoded'
							}
							//body: 'logName='+this.logName
							//body: JSON.stringify(param)
						})
						.then(response => response.json())
						.then(function(msg){
							if (msg.code == '1'){
								addVm.checkRes = false;
								addVm.logNameCheckInfo = msg.msg;
							} else if (msg.code == '-1') {
								addVm.checkRes = true;
								addVm.logNameCheckInfo = msg.msg;
							}
						})
						.catch(error => console.error(error));

					} else {
						this.checkRes = false;
						this.logNameCheckInfo = "请输入"+this.logNameTag;
						return;
					}
				},
				resetAddForm: function () {
					this.logName = '';
					this.userName = '';
					this.remark = '';
				}
			}
		});

	</script>
</html>
