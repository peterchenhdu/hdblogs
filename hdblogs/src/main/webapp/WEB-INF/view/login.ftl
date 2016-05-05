<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${rc.contextPath}/resources/images/favicon.ico">

    <title>HDBlogs</title>

    <!-- Bootstrap core CSS -->
    <link href="${rc.contextPath}/resources/plugins/bootstrap_3.3.5/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${rc.contextPath}/resources/css/blog.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  
</head>
<body>
	
	<div class="warpper">
		<!--header---->

		<!-- 页面主体 -->
		<div class="main" style="text-align: center;">
			<div class="form-wrapper">
				<fieldset>
				<legend>登录</legend>
				<form id="form1" class="form-horizontal" method="post" action="${rc.contextPath}/user/login.htm">
				  <div class="control-group">
				    <label class="control-label" for="inputName">UserName:</label>
				    <div class="controls">
				      <input type="text" id="inputName" value="" name="name">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputPassword">Password:</label>
				    <div class="controls">
				      <input type="password" id="inputPassword" value="" name="password" >
				    </div>
				  </div>
				  <div class="control-group">
				    <div class="controls">
				      <button type="submit" class="btn btmar">Sign in</button>
				    </div>			
				  </div>
				  <div class="control-group">
				    <div class="controls">
				    	<label style="color:#eba3a9;" id="message">
				    		<#if message?exists>
				    			<#if (message=="INVALID_USER")>
				    				无效的用户登录信息，请检查你的账户和密码信息。
				    			<#else>
				    				系统内部错误。
				    			</#if>
				    		</#if>
				    	</label>
				    </div>
				  </div>
				</form>
				</fieldset>
			</div>
		</div>
		<!-- 底部 -->

	</div>
</body>
</html>