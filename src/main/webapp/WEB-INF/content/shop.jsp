<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="en">
  <head>                                                                      
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap 3, from LayoutIt!</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

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
					<div class="tabbable" id="tabs-859160">
						<div class="col-md-4">
							<div class="col-md-4"></div>
							<div class="col-md-4"></div>
							<div class="col-md-4">
									<ul class="nav nav-tabs">
										<li class="active fullwidth">
											<a href="#panel-100001" data-toggle="tab" class="forimg">服装</a>
										</li>
										<li class="fullwidth">
											<a href="#panel-100002" data-toggle="tab" class="forimg">图书</a>
										</li>
										<li class="fullwidth">
											<a href="#panel-100003" data-toggle="tab" class="forimg">文具</a>
										</li>
										<li class="fullwidth">
											<a href="#panel-100004" data-toggle="tab" class="forimg">食品</a>
										</li>
									</ul>				
							</div>
						</div>
						<div class="col-md-8">
						<div class="tab-content">
							<div class="tab-pane active" id="panel-100001">
								<div class="col-md-6">
									<a href="detail?id=3"><img src="img/clo1.jpg" class="showimg"></a>
									<h2>特步男子短袖T恤</h2>
									<p>
									特步男子短袖T恤2017夏季新款轻盈透气户外运动宽松圆领短袖 浅灰 2XL
									</p>
									<p>
									<a class="btn" href="detail?id=3">查看详情 »</a>
									</p>
								</div>
								<div class="col-md-6">
								<a href="detail?id=4"><img src="img/clo2.jpg" class="showimg"></a>
									<h2>休闲运动短袖T恤</h2>
									<p>
									轻薄透气百搭男子休闲圆领吸湿排汗综训运动短袖T恤 灰绿 L
									</p>
									<p>
									<a class="btn" href="detail?id=4">查看详情 »</a>
									</p>
								</div>
							</div>
							<div class="tab-pane" id="panel-100002">
								<div class="tab-pane active" id="panel-100001">
									<div class="col-md-6">
										<a href="detail?id=1"><img src="img/book1.jpg" class="showimg"></a>
										<h2>将来的你一定会感谢现在拼命的自己</h2>
										<p>
										将来的你一定会感谢现在拼命的自己 青春励志畅销正能量书籍
										</p>
										<p>
										<a class="btn" href="detail?id=1">查看详情 »</a>
										</p>
									</div>
									<div class="col-md-6">
										<a href="detail?id=2"><img src="img/book2.jpg" class="showimg"></a>
										<h2>人性的弱点全集</h2>
										<p>
										人性的弱点全集正版成功学畅销口才训练书籍
										</p>
										<p>
										<a class="btn" href="detail?id=2">查看详情 »</a>
										</p>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-100003">
								<div class="tab-pane active" id="panel-100001">
									<div class="col-md-6">
										<a href="detail?id=7"><img src="img/sta1.jpg" class="showimg"></a>
										<h2>商务记事本</h2>
										<p>
										笔记本文具皮商务记事本16K大号本子
										</p>
										<p>
										<a class="btn" href="detail?id=7">查看详情 »</a>
										</p>
									</div>
									<div class="col-md-6">
										<a href="detail?id=8"><img src="img/sta2.jpg" class="showimg"></a>
										<h2>得力s52签字笔</h2>
										<p>
										得力s52中性笔碳素笔水笔签字笔黑笔办公文具书写笔30支/桶
										</p>
										<p>
										<a class="btn" href="detail?id=8">查看详情 »</a>
										</p>
									</div>
								</div>
							</div>
							<div class="tab-pane" id="panel-100004">
								<div class="tab-pane active" id="panel-100001">
									<div class="col-md-6">
										<a href="detail?id=5"><img src="img/delicacy1.jpg" class="showimg"></a>
										<h2>良品铺子奶油味夏威夷果</h2>
										<p>
										良品铺子奶油味夏威夷果 奶油口味特产干货干果坚果零食小吃袋装
										</p>
										<p>
										<a class="btn" href="detail?id=5">查看详情 »</a>
										</p>
									</div>
									<div class="col-md-6">
										<a href="detail?id=6"><img src="img/delicacy2.jpg" class="showimg"></a>
										<h2>日加满运动饮品果汁饮料</h2>
										<p>
										【600ml*6瓶*2箱】日加满 力水青柠味运动饮品果汁饮料 恢复体能
										</p>
										<p>
										<a class="btn" href="detail?id=6">查看详情 »</a>
										</p>
									</div>
								</div>
							</div>
						</div>
						</div>
					</div>

	</div>
	
	<div class="row">
		<div class="col-md-8">
			<div class="row">
				<div class="col-md-2">
				</div>
				<div class="col-md-8">
					<div class="tabbable" id="tabs-859160">
						<ul class="nav nav-tabs">
							<li class="active">
								<a href="#panel-259346" data-toggle="tab">热销商品</a>
							</li>
							<li>
								<a href="#panel-160942" data-toggle="tab">最新上架</a>
							</li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane active" id="panel-259346">
								<div>
								<a href="detail?id=3"><img src="img/clo1.jpg" class="showimg"></a>
								<a href="detail?id=5"><img src="img/delicacy1.jpg" class="showimg"></a>
								</div>
							</div>
							<div class="tab-pane" id="panel-160942">
								<div class="tab-pane active" id="panel-259346">
								<div>
								<a href="detail?id=4"><img src="img/clo2.jpg" class="showimg"></a>
								<a href="detail?id=6"><img src="img/delicacy2.jpg" class="showimg"></a>
								</div>
							</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-2">
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="row">
			<div class="col-md-12 tou5"></div>
			</div>
			<div class="row">
				<div class="col-md-6">
					 <span class="label label-default">新手指南</span>
					 <br/>
					 <br/>
					 <br/>
					 <br/>
					 <a href="about" role="p">关于我们</a>
					 <br/><br/><br/><br/>
					 <a href="enroll">注册新用户</a>
				</div>
				<div class="col-md-6">
					 <span class="label label-default">网站导航</span>
					 <br/>
					 <br/>
					 <br/>
					 <a href="https://www.taobao.com/">淘宝网</a>
					 <br/><br/><br/>
					 <a href="https://www.jd.com/">京东商城</a>
					 <br/><br/><br/>
					 <a href="http://www.dangdang.com/">当当网</a>
					 <br/>
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

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>