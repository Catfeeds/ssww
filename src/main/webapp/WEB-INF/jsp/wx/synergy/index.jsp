<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<title>协同平台</title>
<link rel="stylesheet" href="static/css/weui.min.css">
<link rel="stylesheet" href="static/css/jquery-weui.css">
<link rel="stylesheet" href="static/css/reset.css">
<link rel="stylesheet" href="static/css/box-flex.css">
<link rel="stylesheet" href="static/css/style.css">
<script src="static/js/store/jquery-2.1.4.js"></script>
<script src="static/js/store/adaptive.js" type="text/javascript"
	charset="utf-8"></script>
<script type="text/javascript">
	adaPtive(); //铺页面调用				
	//页面加载时调用
	$(function() {
		direction();
	});
	//用户变化屏幕方向时调用
	$(window).on('orientationchange', function(e) {
		direction();
	});
	//调用adaptive
	function adaPtive(max) {
		window['adaptive'].desinWidth = 720;
		window['adaptive'].baseFont = 24;
		window['adaptive'].scaleType = 1;
		window['adaptive'].maxWidth = max;
		window['adaptive'].init();
	}
	//判断手机屏幕方向
	function direction() {
		if (window.orientation == 90 || window.orientation == -90) {
			adaPtive(320);
			return false;
		} else if (window.orientation == 0 || window.orientation == 180) {
			adaPtive();
			return false;
		}
	}
</script>
<!-- jsp文件头和头部 -->
<%-- <%@ include file="../../system/index/top.jsp"%> --%>

</head>
<body class="no-skin">

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="page-content">
					<div class="hr hr-18 dotted hr-double"></div>
					<div class="row">
						<div class="col-xs-12">
							
							<div class="weui-msg wallet-main clearfix" style="margin-top: 0">
								<ul
									class="wallet-control flex flex-pack-justify flex-pack-center">
									<li class="flex flex-v flex-align-center" >
									<p style="font-size: 38px">1</p><br>
										<p>待办报价</p><br><a onclick="onclick1()"><em>点击查看</em></a></li>
									<li class="flex flex-v flex-align-center">
									<p style="font-size: 38px">3</p><br>
										<p>新的订单</p><br><a onclick="onclick1()"> <em>点击查看</em></a></li>
									<li class="flex flex-v flex-align-center">
										<p style="font-size: 38px">${size}</p><br>
										<p>待发货订单</p><br><a onclick="onclick1()"> <em>点击查看</em></a></li>
								</ul>
								<!-- 服务 -->
								<!-- <div class="weui-cells__title">功能服务</div> -->
								<div class="weui-grids">
									<a href="<%=basePath%>store/new_page" class="weui-grid js_grid">
										<div >
											<img style="width: 35px;height: 35px" src="static/images/store/newspaper.png" alt="">
										</div>
										<p class="weui-grid__label">新闻公告</p> </a> <a onclick="onclick1()"
										class="weui-grid js_grid">
										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/award_star_gold_2.png" alt="">
										</div>
										<p class="weui-grid__label">我的报价</p> </a> 
										<a href="<%=basePath%>order/receive_order?FVENDORID=${FVENDORID}"
										class="weui-grid js_grid">
										<div >
											<img style="width: 35px;height: 35px" src="static/images/store/page_paste.png" alt="">
										</div> 
										<p class="weui-grid__label">我的订单</p> </a> <a 
										class="weui-grid js_grid">
										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/table_relationship.png" alt="">
										</div>
										<p class="weui-grid__label">来往对账</p> </a> 
										
										<a onclick="onclick1()"
										class="weui-grid js_grid">
										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/star.png" alt="">
										</div>
										<p class="weui-grid__label">我的绩效</p> </a>
										
										 <a href="<%=basePath%>store/report"
										class="weui-grid js_grid">

										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/chart_curve.png" alt="">
										</div>
										<p class="weui-grid__label">报表分析</p> </a>
										
										 <a onclick="onclick1()"
										class="weui-grid js_grid">

										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/emotion_wink.png" alt="">
										</div>
										<p class="weui-grid__label">阳光采购</p> </a>
										
										 <a href="<%=basePath%>store/list_client"
										class="weui-grid js_grid">

										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/page_white_edit.png" alt="">
										</div>
										<p class="weui-grid__label">意见与建议</p> </a>
										
										 <a onclick="onclick1()"
										class="weui-grid js_grid">

										<div >
											<img style="width: 35px;height: 35px" src="static/images/synergy/user_male.png" alt="">
										</div>
										<p class="weui-grid__label">个人中心</p> </a>

								</div>
								<!-- 服务 -->
								
							</div>

							<!-- -------------------------------------------- -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
		</div>
		<!-- /.main-content -->


	</div>
	<!-- /.main-container -->

	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%-- <%@ include file="../../system/index/foot.jsp"%> --%>
	<script type="text/javascript">
		//$(top.hangge());
		function onclick1(){
			alert("暂无内容！！");
		}
	</script>


</body>
</html>