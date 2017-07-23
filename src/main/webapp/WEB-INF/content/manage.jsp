<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!DOCTYPE html>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
  <head>                                                                            
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>壹号商城管理后台</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
		<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
		<script>
		function TestBlack(TagName){
		var obj = document.getElementById(TagName);
		if(obj.style.display==""){
		obj.style.display = "none";
			}else{
		obj.style.display = "";
			}
		}
		</script>
  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12 tou2">
		</div>
	</div>    
	<div class="row">
		<div class="col-md-4 floatleft">
			<img src="img/logo.jpg" class="showimg3">
		</div>
		<div class="col-md-8">
			<ul class="nav nav-pills">
				<li class="dropdown pull-right">
					<a href="#" data-toggle="dropdown" class="dropdown-toggle">管理员<strong class="caret"></strong></a>
					<ul class="dropdown-menu">
						<li>
							<a href="managelogin">退出管理页</a>
						</li>
					</ul>
				</li>
			</ul>
			<h3 class="text-center text-success">
				壹号商城后台管理页
			</h3>
		</div>
	</div>
	<div class="row tou2">
	<p class="manageleft">当前在线人数:<% out.println(application.getAttribute("count"));%></p>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="tabbable" id="tabs-475738">
				<ul class="nav nav-tabs">
					<li class="active">
						<a href="#panel-1" data-toggle="tab">库存管理</a>
					</li>
					<li>
						<a href="#panel-2" data-toggle="tab">订单管理</a>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-1">
						<div class="tabbable" id="tabs-475738">
							<ul class="nav nav-tabs">
								<li class="active">
									<a href="#panel-11" data-toggle="tab">查看库存</a>
								</li>
								<li>
									<a href="#panel-12" data-toggle="tab">补货入库</a>
								</li>
								<li>
									<a href="#panel-13" data-toggle="tab">新品上架</a>
								</li>								
							</ul>
							<div class="tab-content">
							
<!-- 查看库存 -->
								<div class="tab-pane active" id="panel-11">
									<div class="showdiv">
										<div>
										<table class="table table-hover">
											<tr>
												<td class="managewidth">商品名称</td>
												<td>商品编号</td>
												<td>库存数量</td>
											</tr>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc1')">服装<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc1" class="displaynone">
											<c:forEach items="${requestScope.clothes_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc2')">图书<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc2" class="displaynone">
											<c:forEach items="${requestScope.book_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc3')">文具<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc3" class="displaynone">
											<c:forEach items="${requestScope.stationary_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table> 
										</div>
										<div>   
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc4')">食品<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc4" class="displaynone">
											<c:forEach items="${requestScope.delicacy_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
									</div>
								</div>
								
<!-- 补货入库 -->								
								<div class="tab-pane" id="panel-12">
									<div class="showdiv">
										<div>
										<table class="table table-hover">
											<tr>
												<td class="managewidth">商品名称</td>
												<td>商品编号</td>
												<td>库存数量</td>
											</tr>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc5')">服装<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc5" class="displaynone">
											<c:forEach items="${requestScope.clothes_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc6')">图书<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc6" class="displaynone">
											<c:forEach items="${requestScope.book_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
										<div>
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc7')">文具<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc7" class="displaynone">
											<c:forEach items="${requestScope.stationary_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table> 
										</div>
										<div>   
										<button class="btn btn-xs btn-info" onclick="TestBlack('divc8')">食品<strong class="caret"></strong></button>
										<table class="table table-hover" id="divc8" class="displaynone">
											<c:forEach items="${requestScope.delicacy_list}" var="good">
											<tr>  
												<td class="managewidth">${good.good_name}</td>
												<td>${good.good_number}</td>
												<td><font color="red">${good.good_count}</font></td>
											</tr>
											</c:forEach>
										</table>
										</div>
									</div><br/><br/>
									<form action="addgood" method="post" class="form-inline showdiv2">
										<div class="form-group forimg">
											<label>商品编号</label>
											<input type="text" class="form-control" name="addgood_number" />
										</div><br/><br/>
										<div class="form-group forimg">
											<label>补货数量</label>
											<input type="text" class="form-control" name="addgood_count" />
										</div><br/><br/>
										<div class="forimg">
										<button type="submit" class="btn btn-default">提交补货单</button>
										</div>
									</form>
								</div>
								
<!-- 新品上架-->
								<div class="tab-pane" id="panel-13">	
									<br/><br/>
									<div class="forimg">
									<form action="newgood" method="post" class="form-inline showdiv3">
										<div class="form-group forimg">
											<label>商品名称</label>
											<input type="text" class="form-control" name="newgood_name" />
										</div>
										<div class="form-group forimg">
											<label>商品类别</label>
											<input type="text" list="list_add" class="form-control" name="newgood_type" />
										</div>
										<div class="form-group forimg">
											<label>商品编号</label>
											<input type="text" class="form-control" name="newgood_number" />
										</div><br/><br/>
										<div class="form-group forimg">
											<label>商品价格</label>
											<input type="text" class="form-control" name="newgood_price" />
										</div>
										<div class="form-group forimg">
											<label>初期库存</label>
											<input type="text" class="form-control" name="newgood_count" />
										</div><br/><br/><br/>
										<div class="form-group forimg">
											<label>请将商品图片置于网站文件夹下</label>
											<input type="file" accept="image" name="newgood_image"/>
										</div>
										<br/><br/>
										<div class="forimg">
										<button type="submit" class="btn btn-default">提交上架</button>
										</div>
									</form>
									</div>
									<div class="forimg">
										<datalist id="list_add">
										<option value="clothes"/>
										<option value="bood"/>
										<option value="stationary"/>
										<option value="delicacy"/>
										</datalist>
									</div>
								</div>
								
								
							</div>
						</div>
					</div>
					
					
					
					
					<div class="tab-pane" id="panel-2">
						<div class="tab-pane" id="panel-2">
						<div class="tabbable" id="tabs-475738">
							<ul class="nav nav-tabs">
								<li class="active">
									<a href="#panel-21" data-toggle="tab">未发货</a>
								</li>
								<li>
									<a href="#panel-22" data-toggle="tab">已发货未完成</a>
								</li>
								<li>
									<a href="#panel-23" data-toggle="tab">订单反馈</a>
								</li>								
							</ul>
							<div class="tab-content">								
