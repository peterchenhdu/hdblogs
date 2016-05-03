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

    <title>${userInfo.userName} - HDBlogs</title>

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
          <a class="blog-nav-item" href="#">HDBlogs</a>
          <a class="blog-nav-item active" href="#">主页</a>
          <a class="blog-nav-item" href="#">联系</a>
          <a class="blog-nav-item" href="#">管理</a>
        </nav>
      </div>
    </div>

    <div class="container">

      <div class="blog-header">
        <h1 class="blog-title">${userInfo.userName}</h1>
        <p class="lead blog-description">${userInfo.description}</p>
      </div>

      <div class="row">

        <div class="col-sm-8 blog-main">
        <#if articleList?exists>
        <#list articleList as article>   
          <div class="blog-post">
            <h2 class="blog-post-title">${article.title}</h2>
            <p class="blog-post-meta">${article.createDate?string("yyyy-MM-dd HH:mm:ss")} by <a href="#">${article.authorId}</a></p>
            <p>${article.content}</p>
          </div><!-- /.blog-post -->

        </#list>
        </#if>


          <nav>
            <ul class="pager">
              <li><a href="#">上一页</a></li>
              <li><a href="#">下一页</a></li>
            </ul>
          </nav>

        </div><!-- /.blog-main -->

        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>公告</h4>
            <p><span>用户名：</span>${userInfo.userName}</p>
            <p><span>注册年龄：</span>${userInfo.registerAge}</p>
            <p><span>关注：</span>${followCount}</p>
            <p><span>粉丝：</span>${followersCount}</p>
            <p><span>邮箱：</span>${userInfo.email}</p>
            <p>自我介绍：${userInfo.description}</p>
          </div>
          <div class="sidebar-module">
            <h4>归档</h4>
            <ol class="list-unstyled">
              <li><a href="#">March 2014</a></li>
              <li><a href="#">February 2014</a></li>
              <li><a href="#">January 2014</a></li>
              <li><a href="#">December 2013</a></li>
              <li><a href="#">November 2013</a></li>
              <li><a href="#">October 2013</a></li>
              <li><a href="#">September 2013</a></li>
              <li><a href="#">August 2013</a></li>
              <li><a href="#">July 2013</a></li>
              <li><a href="#">June 2013</a></li>
              <li><a href="#">May 2013</a></li>
              <li><a href="#">April 2013</a></li>
            </ol>
          </div>
          <div class="sidebar-module">
            <h4>链接</h4>
            <ol class="list-unstyled">
              <li><a href="#">GitHub</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Facebook</a></li>
            </ol>
          </div>
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div><!-- /.container -->

    <footer class="blog-footer">
      <p>Copyright ©<span id="current-year"></span> ${userInfo.userName} </p>
      <p>
        <a href="#">返回顶部</a>
      </p>
    </footer>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${rc.contextPath}/resources/plugins/jquery-1.11.3.js"></script>
    <script src="${rc.contextPath}/resources/plugins/bootstrap_3.3.5/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug 
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>-->
    <script>
    $(function(){
        $("#current-year").text(new Date().getFullYear());
    
    });
    </script>
  </body>
</html>
