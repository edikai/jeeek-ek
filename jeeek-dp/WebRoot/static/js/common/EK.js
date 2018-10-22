function EK(){
	
};
EK.prototype.getCookie = function(c_name){
	var c_start=document.cookie.indexOf(c_name+"=");
	if(c_start != -1){
		c_start=c_start + c_name.length+1;
		var c_end = document.cookie.indexOf(";", c_start);
		if(c_end == -1){
			c_end = document.cookie.length;
			return document.cookie.substr(c_start, c_end);
		}
	}
	return "";
};

/**
 * 客户端与服务器端的时间差
 * @param timeIntv
 */
EK.prototype.showTime = function(timeIntv){
	var nowTime = new Date();//创建时间对象实例

	var year = nowTime.getYear();
	year = year > 1900 ? year : year + 1900;
	var month = nowTime.getMonth() + 1;
	var day = nowTime.getDate() + parseInt(timeIntv[0]);
	var hours = nowTime.getHours() + parseInt(timeIntv[1]);//获取当前小时数
	var minutes = nowTime.getMinutes() + parseInt(timeIntv[2]);//获取当前分钟数
	var seconds = nowTime.getSeconds() + parseInt(timeIntv[3]);//获取当前秒数

	var timer = year + "-";
	timer += ((month < 10) ? "0" : "") + month + "-";
	timer += ((day < 10) ? "0" : "") + day + " ";
	timer += ((hours < 10) ? "0" : "") + hours + ":";//将小时数质赋予变量timer
	timer += ((minutes < 10) ? "0" : "") + minutes + ":";//将分钟数值赋予变量timer
	timer += ((seconds < 10) ? "0" : "") + seconds;//将秒数值赋予变量timer
	document.getElementById('time').innerHTML = timer;
	setTimeout("showTime()", 1000);
}

EK.prototype.isEmpty = function (obj) {
	return null == obj ? true : (obj.length <= 0 ? true : false);
}

EK.prototype.getContextPath = function () {
	var pathName = document.location.pathname;
	var index = pathName.substr(1).indexOf("/");
	var path = pathName.substr(0,index+1);
	return path;
}


























var EK = new EK();