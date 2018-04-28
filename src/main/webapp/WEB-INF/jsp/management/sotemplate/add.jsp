<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
<style type="text/css">
	.aui-invitation-footer {
	position: fixed;
	left: 0;
	bottom: 0;
	right: 0;
	z-index: 999;
	background: #CCCC66;
	width: 100%;
	height: 60px;
	padding-top: 10px;
}

</style>
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
							<!-- ------------------------------------------------------------------------------- -->
							
							<form action="sotemplate/add?treeKey=${pd.treeKey }&treeName=${pd.treeName }" name="Form" id="search" method="post">
							<input type="hidden" name="SOTEMPLATE_ID" id="SOTEMPLATE_ID" value="${pd.SOTEMPLATE_ID}"/>
							<table style="margin-top:5px;">
							<tr>
								<td style="vertical-align:top;padding-left:2px">
									<a class="btn btn-mini  btn-primary" onclick="submit11()">提交</a>
								</td>
								<td style="vertical-align:top;padding-left:2px">
									<a class="btn btn-mini  btn-danger" onclick="top.Dialog.close();">取消</a>
								</td>
								<td style="vertical-align:top;padding-left:5px">
									<div class="nav-search">
										<span class="input-icon">
											<input type="text" placeholder="这里输入关键词" class="nav-search-input" id="nav-search-input" autocomplete="off" name="keywords" value="${pd.keywords }" placeholder="这里输入关键词"/>
											<i class="ace-icon fa fa-search nav-search-icon"></i>
										</span>
									</div>
								</td>
								
								<td style="vertical-align:top;padding-left:2px"><a class="btn btn-light btn-xs" onclick="tosearch();"  title="检索"><i id="nav-search-icon" class="ace-icon fa fa-search bigger-110 nav-search-icon blue"></i></a></td>
							</tr>
						</table>
						</form>
						<form action="sotemplate/temporary_data" name="Form" id="Form" method="post">
							<input type="hidden" name="SOTEMPLATE_ID" id="SOTEMPLATE_ID" value="${pd.SOTEMPLATE_ID}"/>
							<%-- <input type="hidden" name="FSTATUS" id="FSTATUS" value="${pd.FSTATUS}"/> --%>
							<input type="hidden" name="FITEMIDs" id="FITEMIDs" value="${pd.FITEMIDs}"/>
							<table id="simple-table" class="table table-striped table-bordered table-hover" style="margin-top:5px;">	
							<thead>
								<tr>
									<th class="center" style="width:35px;">
									<label class="pos-rel"><input type="checkbox" class="ace" id="zcheckbox" /><span class="lbl"></span></label>
									</th>
									<th class="center" style="width:50px;">序号</th>
									<!-- <th class="center">FItemID</th>
									<th class="center">FParentID</th> -->
									<th class="center">商品代码</th>
									<th class="center">商品名称</th>
									<th class="center">规格</th>
									<!-- <th class="center">数量</th> -->
								</tr>
							</thead>
													
							<tbody id="simple-tbody">
							<!-- 开始循环 -->	
									<c:forEach items="${pageDatas}" var="var" varStatus="vs">
										<c:if test="${vs.index+1 < 100 }">
											<tr>
												<td class='center'>
													<label class="pos-rel"><input type='checkbox' name='ids' value="${var.FITEMID}" class="ace" /><span class="lbl"></span></label>
												</td>
												<td class='center' style="width: 30px;">${vs.index+1}</td>
												<td class='right'>${var.FNUMBER}</td>
												<td class='right'>${var.FNAME}</td>
												<td class='right'>${var.FMODEL}</td>
												<%-- <td class='center'>${var.FQTY}</td> --%>
											</tr>
										</c:if>
									</c:forEach>
							</tbody>
						</table>
							<table style="width:100%;margin-left: 10px">
								<!-- <tr>
									<td ><a class="btn btn-success"
										onclick="saveInfo();">提交</a></td>
								</tr> -->
								
							</table>
							<div class="page-header position-relative">
								<table style="width:100%;">
									<tr>
										<td style="vertical-align:top;">
											<c:if test="${QX.add == 1 }">
											<a class="btn btn-mini btn-success" onclick="add();">新增</a>
											</c:if>
											<c:if test="${QX.del == 1 }">
											<a class="btn btn-mini btn-danger" onclick="makeAll('确定要删除选中的数据吗?');" title="批量删除" ><i class='ace-icon fa fa-trash-o bigger-120'></i></a>
											</c:if>
										</td>
										<td style="vertical-align:top;"><div class="pagination" style="float: right;padding-top: 0px;margin-top: 0px;">${page.pageStr}</div></td>
									</tr>
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
	<!-- ace scripts -->
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!-- 上传控件 -->
	<script src="static/ace/js/ace/elements.fileinput.js"></script>
	<script type="text/javascript">
		$(top.hangge());
		
		//检索
		function tosearch(){
			top.jzts();
			$("#search").submit();
		}
		
		var isGetId = 0;
		
		$(function() {
			//日期框
			$('.date-picker').datepicker({autoclose: true,todayHighlight: true});
			
			//下拉框
			if(!ace.vars['touch']) {
				$('.chosen-select').chosen({allow_single_deselect:true}); 
				$(window)
				.off('resize.chosen')
				.on('resize.chosen', function() {
					$('.chosen-select').each(function() {
						 var $this = $(this);
						 $this.next().css({'width': $this.parent().width()});
					});
				}).trigger('resize.chosen');
				$(document).on('settings.ace.chosen', function(e, event_name, event_val) {
					if(event_name != 'sidebar_collapsed') return;
					$('.chosen-select').each(function() {
						 var $this = $(this);
						 $this.next().css({'width': $this.parent().width()});
					});
				});
				$('#chosen-multiple-style .btn').on('click', function(e){
					var target = $(this).find('input[type=radio]');
					var which = parseInt(target.val());
					if(which == 2) $('#form-field-select-4').addClass('tag-input-style');
					 else $('#form-field-select-4').removeClass('tag-input-style');
				});
			}
			getDate();
			
		});
		
		
		function getDate(){
			var FDATE = $("#FDATE").val();
			var FBILLNO =$("#FBILLNO").val();
			var mydate = new Date();
			if(FDATE == null ||FDATE == ""){
				$("#FDATE").val(mydate.getFullYear()+"年"+(mydate.getMonth()+1)+"月"+mydate.getDate()+"日"); 
			}
			if(FBILLNO == null || FBILLNO ==""){
				$("#FBILLNO").val("MB"+mydate.getFullYear()+(mydate.getMonth()+1)+mydate.getDate()+mydate.getHours()+mydate.getMinutes()+mydate.getSeconds()); 
			}
		}
		
		function isCheck(value){
			$("#FSTATUS").val(value);
		}
		
		
		function submit11(){
			var chk_value =[]; 
			 $('input[name="ids"]:checked').each(function(){ 
				//alert($(this).val())
				chk_value.push($(this).val()); 
				}
            ); 
            $("#FITEMIDs").val(chk_value);
			//alert(chk_value);
			$("#Form").submit();
			//diag.close();
		}
		
	
    
    function jqchk(){ //jquery获取复选框值 
		var chk_value =[]; 
		$('input[name="ids"]:checked').each(function(){ 
		chk_value.push($(this).val()); 
		}); 
		$("#STATE").val(chk_value.length==0 ?'普通商品':chk_value);
		//alert(chk_value.length==0 ?'你还没有选择任何内容！':chk_value); 
		}
	</script>


</body>
</html>