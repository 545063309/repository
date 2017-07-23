<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh-CN">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎登录</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
      <script src="/js/jquery.cookie.js"></script>
    <![endif]-->
  </head>
<body onLoad="document.getElementById('user_id').focus();GetCookie();"> 
<div class="tou6"></div>
<div class="container-fluid">
	<div class="row">
	<div class="col-md-12 forimg">
		<h2>欢迎您登陆壹号商城</h2>
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
					<form action="login" method="post" class="form-horizontal" role="form">
						<div class="input-group">
							<span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-user"></span></span>
							<input type="text" class="form-control" placeholder="用户账号" aria-describedby="sizing-addon2" name="user_id" id="user_id">
						</div>
						<div class="input-group product-option-shop">
							<span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-lock"></span></span>
							<input type="password" class="form-control" placeholder="用户密码" aria-describedby="sizing-addon2" name="user_pwd" id="user_pwd">
						</div>
						<div class="form-group forimg">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox" style="width:100px">
									<label>
										<input type="checkbox" name="checkbox" id="checkbox"/>记住密码
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10" style="text-align:center">
								<button type="submit" class="btn btn-default" OnClick="checkInCorrect()">
									登陆
								</button>
								<a class="btn btn-info" href="enroll" role="button" >立即注册</a>
								<a href="findpassword" type="submit" class="btn btn-default" role="button">
									忘记密码
								</a>
							</div>
						</div>
					</form>
					<div style="text-align:center;"><font color="red">${requestScope.message}</font></div>					
				</div>
				<div class="col-md-3">
				</div>
			</div>
		</div>
	</div>
</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="/js/jquery.cookie.js"></script>    
<script type="text/javascript">  
function checkInCorrect()      //判断用户名和密码是否为空 
{ 
     if (document.getElementById('user_id').value=="") 
   { 
    alert('请输入用户名！') 
    document.getElementById('user_id').focus(); 
    return false 
   } 
   if (document.getElementById('user_pwd').value=="") 
   { 
    alert('请输入密码！') 
    document.getElementById('user_pwd').focus(); 
    return false 
   } 
   else 
   { 
    saveInfo(); 
    return true; 
   } 
} 
  
  
saveInfo = function(){ 
try{ 
   var isSave = document.getElementById('checkbox').checked;   //保存按键是否选中 
   if (isSave) { 
    var user_id = document.getElementById('user_id').value; 
    var user_pwd = document.getElementById('user_pwd').value; 
    if(user_id!="" && user_pwd!=""){ 
     SetCookie(user_id,user_pwd); 
    } 
   }else {   
    SetCookie("",""); 
   } 
}catch(e){ 
  
} 
} 
  
function SetCookie(id,pwd){ 
var Then = new Date()  
Then.setTime(Then.getTime() + 1866240000000)  
document.cookie ="username=" + id + "%%"+pwd+";expires="+ Then.toGMTString() ; 
} 
  
  
function GetCookie(){  
var info; 
var user_id; 
var user_pwd; 
var cookieString = new String(document.cookie) 
var cookieHeader = "username=" 
var beginPosition = cookieString.indexOf(cookieHeader) 
cookieString = cookieString.substring(beginPosition); 
var ends=cookieString.indexOf(";"); 
if (ends!=-1){ 
   cookieString = cookieString.substring(0,ends); 
} 
if (beginPosition>-1){ 
   info = cookieString.substring(cookieHeader.length); 
   if (info!=""){ 
    beginPosition = info.indexOf("%%"); 
    user_id=info.substring(0,beginPosition); 
    user_pwd=info.substring(beginPosition+2); 
    document.getElementById('user_id').value=user_id; 
    document.getElementById('user_pwd').value=user_pwd; 
    if(user_id!="" && user_pwd!=""){ 
     document.forms[0].checkbox.checked = true 
    } 
   }  
} 
} 
</script>	
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="/js/jquery.cookie.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
