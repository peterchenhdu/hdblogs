!function(){
	var contextPath = window.location.origin + '/'
	+ window.location.pathname.split('/')[1];//获取上下文路径 
	$("#login-btn").on('click', function() {
		var userName = $("#username").val();
		var passWord = $("#password").val();
		alert("hi");
		
		
		
		var _param = {};
		_param.userName = userName;
		_param.passWord = passWord;
		$.ajax({
			url : contextPath + "/user/login.do",
			type : "POST",
			contentType : "application/json",
			data : JSON.stringify(_param),
			success : function(res) {
				alert(res);
				location.reload();
			}
		});

	});
	
	$("#logout-a").on('click', function() {
		alert("logout");
		$.ajax({
			url : contextPath + "/user/logout.do",
			type : "POST",
			contentType : "application/json",
			data : {},
			success : function(res) {
				alert(res);
				location.reload();
			}
		});

	});
}();