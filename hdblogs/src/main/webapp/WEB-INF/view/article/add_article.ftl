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

    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <div class="navbar-left">
              <a class="blog-nav-item" href="#">HDBlogs</a>
              <a class="blog-nav-item" href="${rc.contextPath}/index/user.do?userId=${Session.userID}">主页</a>
              <a class="blog-nav-item" href="#">联系</a>
              <a class="blog-nav-item active" href="${rc.contextPath}/article/toAddPage.do">管理</a>
          </div>
          
          <div class="navbar-right">
          
          <#if Session.userID?exists>
              <div class="user-box">
              <img src="${rc.contextPath}/resources/images/User-icon.png" alt="用户">
              <a href="#">${Session.userName}</a>  <span>&nbsp;|&nbsp;</span><a href="#" id="logout-a">退出</a>
              </div>
          <#else>
              <form class="navbar-form" id="loginForm">
                <div class="form-group">
                  <input id="username" placeholder="Email" class="form-control" type="text">
                </div>
                <div class="form-group">
                  <input id="password" placeholder="Password" class="form-control" type="password">
                </div>
                <button type="button" id="login-btn" class="btn btn-success">登陆</button>
              </form>
          </#if>  
          
          </div>
        </nav>
      </div>
    </div>

    <div class="container">



      <div class="row">
        <div class="edit-title">
        <b>标题</b><br/>
        <input id="article-title" style="width:100%"></input>
        </div>
        <div class="edit-body">
        <b>内容</b><br/>
        <textarea id="article-content" style="width:100%; height:360px;">Easy (and free!) You should check out our premium features.</textarea>
        </div>
        <div class="article-action" style="margin-top:10px;">
        <input class="btn btn-default" id="publish-article" type="button" value="发布">
        <input class="btn btn-default" type="button" value="存为草稿">
        <input class="btn btn-default" type="button" value="取消">
        </div>
      </div><!-- /.row -->

    </div><!-- /.container -->

    <footer class="blog-footer" style="margin-top:10px;">
      <p>Copyright ©<span id="current-year"></span> HDBlogs</p>
      <p>
        <a href="#">返回顶部</a>
      </p>
    </footer>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${rc.contextPath}/resources/plugins/jquery-1.11.3.js"></script>
    <script src="${rc.contextPath}/resources/plugins/bootstrap_3.3.5/js/bootstrap.min.js"></script>
    <script src="${rc.contextPath}/resources/plugins/tinymce/js/tinymce/tinymce.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug 
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>-->
    <script src="${rc.contextPath}/resources/js/article/add-article.js"></script>
  </body>
</html>
