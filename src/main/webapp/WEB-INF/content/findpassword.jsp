<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh-CN">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>找回密码</title>
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
<div class="tou3"></div>
<div class="container-fluid">
	<div class="row">
	<div class="col-md-12 forimg">
		<h2>找回密码</h2>
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
					<img src="img/logo.jpg" class="img-circle showimg2"/>
					<div id="changeheight"></div>			
						<form action="sendpwdmail" method="post">
						<div class="input-group">
							<span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" class="form-control" placeholder="用户账号" aria-describedby="sizing-addon2" name="user_id">
						</div>
						<div id="submit1"><button type="submit" class="btn btn-info">点击发送短信到账户绑定邮箱</button></div>
						</form>
						<div style="text-align:center;"><font color="red">${requestScope.pwdmessage}</font></div>
				</div>
				<div class="col-md-3">
				</div>
			</div>
		</div>
	</div>
</div>			
</body>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</html>