<!-- 未发货																	 -->
								<div class="tab-pane active" id="panel-21">
									<div class="showdiv3">
										<div>
										<table class="table table-hover">
											<tr>
												<td class="managelist10">订单id</td>
												<td class="managelist40">商品名称</td>
												<td class="managelist10">商品单价</td>
												<td class="managelist5">订单状态</td>
												<td class="managelist10">商品编号</td>
												<td class="managelist5">订单数量</td>
												<td class="managelist10">发货确认</td>
											</tr>
										</table>
										</div>
										<div>
											<table class="table table-hover">
											<c:forEach items="${requestScope.order_list1 }" var="order">
												<c:forEach items="${order.good }" var="good">
												<tr>
													<td class="managelist10">${order.id}</td>			
													<td class="managelist40"><h4>${good.good_name}</h4></td>
													<td class="managelist10"><font color=red>￥${good.good_price}</font></td>
													<td class="managelist5"><font color=red>${order.order_state}</font></td>
													<td class="managelist10">${good.good_number}</td>
													<td class="managelist5">${order.count}</td>
													<td class="managelist10">
													<a class="btn btn-info" href="sendout?id=${order.id}" role="button">立即发货</a>
												    </td>
									  			</tr>
												</c:forEach>		
											</c:forEach>
											</table>
										</div>
									</div>
								</div>
								
								
<!-- 已发货未确认								 -->								
								<div class="tab-pane" id="panel-22">
									<div style="width:80%;margin:auto auto;">
										<div>
										<table class="table table-hover">
											<tr>
												<td class="managelist10">订单id</td>
												<td style="text-align:center;yvertical-align:middle;width:40%">商品名称</td>
												<td class="managelist10">商品单价</td>
												<td class="managelist5">订单状态</td>
												<td class="managelist10">商品编号</td>
												<td class="managelist5">订单数量</td>
												<td class="managelist10">订单通知</td>
											</tr>
										</table>
										</div>
										<div>
											<table class="table table-hover">
											<c:forEach items="${requestScope.order_list2 }" var="order">
												<c:forEach items="${order.good }" var="good">
												<tr>
													<td class="managelist10">${order.id}</td>			
													<td class="managelist40"><h4>${good.good_name}</h4></td>
													<td class="managelist5"><font color=red>￥${good.good_price}</font></td>
													<td class="managelist10"><font color=red>${order.order_state}</font></td>
													<td class="managelist10">${good.good_number}</td>
													<td class="managelist5">${order.count}</td>
													<td class="managelist10">
													<a class="btn btn-info" href="sendordermail?id=${order.id}" role="button">发送订单通知</a>
												    </td>
									  			</tr>
												</c:forEach>		
											</c:forEach>
											</table>
										</div>
									</div>
								</div>

<!-- 订单反馈									 -->
								<div class="tab-pane" id="panel-23">									
									<div class="showdiv3">
										<div>
										<table class="table table-hover">
											<tr>
												<td class="managelist10">订单id</td>
												<td class="managelist40">商品名称</td>
												<td class="managelist10">商品单价</td>
												<td class="managelist5">订单状态</td>
												<td class="managelist10">商品编号</td>
												<td class="managelist5">订单得分</td>
												<td class="managelist10">评论详情</td>
											</tr>
										</table>
										</div>
										<div>
											<table class="table table-hover">
											<c:forEach items="${requestScope.order_list3 }" var="order">
												<c:forEach items="${order.good }" var="good">
												<tr>
													<td class="managelist10">${order.id}</td>			
													<td class="managelist40"><h4>${good.good_name}</h4></td>
													<td class="managelist10"><font color=red>￥${good.good_price}</font></td>
													<td class="managelist5"><font color=red>${order.order_state}</font></td>
													<td class="managelist10">${good.good_number}</td>
													<td class="managelist5">${order.comment_count}</td>
													<td class="managelist10">
											    	<div>
													<a id="modal-381987" href="#modal-container-381987" role="button" class="btn" data-toggle="modal">点击查看评论详情</a>
														<div class="modal fade" id="modal-container-381987" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
															<div class="modal-dialog">
																<div class="modal-content">
																	<div class="modal-header">
																		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
																			×
																		</button>
																		<h4 class="modal-title" id="myModalLabel">
																			评论详情
																		</h4>
																	</div>
																	<form action="comment" method="post" class="form-inline" id="ordercount">
																	<div class="modal-body">
																		<label>商品得分:</label>
																		<p>${order.comment_count}</p>
																	</div>
																	<div class="modal-body forimg">
																		<label>评论配图</label>
																	<img src="img/${order.comment_image}" class="showimg">
																	<textarea name="comment_text" class="fullwidth">${order.comment_text}</textarea>
																	</div>
																	<div class="modal-footer">
																		<button type="button" class="btn btn-default" data-dismiss="modal">
																			关闭
																		</button>
																	</div>
																	</form>											
																</div>
															</div>
														</div>
													</div>
												    </td>
									  			</tr>
												</c:forEach>		
											</c:forEach>
											</table>
										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div>
					</div>
					
					
					
				</div>
			</div>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>