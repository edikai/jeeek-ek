<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		
		<title>文件上传</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" language="javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" language="javascript" src="<%=path%>/js/ajaxfileupload.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
	<span style="font-size: 14px;"> 
		<input type="file" name="fileToUpload" id="fileToUpload"/>
		<input type="button" id="buttonUpload" onclick="ajaxFileUpload();" value="Upload">
	</span> 
	</body>
</html>
<script type="text/javascript">  

function ajaxFileUpload(){

	$.ajaxFileUpload({
		url:'<%=path%>/fileController/upload.html',  
		secureuri:false,  
		fileElementId:'fileToUpload',  
		dataType: 'json',  
		success: function (data, status){
			alert(data.status+' '+data.result);
		},
		error: function (data, status, e){
			alert(data.status);  
			alert(data.message+" error:  "+e);  
		}
	});
	
}
</script> 