!function() {
	$(function() {
		$("#current-year").text(new Date().getFullYear());
		var contextPath = window.location.origin + '/'
				+ window.location.pathname.split('/')[1];//获取上下文路径 

		tinymce.init({
			selector : 'textarea',
			language : 'zh_CN'
		});

		$("#publish-article").on('click', function() {
			var title = $("#article-title").val();
			var content = tinymce.get('article-content').getContent();
			console.log(title);
			console.log(content);

			var _param = {};
			_param.title = title;
			_param.content = content;
			$.ajax({
				url : contextPath + "/article/add.do",
				type : "POST",
				contentType : "application/json",
				data : JSON.stringify(_param),
				success : function(res) {
					alert(res);
				}
			});

		});

	});

}();