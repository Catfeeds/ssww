<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<base href="<%=basePath%>">
	<!-- 下拉框 -->
	<link rel="stylesheet" href="static/ace/css/chosen.css" />
	<!-- jsp文件头和头部 -->
	<%@ include file="../../system/index/top.jsp"%>
	<!-- 日期框 -->
	<link rel="stylesheet" href="static/ace/css/datepicker.css" />
</head>
<body class="no-skin">
<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
	<!-- /section:basics/sidebar -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
					
					<form action="icpoorderentry/${msg }.do" name="Form" id="Form" method="post">
						<input type="hidden" name="ICPOORDERENTRY_ID" id="ICPOORDERENTRY_ID" value="${pd.ICPOORDERENTRY_ID}"/>
						<div id="zhongxin" style="padding-top: 13px;">
						<table id="table_report" class="table table-striped table-bordered table-hover">
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">单据ID:</td>
								<td><input type="number" name="FINTERID" id="FINTERID" value="${pd.FINTERID}" maxlength="32" placeholder="这里输入单据ID" title="单据ID" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">序号:</td>
								<td><input type="number" name="FENTRYID" id="FENTRYID" value="${pd.FENTRYID}" maxlength="32" placeholder="这里输入序号" title="序号" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">物料ID:</td>
								<td><input type="number" name="FITEMID" id="FITEMID" value="${pd.FITEMID}" maxlength="32" placeholder="这里输入物料ID" title="物料ID" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">要求发货日期:</td>
								<td><input class="span10 date-picker" name="FSHIPPINGDATE" id="FSHIPPINGDATE" value="${pd.FSHIPPINGDATE}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="要求发货日期" title="要求发货日期" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">物流状态:</td>
								<td><input type="number" name="FSTATUS" id="FSTATUS" value="${pd.FSTATUS}" maxlength="32" placeholder="这里输入物流状态" title="物流状态" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">单位:</td>
								<td><input type="text" name="FUNIT" id="FUNIT" value="${pd.FUNIT}" maxlength="255" placeholder="这里输入单位" title="单位" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">订单数量:</td>
								<td><input type="number" name="FORDERQTY" id="FORDERQTY" value="${pd.FORDERQTY}" maxlength="32" placeholder="这里输入订单数量" title="订单数量" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">收料数量:</td>
								<td><input type="number" name="FACCEPTQTY" id="FACCEPTQTY" value="${pd.FACCEPTQTY}" maxlength="32" placeholder="这里输入收料数量" title="收料数量" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">验收数量:</td>
								<td><input type="number" name="FPASSQTY" id="FPASSQTY" value="${pd.FPASSQTY}" maxlength="32" placeholder="这里输入验收数量" title="验收数量" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">验收人:</td>
								<td><input type="text" name="FCHECKER" id="FCHECKER" value="${pd.FCHECKER}" maxlength="255" placeholder="这里输入验收人" title="验收人" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">验收时间:</td>
								<td><input class="span10 date-picker" name="FCHECKTIME" id="FCHECKTIME" value="${pd.FCHECKTIME}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="验收时间" title="验收时间" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注:</td>
								<td><input type="text" name="FNOTE" id="FNOTE" value="${pd.FNOTE}" maxlength="255" placeholder="这里输入备注" title="备注" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="text-align: center;" colspan="10">
									<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
									<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
								</td>
							</tr>
						</table>
						</div>
						<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green">提交中...</h4></div>
					</form>
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


	<!-- 页面底部js¨ -->
	<%@ include file="../../system/index/foot.jsp"%>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
		<script type="text/javascript">
		$(top.hangge());
		//保存
		function save(){
			if($("#FINTERID").val()==""){
				$("#FINTERID").tips({
					side:3,
		            msg:'请输入单据ID',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FINTERID").focus();
			return false;
			}
			if($("#FENTRYID").val()==""){
				$("#FENTRYID").tips({
					side:3,
		            msg:'请输入序号',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FENTRYID").focus();
			return false;
			}
			if($("#FITEMID").val()==""){
				$("#FITEMID").tips({
					side:3,
		            msg:'请输入物料ID',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FITEMID").focus();
			return false;
			}
			if($("#FSHIPPINGDATE").val()==""){
				$("#FSHIPPINGDATE").tips({
					side:3,
		            msg:'请输入要求发货日期',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSHIPPINGDATE").focus();
			return false;
			}
			if($("#FSTATUS").val()==""){
				$("#FSTATUS").tips({
					side:3,
		            msg:'请输入物流状态',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSTATUS").focus();
			return false;
			}
			if($("#FUNIT").val()==""){
				$("#FUNIT").tips({
					side:3,
		            msg:'请输入单位',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FUNIT").focus();
			return false;
			}
			if($("#FORDERQTY").val()==""){
				$("#FORDERQTY").tips({
					side:3,
		            msg:'请输入订单数量',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FORDERQTY").focus();
			return false;
			}
			if($("#FACCEPTQTY").val()==""){
				$("#FACCEPTQTY").tips({
					side:3,
		            msg:'请输入收料数量',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FACCEPTQTY").focus();
			return false;
			}
			if($("#FPASSQTY").val()==""){
				$("#FPASSQTY").tips({
					side:3,
		            msg:'请输入验收数量',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FPASSQTY").focus();
			return false;
			}
			if($("#FCHECKER").val()==""){
				$("#FCHECKER").tips({
					side:3,
		            msg:'请输入验收人',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCHECKER").focus();
			return false;
			}
			if($("#FCHECKTIME").val()==""){
				$("#FCHECKTIME").tips({
					side:3,
		            msg:'请输入验收时间',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCHECKTIME").focus();
			return false;
			}
			if($("#FNOTE").val()==""){
				$("#FNOTE").tips({
					side:3,
		            msg:'请输入备注',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FNOTE").focus();
			return false;
			}
			$("#Form").submit();
			$("#zhongxin").hide();
			$("#zhongxin2").show();
		}
		
		$(function() {
			//日期框
			$('.date-picker').datepicker({autoclose: true,todayHighlight: true});
		});
		</script>
</body>
</html>