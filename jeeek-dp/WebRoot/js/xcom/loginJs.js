/**
 * @program: ek
 * @Date: 2018/10/11 19:43
 * @Author: Qin_HQing
 * @Version: V1.0
 * @Description:
 **/

var vm = new Vue({
	el: '#loginForm',
	data: {
		logName: "",
		passWord: "",
		nowTime: "",
		rembme: false
	}
});

function submit() {
	loginForm.submit();
}

$(function () {
	initTime();
	initInfo();
});

/**
 * 初始化用户登陆时间
 * @param
 * @Return:
 * @Author: Qin_HQing
 * @Date: 2018/10/11 19:44
 * @Description:
 **/
function initTime() {
	var nowTime = new Date();
	var year = nowTime.getYear();
	year = year > 1900 ? year : year + 1900;
	var month = nowTime.getMonth() + 1;
	var day = nowTime.getDate();
	var hours = nowTime.getHours();//获取当前小时数
	var minutes = nowTime.getMinutes();//获取当前分钟数
	var seconds = nowTime.getSeconds();//获取当前秒数
	var time = year + "-" + month + "-" + day
		+ " " + hours + ":" + minutes + ":" + seconds;;
	vm.nowTime = time;
}

/**
* 根据cookie信息，初始化用户登陆信息
* @param
* @Return:
* @Author: Qin_HQing
* @Date: 2018/10/11 19:44
* @Description:
**/
function initInfo() {
	var cu = EK.getCookie("loginInfo");
	if (cu.length != 0) {
		var u = cu.split(",");
		if (u.length > 0) {
			vm.rembme = true;
			vm.logName = u[0].replace("\"", "");
			vm.passWord = u[1].replace("\"", "");
		}
	}
}

/**
* 判断密码是否发生变化
* @param
* @Return:
* @Author: Qin_HQing
* @Date: 2018/10/11 19:46
* @Description:
**/
function pwdOnChanged() {
	$("#pwdChanged").val("1");
}

/**
 * 判断用户名是否发生变化
 * @param
 * @Return:
 * @Author: Qin_HQing
 * @Date: 2018/10/11 19:46
 * @Description:
 **/
function userNameChanged() {
	$("#passWord").val("");
	$("#pwdChanged").val("1");
}