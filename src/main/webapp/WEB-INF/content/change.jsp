<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh-CN">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改密码</title>
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
<div class="tou6"></div>
<div class="container-fluid">
	<div class="row">
	<div class="col-md-12 forimg">
		<h2>用户修改密码</h2>
	</div>
	</div>
</div>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-3">
				</div>
				<div class="col-md-6">
					<img src="img/logo.jpg" class="img-circle showimg"/>
					<div id="changeheight"></div>
					<form action="changepwd?user_id=${sessionScope.user.user_id}" method="post" class="form-horizontal" role="form">
						<div class="input-group">
							<span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" class="form-control" placeholder="请输入原密码" aria-describedby="sizing-addon2" name="forepwd">
						</div>
						<div class="input-group product-option-shop">
							<span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="text" class="form-control" placeholder="请输入新密码" aria-describedby="sizing-addon2" name="newpwd">
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10 forimg">
								<button type="submit" class="btn btn-default">
									修改密码
								</button>
							</div>
						</div>
					</form>
					<div class="forimg"><font color="red">${requestScope.message}</font></div>
				</div>
				<div class="col-md-3">
				</div>
			</div>
		</div>
	</div>
</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
