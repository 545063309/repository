<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>关于我们</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
     <div class="container-fluid">
	<div class="row">
		<div class="col-md-12 tou">
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-8">
			<div class="col-md-12 tou2">
			</div>
			<div class="row">
				<div class="col-md-12">
					<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
						<div class="navbar-header">
							 
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
							</button> <a class="navbar-brand" href="#">欢迎来到壹号商城</a>
						</div>
						
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav navbar-right">
								<li>
									<a href="cart">购物车</a>
								</li>
								<li>
									<a href="collect">收藏夹</a>
								</li>
								<li class="dropdown li">
          							<a class="dropdown-toggle" role="button" aria-expanded="false" aria-haspopup="true" href="#" data-toggle="dropdown"><font color="#76cb9a" face="幼圆" size="4">欢迎您，${sessionScope.user.user_name}</font><span class="caret"></span></a>
          							<ul class="dropdown-menu">
             							<li><a href="homepage">退出账户</a></li>
          							</ul>
        						</li>
        					</ul>
						</div>
						
					</nav>
				</div>
			</div>
		</div>
		<div class="col-md-2">
		</div>
		<div class="col-md-12 tou2">
		</div>
	</div>


   <div class="row">
   <h2 id="abouth2">关于我们</h2>
   <div class="col-md-12" id="aboutdiv"><img src="img/logo.jpg"><br>
  </div>
  	<h6 class="forimg">壹号商城，品质保证。</h6>
    <h6 class="forimg">联系电话：87619256。</h6>
    <h6 class="forimg">联系地址：江苏徐州市中国矿业大学松4B1081。</h6>
  </div>


	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-8">
			<img src="img/down.jpg">
		</div>
		<div class="col-md-2">
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>