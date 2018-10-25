<%@include file="../../WEB-INF/taglib/taglibs.inc"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>用户列表</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/common/table.css">
</head>
<body>

	<div id="subform">
		<form class="form-horizontal" role="form">
			<div class="form-group">
				<label for="logName" class="col-sm-1 col-sm-1-ml-1 control-label">登陆名称</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="logName"
						   placeholder="请输入名字" v-model="logName" >
				</div>
				<label for="userName" class="col-sm-1 control-label">用户名称</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="userName" placeholder="请输入标签" v-model="userName">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-5 col-sm-3">
					<button type="button" class="btn btn-sm btn-info">查询</button>
					&nbsp;&nbsp;
					<button type="button" class="btn btn-sm btn-primary" data-toggle="modal"
							data-target="#user_add" >添加</button>
					&nbsp;&nbsp;
					<button type="button" class="btn btn-sm btn-default" onclick="resetForm()">重置</button>
				</div>
			</div>
		</form>
	</div>

	<div class="table-responsive">
		<table class="table table-bordered table-hover table-condensed">
			<caption>
				<c:if test="${empty requestScope.returnFlag }">
					<span>&nbsp;&nbsp;为查询到数据</span>
				</c:if>
				<c:if test="${not empty requestScope.returnFlag}">
					<c:if test="${requestScope.returnFlag == '1'}">
						<span  style="color: green;">&nbsp;&nbsp;查询成功</span>
					</c:if>
					<c:if test="${requestScope.returnFlag == '0'}">
						<span style="color: red;">&nbsp;&nbsp;查询失败</span>
					</c:if>
				</c:if>
			</caption>
			<thead>
			<tr>
				<th>序号</th>
				<th>登录名称</th>
				<th>用户名称</th>
				<th>注册时间</th>
				<th>操作</th>
			</tr>
			</thead>
			<tbody>
			<c:if test="${returnFlag==1 }">
				<c:forEach var="user" items="${users }" varStatus="idx">
					<tr>
						<td>${idx.index+1 }</td>
						<td>${user.logName }</td>
						<td>${user.userName }</td>
						<td>${user.createTime }</td>
						<td>
							<button type="button" class="btn btn-xs btn-primary" data-toggle="modal"
									data-target="#user_modify" data-id="${user.userId}" >修改</button>
							<button type="button" class="btn btn-xs btn-danger" data-toggle="modal"
									data-target="#user_remove" data-id="${user.userId}" >删除</button>
						</td>
					</tr>
				</c:forEach>
			</c:if>
			</tbody>
		</table>
	</div>

	<div class="modal fade" id="user_add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="mdfModalLabel">
						新增用户
					</h4>
				</div>
				<div id="addBody" class="modal-body">

				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
</body>
<script type="text/javascript">
	var path = EK.getContextPath();
	var vm = new Vue({
		el: '#subForm',
		data: {
			logName: '',
			userName: ''
		}
	});
	$(document).ready(function(){
		
	});
	function resetForm() {
		vm.logName = '';
		vm.userName = '';
	}

	$('#user_add').on('show.bs.modal', function (event) {
		$("#addBody").load(path+"/user/toAddInit.html");
	});

	$('#user_modify').on('show.bs.modal', function (event) {
		$("#modifyBody").load("");
	});
</script>
</html>
