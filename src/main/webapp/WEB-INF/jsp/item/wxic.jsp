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
<title>库存查询</title>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<!-- <link rel="stylesheet" href="static/css/wxic.css" /> -->
<link rel="stylesheet" href="static/css/commonic.css" /> 

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="static/ace/css/bootstrap.css" />
<style type="text/css">
/* body
{
    background: url('static/images/timg.jpg')top center no-repeat; 
    background-size:cover;
    
} */
header {
    height: 50px;
    background-color: #06c1ae;
    position: fixed;
    width: 100%;
    z-index: 9999;
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
<%@ include file="../system/index/top.jsp"%>
</head>

<body class="no-skin">

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<!--	<div class="page-content">
					 <div class="hr hr-18 dotted hr-double"></div>
					<div class="row">
						<div class="col-xs-12"> -->
				<form action="test/load"
					method="post" name="Form" id="Form">

					<header class="hasManyCity hasManyCitytwo" id="header">

						<div style="width: 80%;margin-left:10%;  margin-top: 6px">
							<div class="input-group">
								<span class="input-group-btn">
								<button type="button" class="btn2 "
									>
									仓库 <span class="caret"></span>
								</button>
									<%-- <select  class="btn2">
												<c:forEach items="${varList}" var="var1" varStatus="vs">
											<option>${var1.CK}</option>
											</c:forEach>
										</select> --%>
								</span> 
								<input name="keywords" type="text" class="form-control"
									placeholder="输入搜索内容..." value="${pd.keywords }"> 
								 <span class="input-group-btn">
									<button class="btn1" type="button" onclick="tosearch()">搜
										索</button> </span>
							</div>
						</div>
					</header>
					<%-- <div class="row" style="margin-top:51px">
						<c:forEach items="${list_tree}" var="var1" varStatus="vs1">
								<button type="button" class="btn btn-primary">${var1.CK}</button>
						</c:forEach>
					</div> --%>
					<div id="content" style="margin-top:51px">
						<c:choose>
							<c:when test="${not empty varList}">
								<c:forEach items="${varList}" var="var" varStatus="vs">
									<table class="table table-border table-bg table-bordered"
										style="margin-bottom: 8px">

										<thead>
											<tr>
												<th width="65%">
													<!-- <button type="button" style="height: 28px" class="btn btn-danger">加入购物车</button> -->
												</th>
												<th>
													<!-- <button type="button" style="height: 28px" class="btn btn-warning">收藏商品</button> -->
												</th>
											</tr>
										</thead>
										<tbody onclick="" id="">
											<tr class="active">
												<th>商品代码:${var.AFNumber}</th>
												<th><fmt:formatNumber value="${var.CFQty}" pattern="0" />${var.BFName}</th>
											</tr>
											<tr class="warning">
												<th>商品名称:${var.AFName}</th>
												<th>${var.DFName}</th>
											</tr>
											<tr class="success">
												<th colspan="2">规格型号:${var.AFModel}</th>
												<!-- <th>12PCS</th> -->
											</tr>
										</tbody>
									</table>
								</c:forEach>
							</c:when>
						</c:choose>
					</div>
				</form>
			</div>
			<!-- /.main-content -->


			<!-- 返回顶部 -->
			<a href="#" id="btn-scroll-up"
				class="btn-scroll-up btn btn-sm btn-inverse"> <i
				class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i> </a>

		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->
		<!-- 页面底部js¨ -->
		<%@ include file="../system/index/foot.jsp"%>
		<!-- ace scripts -->
		<script src="static/ace/js/ace/ace.js"></script>
		<script type="text/javascript">
			//	$(top.hangge());
			function tosearch(){
				$("#Form").submit();
			}
		</script>
</body>
</html>