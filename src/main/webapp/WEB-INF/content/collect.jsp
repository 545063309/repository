<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>收藏夹</title>

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
		<div class="col-md-4">
			<div class="row">
				<div class="col-md-4">
				</div>
				<div class="col-md-8">
					<a href="shop"><img src="img/logo.jpg" class="headimg"></a>
				</div>
			</div>
		</div>
		<div class="col-md-8">
			<div class="row">
				<div class="col-md-12 tou2">
				</div>
			</div>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-8">
			<nav class="navbar navbar-default" role="navigation">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" id="txt1" placeholder="搜索 壹号商城商品">
						</div> 
						<button type="submit" class="btn btn-sm">
							搜索
						</button>
					</form>
				</div>
			</nav>
				</div>
				<div class="col-md-2"></div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
		</div>
		<div class="col-md-8">
			<div class="col-md-12 tou2">
			</div>
			<div class="row">
				<div class="col-md-2">
				</div>
				<div class="col-md-2">
				</div>
				<div class="col-md-8">
					<div class="btn-group btn-group-lg">
						<a class="btn btn-default" href="clothes" role="button" ><em class="glyphicon glyphicon-align-left"></em>服装</a>
						<a class="btn btn-default" href="book" role="button" ><em class="glyphicon glyphicon-align-center"></em>图书</a>
						<a class="btn btn-default" href="stationary" role="button" ><em class="glyphicon glyphicon-align-right"></em>文具</a>
						<a class="btn btn-default" href="delicacy" role="button" ><em class="glyphicon glyphicon-align-justify"></em>食品</a>
					</div>
				</div>
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
          								<li><a href="order">我的订单</a>
          								<li><a href="change">修改密码</a></li>
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
		<div>
		     <div id="cartdiv">
		         <div class="floatleft"><h3>我的收藏夹</h3></div>
		         <div id="divcss1" class="forprice"><a class="btn btn-primary" href="clearcollect" role="button">清空收藏夹</a>
		         <hr></hr>
		     </div>
		         <table class="table table-hover">		    
				<c:forEach items="${requestScope.collect_list }" var="collect">
					<c:forEach items="${collect.good }" var="good">
					<tr >
						<td style="text-align:center;vertical-align:middle"><a href="detail?id=${good.id}"><img src="img/${good.good_image}" class="showimg"></a></td>
						<td style="text-align:center;vertical-align:middle"><h4>${good.good_name}</h4></td>
						<td style="text-align:center;vertical-align:middle">单价：<br/><font color=red>￥${good.good_price}</font></td>
						<td style="text-align:center;vertical-align:middle">
							<a class="btn btn-info" href="saveorder?good_id=${good.id}" role="button">立即购买</a>
					    </td>
					    <td style="text-align:center;vertical-align:middle">
							<a class="btn btn-success" href="save?id=${good.id}" role="button" >加入购物车</a>
					    </td>
					    <td style="text-align:center;vertical-align:middle">
							<a class="btn btn-danger" href="removecollect?id=${collect.id}" role="button">取消收藏</a>
					    </td>
				  </tr>
					</c:forEach>
				</c:forEach>		
		        </table>
		     </div>
		     <div id="divcss1" class="forimg"><a class="btn btn-lg btn-primary" href="shop" role="button">返回商城</a>
		     </div>
		 </div>
 	</div>
 
 
	<div class="tou"></div>
	<div class="row">
		<div class="col-md-12">
			<div class="row" id="downdiv">
				<div class="col-md-4">
					 <h4 class="forimg">新手指南</h4>
				</div>
				<div class="col-md-4">
					 <h5 class="forimg"><a href="about" role="h5">关于我们</a></h5>
				</div>
				<div class="col-md-4">
					 <h5 class="forimg"><a href="enroll">注册新用户</a></h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					 <h4  class="forimg">网站导航</h4>
				</div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6">
							 <h5 class="forimg"><a href="https://www.taobao.com/">淘宝网</a></h5>
						</div>
						<div class="col-md-6">
							 <h5 class="forimg"><a href="https://www.tmall.com/?spm=a3204.7084713.a2226mz.1.8IKGCS">天猫</a></h5>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6">
							 <h5 class="forimg"><a href="https://www.jd.com/">京东商城</a></h5>
						</div>
						<div class="col-md-6">
							 <h5 class="forimg"><a href="http://www.dangdang.com/">当当网</a></h5>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
	<div class="col-md-12 tou2"></div>
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
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>