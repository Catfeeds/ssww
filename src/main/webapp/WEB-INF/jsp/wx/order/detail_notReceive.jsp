<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>未接收订单明细</title>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<!-- <link rel="stylesheet" href="static/css/wxic.css" /> -->
<link href="static/css/indent_order.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="static/css/commonic.css" /> 
<!-- <link rel="stylesheet" type="text/css" href="static/themes/css/core.css">
<link rel="stylesheet" type="text/css" href="static/themes/css/icon.css"> -->
<link rel="stylesheet" type="text/css" href="static/themes/css/home.css">
		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="static/ace/css/bootstrap.css" />
<style type="text/css">
/* body
{
    background: url('static/images/timg.jpg')top center no-repeat; 
    background-size:cover;
    
} */
header {
    height: 170px;
    /* background-color: #06c1ae; */
    background-image: url(static/images/synergy/blue.jpg);
    position: fixed;
    width: 100%;
    z-index: 1;
    display: -webkit-box;
    top: 0;
}
.btn1 {
   /*  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.55); */
    touch-action: manipulation;
    border: 1px solid transparent;
    padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    border-radius:0 5px 5px 0;
}
.btn2 {
   /*  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.55); */
    touch-action: manipulation;
    border: 1px solid transparent;
    padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    border-radius:5px 0 0 5px;
}
</style>
<!-- jsp文件头和头部 -->
<%@ include file="../../system/index/top.jsp"%>
</head>

<body class="no-skin">

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<form action="test/load"
					method="post" name="Form" id="Form">

					<header class="hasManyCity hasManyCitytwo" id="header">
						<div class="header1">
							未接收订单明细
							<div class="header_left" onclick="window.history.go(-1)">
								<img src="static/images/store/return.png">
							</div>
						</div>
						<div id="content">
							<div style="width: 80%;margin-left:10%;  margin-top: 6px">
								<table class="table table-border table-bg table-bordered"
									style="margin-bottom: 8px">
									<tbody onclick="" id="">
										<tr class="active">
											<th>订单日期：${pd_one.FDATE}</th>
										</tr>
										<tr class="warning">
											<th>订单编号：${pd_one.FBILLNO}</th>
										</tr>
										<tr class="success">
											<th>送货地址：${pd_one.FADDRESS}</th>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</header>
					<div id="content" style="margin-top:176px">
						<c:choose>
							<c:when test="${not empty listDetail}">
								<c:forEach items="${listDetail}" var="var" varStatus="vs">
									<table class="table table-border table-bg table-bordered"
										style="margin-bottom: 8px">

										<!-- <thead>
											<tr>
												<th width="65%">
													<button type="button" style="height: 28px" class="btn btn-danger">加入购物车</button>
												</th>
												<th>
													<button type="button" style="height: 28px" class="btn btn-warning">收藏商品</button>
												</th>
											</tr>
										</thead> -->
										<tbody onclick="" id="">
											<tr class="active">
												<th colspan="2">商品名称：${var.FNAME}</th>
											</tr>
											<tr class="warning">
												<th colspan="2">商品编码：${var.FMODEL}</th>
											</tr>
											<tr class="success">
												<th >数&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;量：${var.FORDERQTY}</th>
												<th >单&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;位：${var.FUNIT}</th>
											</tr>
											<tr class="warning">
												<th colspan="2">到货时间：${fn:substring(var.FSHIPPINGDATE,0,10)}</th>
											</tr>
										</tbody>
									</table>
								</c:forEach>
							</c:when>
						</c:choose>
					</div><br><br><br>
				</form>
			</div>
			
			<!-- /.main-content -->
			<div class="aui-invitation-footer">
				<a onclick="confirm('${pd_one.FINTERID}','${pd_one.FVENDORID}')" style="background:#009999">接收确认</a>
				<a onclick="notConfirm('${pd_one.FINTERID}')" >拒绝接收</a>
			</div>

			<!-- 返回顶部 -->
			<a href="#" id="btn-scroll-up"
				class="btn-scroll-up btn btn-sm btn-inverse"> <i
				class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i> </a>

		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->
		<!-- 页面底部js¨ -->
		<%@ include file="../../system/index/foot.jsp"%>
		<!-- ace scripts -->
		<script src="static/ace/js/ace/ace.js"></script>
		<!-- 删除时确认窗口 -->
	<script src="static/ace/js/bootbox.js"></script>
		<script type="text/javascript">
			//	$(top.hangge());
			function tosearch(){
				$("#Form").submit();
			}
			
			function confirm(value,value1){
				bootbox.confirm("确定要接收吗?", function(result) {
				if(result) {
					$.ajax({
						type: "POST",
						url: "<%=basePath%>order/editOrder_status",
						data : {
								FINTERID : value,
								FSTATUS : 1,
							},			
							dataType : 'json',
							cache : false,
							success : function(data) {
								//location.reload();
								//alert(value1);
								window.location.href="<%=basePath%>order/receive_order?FVENDORID="+value1; 
							},
							error : function() {
								// view("异常！");  
								alert("异常！");
							}
						});
				}
			});
			}
			
			function notConfirm(value){
			
			}
			
			/* $(function(){ 
		pushHistory(); 
		window.addEventListener("popstate", function(e) { 
			alert("测试");
			window.history.go(-1);  //返回上一页
			//window.history.back();  //返回上一页
		}, false); 
		function pushHistory() { 
			var state = { 
				title: "title", 
				url: "#" 
			}; 
			window.history.pushState(state, "title", "#"); 
		} 
	}); */
		</script>
</body>
</html>