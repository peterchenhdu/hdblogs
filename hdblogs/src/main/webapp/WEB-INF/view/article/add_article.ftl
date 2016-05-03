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
          <a class="blog-nav-item" href="#">HDBlogs</a>
          <a class="blog-nav-item" href="#">主页</a>
          <a class="blog-nav-item" href="#">联系</a>
          <a class="blog-nav-item active" href="article/add.do?userId=1">管理</a>
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
    <script>
    $(function(){
        $("#current-year").text(new Date().getFullYear());
        tinymce.init({ 
            selector:'textarea',
            language:'zh_CN'
        });
        
        $("#publish-article").on('click',function(){
            var title =  $("#article-title").val();   
            var content =  tinymce.get('article-content').getContent();   
            console.log(title);
            console.log(content);
        });
        
    });
    </script>
  </body>
</html>
