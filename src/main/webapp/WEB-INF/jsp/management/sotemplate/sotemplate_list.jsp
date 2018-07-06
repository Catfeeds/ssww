﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
							
						<!-- 检索  -->
						<form action="sotemplate/list.do" method="post" name="Form" id="Form">
						<table style="margin-top:5px;">
							<tr>
								<td>
									<div class="nav-search">
										<span class="input-icon">
											<input type="text" placeholder="这里输入关键词" class="nav-search-input" id="nav-search-input" autocomplete="off" name="keywords" value="${pd.keywords }" placeholder="这里输入关键词"/>
											<i class="ace-icon fa fa-search nav-search-icon"></i>
										</span>
									</div>
								</td>
								<c:if test="${QX.cha == 1 }">
								<td style="vertical-align:top;padding-left:2px"><a class="btn btn-light btn-xs" onclick="tosearch();"  title="检索"><i id="nav-search-icon" class="ace-icon fa fa-search bigger-110 nav-search-icon blue"></i>查询</a></td>
								</c:if>
								<c:if test="${QX.toExcel == 1 }"><td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="toExcel();" title="导出到EXCEL"><i id="nav-con" class="ace-icon fa fa-download bigger-110 nav-search-icon blue"></i>导出到EXCEL</a></td></c:if>
								<td style="vertical-align:top;padding-left:2px;"><a class="btn btn-light btn-xs" onclick="list_one_toExcel();" title="导出到EXCEL"><i id="nav" class="ace-icon fa fa-download bigger-110 nav-search-icon blue"></i>导出模板物料明细到EXCEL</a></td>

								<td style="vertical-align:top;padding-left:2px">
									<a class="btn btn-light btn-xs" onclick="copy();">
										<i class="ace-icon fa fa-credit-card bigger-110 nav-search-icon green"></i>复制模板
									</a>
								</td>
								<c:if test="${QX.add == 1 }">
									<td style="vertical-align:top;padding-left:2px">
										<a class="btn btn-light btn-xs" onclick="add();">
											<i class="ace-icon fa fa-pencil-square-o bigger-110 nav-search-icon yellow"></i>新增
										</a>
									</td>
								</c:if>
								
								<td style="vertical-align:top;padding-left:2px">
									<a class="btn btn-light btn-xs" onclick="edit();"  data-rel="tooltip" title="修改">
											<i class="ace-icon fa fa-cogs bigger-110 nav-search-icon green"></i>修改
									</a>
								</td>
								<c:if test="${QX.del == 1 }">
								<td style="vertical-align:top;padding-left:2px"><a class="btn btn-light btn-xs" onclick="makeAll('确定要删除选中的数据吗?');" title="批量删除" ><i class='ace-icon fa fa-trash-o bigger-120 nav-search-icon red'></i>删除</a></td>
								</c:if>
							</tr>
						</table>
						<!-- 检索  -->
					
						<table id="simple-table" class="table table-striped table-bordered table-hover" style="margin-top:5px;">	
							<thead>
								<tr>
									<th class="center" style="width:35px;">
									<label class="pos-rel"><input type="checkbox" class="ace" id="zcheckbox" /><span class="lbl"></span></label>
									</th>
									<th class="center" style="width:50px;">序号</th>
									<th class="center">模板编号</th>
									<th class="center">模板名称</th>
									<th class="center">部门ID</th>
									<th class="center">模板类别</th>
									<th class="center">客户</th>
									<th class="center">联络人</th>
									<th class="center">联系电话</th>
									<th class="center">制作人</th>
									<th class="center">制作日期</th>
									<th class="center">状态</th>
									<th class="center">审批日期</th>
									<th class="center">备注</th>
								</tr>
							</thead>
													
							<tbody>
							<!-- 开始循环 -->	
							<c:choose>
								<c:when test="${not empty varList}">
									<c:if test="${QX.cha == 1 }">
									<c:forEach items="${varList}" var="var" varStatus="vs">
										<tr <%--onclick="list_one('${var.SOTEMPLATE_ID}')"--%>>
											<td class='center'>
												<label class="pos-rel"><input type='checkbox' name='ids' value="${var.SOTEMPLATE_ID}" class="ace" /><span class="lbl"></span></label>
											</td>
											<td class='center' style="width: 30px;">${vs.index+1}</td>
											<td class='center'>${var.FBILLNO}</td>
											<td class='center'>${var.SOTEMPLATE_NAME}</td>
											<td class='center'>${var.FNAME}</td>
											<td class='center'>${var.FTYPE}</td>
											<td class='center'>${var.CLIENTNAME}</td>
											<td class='center'>${var.FCONTACT}</td>
											<td class='center'>${var.FTELEPHONE}</td>
											<td class='center'>${var.FBILLERID}</td>
											<td class='center'>${var.FDATE}</td>
											<td class='center'>${var.FSTATUS}</td>
											<td class='center'>${var.FCHECKDATE}</td>
											<td class='center'>${var.FREMARK}</td>
										</tr>
									
									</c:forEach>
									</c:if>
									<c:if test="${QX.cha == 0 }">
										<tr>
											<td colspan="100" class="center">您无权查看</td>
										</tr>
									</c:if>
								</c:when>
								<c:otherwise>
									<tr class="main_info">
										<td colspan="100" class="center" >没有相关数据</td>
									</tr>
								</c:otherwise>
							</c:choose>
							</tbody>
						</table>
						<div class="page-header position-relative">
						<table style="width:100%;">
							<tr>
								<td style="vertical-align:top;"><div class="pagination" style="float: right;padding-top: 0px;margin-top: 0px;">${page.pageStr}</div></td>
							</tr>
						</table>
						</div>
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

		<!-- 返回顶部 -->
		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
			<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>

	</div>
	<!-- /.main-container -->
		<%--<div id="divlist_one" style="width: 100%;height:350px;border:1px solid #F00;display: none" >
			<iframe id="list_one" style="width: 100%;height: 100%" src="<%=basePath%>sotemplateentry/list_one"></iframe>
		</div>--%>
	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%@ include file="../../system/index/foot.jsp"%>
	<!-- 删除时确认窗口 -->
	<script src="static/ace/js/bootbox.js"></script>
	<!-- ace scripts -->
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
	<script type="text/javascript">
		$(top.hangge());//关闭加载状态
		//检索
		function tosearch(){
			top.jzts();
			$("#Form").submit();
		}
		$(function() {
		
			//日期框
			$('.date-picker').datepicker({
				autoclose: true,
				todayHighlight: true
			});
			
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
			
			
			//复选框全选控制
			var active_class = 'active';
			$('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function(){
				var th_checked = this.checked;//checkbox inside "TH" table header
				$(this).closest('table').find('tbody > tr').each(function(){
					var row = this;
					if(th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
					else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
				});
			});
		});
		
		function copy(){
			var str = [];
				for(var i=0;i < document.getElementsByName('ids').length;i++){
				  if(document.getElementsByName('ids')[i].checked){
				  	str.push(document.getElementsByName('ids')[i].value);
				  }
				}
				if(str.length < 1){
					alert("您没有选择任何内容!");
					return false;
				}else if(str.length > 1){
					alert("您的选择内容必须要单项!");
					return false;
				}else{
					var Id = str[0];
				 top.jzts();
				 var diag = new top.Dialog();
				 diag.Drag=true;
				 diag.Title ="编辑";
				 diag.URL = '<%=basePath%>sotemplate/copy_sotemplate?SOTEMPLATE_ID='+Id;
				  diag.Width =  window.innerWidth;
				diag.Height = window.innerHeight;
				 diag.Modal = true;				//有无遮罩窗口
				 diag. ShowMaxButton = true;	//最大化按钮
			     diag.ShowMinButton = true;		//最小化按钮 
				 diag.CancelEvent = function(){ //关闭事件
				 	$.ajax({
			    		url: "<%=basePath%>sotemplate/delete_allTemporary",
			    		type: "POST",
						 
						success: function(){
							tosearch();
						}, 
			   			error: function(){
			        		alert("失败，请稍后重试！！");
			        		
			    		},
					});
					diag.close();
				 };
				 diag.show();	
			}
		}
		
		//新增
		<%-- function add(){
			 top.jzts();
			 var diag = new top.Dialog();
			 diag.Drag=true;
			 diag.Title ="新增";
			 diag.URL = '<%=basePath%>sotemplate/goAdd.do';
			 diag.Width = 450;
			 diag.Height = 355;
			 diag.Modal = true;				//有无遮罩窗口
			 diag. ShowMaxButton = true;	//最大化按钮
		     diag.ShowMinButton = true;		//最小化按钮
			 diag.CancelEvent = function(){ //关闭事件
				 if(diag.innerFrame.contentWindow.document.getElementById('zhongxin').style.display == 'none'){
					 if('${page.currentPage}' == '0'){
						 tosearch();
					 }else{
						 tosearch();
					 }
				}
				diag.close();
			 };
			 diag.show();
		} --%>
		
		function add(){
			 top.jzts();
			 var diag = new top.Dialog();
			 diag.Drag=true;
			 diag.Title ="新增";
			 diag.URL = '<%=basePath%>sotemplate/add_sotemplate';
			  diag.Width =  window.innerWidth;
			diag.Height = window.innerHeight;
			 diag.Modal = true;				//有无遮罩窗口
			 diag. ShowMaxButton = true;	//最大化按钮
		     diag.ShowMinButton = true;		//最小化按钮
		     diag.CancelEvent = function(){ //关闭事件
				$.ajax({
		    		url: "<%=basePath%>sotemplate/delete_allTemporary",
		    		type: "POST",
					 
					success: function(){
						tosearch();
					}, 
		   			error: function(){
		        		alert("失败，请稍后重试！！");
		    		},
				});
				diag.close();
			 };
			 diag.show();
		}
		
		//删除
		function del(Id){
			bootbox.confirm("确定要删除吗?", function(result) {
				if(result) {
					top.jzts();
					var url = "<%=basePath%>sotemplate/delete.do?SOTEMPLATE_ID="+Id+"&tm="+new Date().getTime();
					$.get(url,function(data){
						tosearch();
					});
				}
			});
		}
		
		//修改
		function edit(){
			var str = [];
				for(var i=0;i < document.getElementsByName('ids').length;i++){
				  if(document.getElementsByName('ids')[i].checked){
				  	str.push(document.getElementsByName('ids')[i].value);
				  }
				}
				if(str.length < 1){
					alert("您没有选择任何内容!");
					return false;
				}else if(str.length > 1){
					alert("您的选择内容必须要单项!");
					return false;
				}else{
					var Id = str[0];
				 top.jzts();
				 var diag = new top.Dialog();
				 diag.Drag=true;
				 diag.Title ="编辑";
				 diag.URL = '<%=basePath%>sotemplate/goEdit.do?SOTEMPLATE_ID='+Id;
				  diag.Width =  window.innerWidth;
				diag.Height = window.innerHeight;
				 diag.Modal = true;				//有无遮罩窗口
				 diag. ShowMaxButton = true;	//最大化按钮
			     diag.ShowMinButton = true;		//最小化按钮 
				 diag.CancelEvent = function(){ //关闭事件
				 	$.ajax({
			    		url: "<%=basePath%>sotemplate/delete_allTemporary",
			    		type: "POST",
						 
						success: function(){
							tosearch();
						}, 
			   			error: function(){
			        		alert("失败，请稍后重试！！");
			        		
			    		},
					});
					diag.close();
				 };
				 diag.show();	
			}
		}
		
		//批量操作
		function makeAll(msg){
			bootbox.confirm(msg, function(result) {
				if(result) {
					var str = '';
					for(var i=0;i < document.getElementsByName('ids').length;i++){
					  if(document.getElementsByName('ids')[i].checked){
					  	if(str=='') str += document.getElementsByName('ids')[i].value;
					  	else str += ',' + document.getElementsByName('ids')[i].value;
					  }
					}
					if(str==''){
						bootbox.dialog({
							message: "<span class='bigger-110'>您没有选择任何内容!</span>",
							buttons: 			
							{ "button":{ "label":"确定", "className":"btn-sm btn-success"}}
						});
						$("#zcheckbox").tips({
							side:1,
				            msg:'点这里全选',
				            bg:'#AE81FF',
				            time:8
				        });
						return;
					}else{
						if(msg == '确定要删除选中的数据吗?'){
							top.jzts();
							$.ajax({
								type: "POST",
								url: '<%=basePath%>sotemplate/deleteAll.do?tm='+new Date().getTime(),
						    	data: {DATA_IDS:str},
								dataType:'json',
								//beforeSend: validateData,
								cache: false,
								success: function(data){
									 $.each(data.list, function(i, list){
											tosearch();
									 });
								}
							});
						}
					}
				}
			});
		};
		
		//导出excel
		function toExcel(){
			window.location.href='<%=basePath%>sotemplate/excel.do';
		}

		function list_one_toExcel(){
			var str = [];
			for(var i=0;i < document.getElementsByName('ids').length;i++){
				if(document.getElementsByName('ids')[i].checked){
					str.push(document.getElementsByName('ids')[i].value);
				}
			}
			if(str.length < 1){
				alert("您没有选择任何内容!");
				return false;
			}else if(str.length > 1){
				alert("您的选择内容必须要单项!");
				return false;
			}else{
				var Id = str[0];
				//top.jzts();
				window.location.href='<%=basePath%>sotemplateentry/list_oneToExcel.do?SOTEMPLATE_ID='+Id;
			}

		}
		
		function list_one(value){
			//alert(FINTERID);
			$("#divlist_one").css("display","");
			$("#list_one").attr("src","<%=basePath%>sotemplateentry/list_one?SOTEMPLATE_ID="+value);
		}
	</script>


</body>
</html>