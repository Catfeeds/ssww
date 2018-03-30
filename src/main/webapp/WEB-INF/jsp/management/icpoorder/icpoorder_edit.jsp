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
					
					<form action="icpoorder/${msg }.do" name="Form" id="Form" method="post">
						<input type="hidden" name="ICPOORDER_ID" id="ICPOORDER_ID" value="${pd.ICPOORDER_ID}"/>
						<div id="zhongxin" style="padding-top: 13px;">
						<table id="table_report" class="table table-striped table-bordered table-hover">
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">单据ID:</td>
								<td><input type="number" name="FINTERID" id="FINTERID" value="${pd.FINTERID}" maxlength="32" placeholder="这里输入单据ID" title="单据ID" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">单据编号:</td>
								<td><input type="text" name="FBILLNO" id="FBILLNO" value="${pd.FBILLNO}" maxlength="255" placeholder="这里输入单据编号" title="单据编号" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">单据日期:</td>
								<td><input class="span10 date-picker" name="FDATE" id="FDATE" value="${pd.FDATE}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="单据日期" title="单据日期" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">供应商ID:</td>
								<td><input type="number" name="FVENDORID" id="FVENDORID" value="${pd.FVENDORID}" maxlength="32" placeholder="这里输入供应商ID" title="供应商ID" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">联系人:</td>
								<td><input type="text" name="FCONTACT" id="FCONTACT" value="${pd.FCONTACT}" maxlength="255" placeholder="这里输入联系人" title="联系人" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">联系人电话:</td>
								<td><input type="text" name="FTELEPHONE" id="FTELEPHONE" value="${pd.FTELEPHONE}" maxlength="255" placeholder="这里输入联系人电话" title="联系人电话" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">要求发货日期:</td>
								<td><input class="span10 date-picker" name="FSHIPPINGDATE" id="FSHIPPINGDATE" value="${pd.FSHIPPINGDATE}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="要求发货日期" title="要求发货日期" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">状态:</td>
								<td><input type="number" name="FSTATUS" id="FSTATUS" value="${pd.FSTATUS}" maxlength="32" placeholder="这里输入状态" title="状态" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">同步状态:</td>
								<td><input type="number" name="FSYNCSTATUS" id="FSYNCSTATUS" value="${pd.FSYNCSTATUS}" maxlength="32" placeholder="这里输入同步状态" title="同步状态" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">送货地址:</td>
								<td><input type="text" name="FADDRESS" id="FADDRESS" value="${pd.FADDRESS}" maxlength="255" placeholder="这里输入送货地址" title="送货地址" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注:</td>
								<td><input type="text" name="FNOTE" id="FNOTE" value="${pd.FNOTE}" maxlength="255" placeholder="这里输入备注" title="备注" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">制单人:</td>
								<td><input type="number" name="FBILLERID" id="FBILLERID" value="${pd.FBILLERID}" maxlength="32" placeholder="这里输入制单人" title="制单人" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">审核人:</td>
								<td><input type="text" name="FCHECKERID" id="FCHECKERID" value="${pd.FCHECKERID}" maxlength="255" placeholder="这里输入审核人" title="审核人" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">审核日期:</td>
								<td><input class="span10 date-picker" name="FCHECKDATE" id="FCHECKDATE" value="${pd.FCHECKDATE}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="审核日期" title="审核日期" style="width:98%;"/></td>
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
			if($("#FBILLNO").val()==""){
				$("#FBILLNO").tips({
					side:3,
		            msg:'请输入单据编号',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FBILLNO").focus();
			return false;
			}
			if($("#FDATE").val()==""){
				$("#FDATE").tips({
					side:3,
		            msg:'请输入单据日期',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FDATE").focus();
			return false;
			}
			if($("#FVENDORID").val()==""){
				$("#FVENDORID").tips({
					side:3,
		            msg:'请输入供应商ID',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FVENDORID").focus();
			return false;
			}
			if($("#FCONTACT").val()==""){
				$("#FCONTACT").tips({
					side:3,
		            msg:'请输入联系人',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCONTACT").focus();
			return false;
			}
			if($("#FTELEPHONE").val()==""){
				$("#FTELEPHONE").tips({
					side:3,
		            msg:'请输入联系人电话',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FTELEPHONE").focus();
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
		            msg:'请输入状态',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSTATUS").focus();
			return false;
			}
			if($("#FSYNCSTATUS").val()==""){
				$("#FSYNCSTATUS").tips({
					side:3,
		            msg:'请输入同步状态',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSYNCSTATUS").focus();
			return false;
			}
			if($("#FADDRESS").val()==""){
				$("#FADDRESS").tips({
					side:3,
		            msg:'请输入送货地址',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FADDRESS").focus();
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
			if($("#FBILLERID").val()==""){
				$("#FBILLERID").tips({
					side:3,
		            msg:'请输入制单人',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FBILLERID").focus();
			return false;
			}
			if($("#FCHECKERID").val()==""){
				$("#FCHECKERID").tips({
					side:3,
		            msg:'请输入审核人',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCHECKERID").focus();
			return false;
			}
			if($("#FCHECKDATE").val()==""){
				$("#FCHECKDATE").tips({
					side:3,
		            msg:'请输入审核日期',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCHECKDATE").focus();
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