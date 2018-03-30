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
					
					<form action="supplierforwx/${msg }.do" name="Form" id="Form" method="post">
						<input type="hidden" name="SUPPLIERFORWX_ID" id="SUPPLIERFORWX_ID" value="${pd.SUPPLIERFORWX_ID}"/>
						<input type="hidden" name="FISAUDIT" id="FISAUDIT" value="${pd.FISAUDIT}"/>
						<div id="zhongxin" style="padding-top: 13px;">
						<table id="table_report" class="table table-striped table-bordered table-hover">
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">openid:</td>
								<td><input type="text" name="FOPENID" id="FOPENID" value="${pd.FOPENID}" maxlength="255" placeholder="这里输入openid" title="openid" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">用户名:</td>
								<td><input type="text" name="FUSERNAME" id="FUSERNAME" value="${pd.FUSERNAME}" maxlength="255" placeholder="这里输入用户名" title="用户名" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">身份:</td>
								<td><input type="text" name="FIDENTITY" id="FIDENTITY" value="${pd.FIDENTITY}" maxlength="255" placeholder="这里输入身份" title="身份" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">提交身份:</td>
								<td><input type="text" name="FTID" id="FTID" value="${pd.FTID}" maxlength="255" placeholder="这里输入提交身份" title="提交身份" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">是否已经审核:</td>
								<td>
								<label style="float:left;padding-left: 12px;"><input class="ace" name="form-field-radio" id="form-field-radio1" onclick="isAudit('已审核');" <c:if test="${pd.FISAUDIT == '已审核' }">checked="checked"</c:if> type="radio" value="icon-edit"><span class="lbl">审核</span></label>
								<label style="float:left;padding-left: 5px;"><input class="ace" name="form-field-radio" id="form-field-radio2" onclick="isAudit('未审核');" <c:if test="${pd.FISAUDIT == '未审核' }">checked="checked"</c:if> type="radio" value="icon-edit"><span class="lbl">未审核</span></label>
								</td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">省份:</td>
								<td><input type="text" name="FPROVINCE" id="FPROVINCE" value="${pd.FPROVINCE}" maxlength="255" placeholder="这里输入省份" title="省份" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">头像:</td>
								<td><input type="text" name="FHEADIMGURL" id="FHEADIMGURL" value="${pd.FHEADIMGURL}" maxlength="255" placeholder="这里输入头像" title="头像" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">供应商id:</td>
								<td><input type="number" name="FSUPPLIERID" id="FSUPPLIERID" value="${pd.FSUPPLIERID}" maxlength="32" placeholder="这里输入供应商id" title="供应商id" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">供应商名称:</td>
								<td><input type="text" name="FSUPPLIERNAME" id="FSUPPLIERNAME" value="${pd.FSUPPLIERNAME}" maxlength="255" placeholder="这里输入供应商名称" title="供应商名称" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">公司地址:</td>
								<td><input type="text" name="FCOMADREES" id="FCOMADREES" value="${pd.FCOMADREES}" maxlength="255" placeholder="这里输入公司地址" title="公司地址" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">性别:</td>
								<td><input type="text" name="FSEX" id="FSEX" value="${pd.FSEX}" maxlength="255" placeholder="这里输入性别" title="性别" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">手机号码:</td>
								<td><input type="text" name="FPHONE" id="FPHONE" value="${pd.FPHONE}" maxlength="255" placeholder="这里输入手机号码" title="手机号码" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">公司名称:</td>
								<td><input type="text" name="FCOMPANY" id="FCOMPANY" value="${pd.FCOMPANY}" maxlength="255" placeholder="这里输入公司名称" title="公司名称" style="width:98%;"/></td>
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
			/* if($("#FOPENID").val()==""){
				$("#FOPENID").tips({
					side:3,
		            msg:'请输入openid',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FOPENID").focus();
			return false;
			}
			if($("#FUSERNAME").val()==""){
				$("#FUSERNAME").tips({
					side:3,
		            msg:'请输入用户名',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FUSERNAME").focus();
			return false;
			}
			if($("#FIDENTITY").val()==""){
				$("#FIDENTITY").tips({
					side:3,
		            msg:'请输入身份',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FIDENTITY").focus();
			return false;
			}
			if($("#FTID").val()==""){
				$("#FTID").tips({
					side:3,
		            msg:'请输入提交身份',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FTID").focus();
			return false;
			}
			if($("#FISAUDIT").val()==""){
				$("#FISAUDIT").tips({
					side:3,
		            msg:'请输入是否已经审核',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FISAUDIT").focus();
			return false;
			}
			if($("#FPROVINCE").val()==""){
				$("#FPROVINCE").tips({
					side:3,
		            msg:'请输入省份',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FPROVINCE").focus();
			return false;
			}
			if($("#FHEADIMGURL").val()==""){
				$("#FHEADIMGURL").tips({
					side:3,
		            msg:'请输入头像',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FHEADIMGURL").focus();
			return false;
			}
			if($("#FSUPPLIERID").val()==""){
				$("#FSUPPLIERID").tips({
					side:3,
		            msg:'请输入供应商id',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSUPPLIERID").focus();
			return false;
			}
			if($("#FSUPPLIERNAME").val()==""){
				$("#FSUPPLIERNAME").tips({
					side:3,
		            msg:'请输入供应商名称',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSUPPLIERNAME").focus();
			return false;
			}
			if($("#FCOMADREES").val()==""){
				$("#FCOMADREES").tips({
					side:3,
		            msg:'请输入公司地址',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCOMADREES").focus();
			return false;
			}
			if($("#FSEX").val()==""){
				$("#FSEX").tips({
					side:3,
		            msg:'请输入性别',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FSEX").focus();
			return false;
			}
			if($("#FPHONE").val()==""){
				$("#FPHONE").tips({
					side:3,
		            msg:'请输入手机号码',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FPHONE").focus();
			return false;
			}
			if($("#FCOMPANY").val()==""){
				$("#FCOMPANY").tips({
					side:3,
		            msg:'请输入公司名称',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#FCOMPANY").focus();
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
			} */
			$("#Form").submit();
			$("#zhongxin").hide();
			$("#zhongxin2").show();
		}
		
		$(function() {
			//日期框
			$('.date-picker').datepicker({autoclose: true,todayHighlight: true});
		});
		
		function isAudit(value){
			$("#FISAUDIT").val(value);
		}
		</script>
</body>
</html>