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
<base href="<%=basePath%>">

<!-- jsp文件头和头部 -->
<%@ include file="../../system/index/top.jsp"%>
<script type="text/javascript" src="static/js/jquery-2.1.1.js"></script>
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
						<div class="" style="text-align: left;margin-left: 10px">
							<a class="btn btn-mini btn-primary" onclick="saveInfo()">保存</a> <a
								class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
						</div>
						<br>
						<div class="col-xs-12">
							<!-- ------------------------------------------------------------------------------- -->
							<form action="sotemppermission/save.do" name="Form" id="Form"
								method="post">
								<input type="hidden" value="${pd.SOTEMPLATE_IDs}"
									name="SOTEMPLATE_IDs" id="SOTEMPLATE_IDs" /> <input
									type="hidden" value="${pd.QYWXUSER_ID}" name="QYWXUSER_ID"
									id="QYWXUSER_ID" />
								<table class="table table-border table-bg table-bordered">
									<tbody>
										<tr class="warning">
											<th width="20%"><label>名称：${pd.NAME}</label>
											</th>
											<th width="20%"><label>所属部门：${pd.DEPARTMENT}</label>
											</th>
										</tr>

									</tbody>
								</table>
								<div>
									<div align="center"
										style="width: 100%;height: 30px;-moz-border-radius: 15px;-webkit-border-radius: 15px; border-radius:15px;background-color:#00CC66;">
										<strong style="font-size: 18px">订单模板： </strong>
									</div>
									<br>
									<c:set var="theString" value="${closedSotempList}" />
									<% int i=1; %>
									<table width="100%" border="2" bordercolor="#a0c6e5">
										<c:forEach items="${allSotempList}" var="var" varStatus="vs">
											<% if (i%3==1) { %>
											　　<tr>
											　　<% } %>
											　　<td ><input name="checkbox1" type="checkbox"
												<c:if test="${fn:contains(theString,var.SOTEMPLATE_ID)}"> checked="checked" </c:if>
												class="ace" id="checkbox1" value="${var.SOTEMPLATE_ID}">
												<span class="lbl"  style="width:90%;margin: 7px;
												<c:if test="${vs.index % 3 == 0}">
														background-color:#00CCCC;
												</c:if>
												<c:if test="${vs.index % 3 == 2}">
														background-color:#99CC99;
												</c:if>
												<c:if test="${vs.index % 3 == 1}">
														background-color:#CCCC99;
												</c:if>
														border-radius: 5px;padding: 6px">
													模板名称：${var.SOTEMPLATE_NAME}<br>
													&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;模板类型：${var.FTYPE}</td>
											　　<%if(i%3==0){%>
											　　</tr>
											　　<% }i++; %>
											<%--<label style="float:left;padding-left:10px;padding-top:7px;text-align: center;">
												<input name="checkbox1" type="checkbox"
												<c:if test="${fn:contains(theString,var.SOTEMPLATE_ID)}"> checked="checked" </c:if>
												class="ace" id="checkbox1" value="${var.SOTEMPLATE_ID}">
												<span class="lbl"  style="width:100%;
													<c:if test="${vs.index % 3 == 0}">
														background-color:#00CCCC;
													</c:if>
													<c:if test="${vs.index % 3 == 2}">
														background-color:#99CC99;
													</c:if>
													<c:if test="${vs.index % 3 == 1}">
														background-color:#CCCC99;
													</c:if>
													border-radius: 5px;padding: 6px">
													模板名称：${var.SOTEMPLATE_NAME}<br>
													&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;模板类型：${var.FTYPE}
												</span>
											 </label>--%>
										</c:forEach>
									</table>
								</div>
							</form>
							<!-- ------------------------------------------------------------------------------- -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
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
	<%@ include file="../../system/index/foot.jsp"%>
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
		$(top.hangge());

		function saveInfo() {
			jqchk();
			$("#Form").submit();
		}

		function jqchk() { //jquery获取复选框值 
			var chk_value = [];
			$('input[name="checkbox1"]:checked').each(function() {
				chk_value.push($(this).val());
			});
			$("#SOTEMPLATE_IDs").val(chk_value);
			//alert(chk_value);
			//alert(chk_value.length==0 ?'你还没有选择任何内容！':chk_value); 
		}
	</script>


</body>
</html>