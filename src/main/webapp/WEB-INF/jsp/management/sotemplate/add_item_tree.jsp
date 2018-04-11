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
<script type="text/javascript" src="static/js/jquery-2.1.1.js"></script>
<link type="text/css" rel="stylesheet"
	href="plugins/zTree/3.5/zTreeStyle.css" />
<script type="text/javascript"
	src="plugins/zTree/2.6/jquery.ztree-2.6.min.js"></script>
<script type="text/javascript"
	src="plugins/zTree/3.5/jquery.ztree.core-3.5.js"></script>
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
							<table style="width:100%;" border="0">
								<input type="hidden" name="SOTEMPLATE_ID" id="SOTEMPLATE_ID" value="${pd.SOTEMPLATE_ID}"/>
								<tr>
									<td style="width:12%;" valign="top" bgcolor="#F9F9F9">
										<ul id="treeDemo" class="ztree"></ul></td>
									<td style="width:88%;" valign="top"><iframe
											name="treeFrame" id="treeFrame" frameborder="0"
											src="<%=basePath%>sotemplate/add?SOTEMPLATE_ID=${pd.SOTEMPLATE_ID}"
											style="margin:0 auto;width:100%;height:100%;"></iframe></td>
								</tr>
							</table>
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
        var zNodes;  
        $(function(){  
            $.ajax({  
                async:false,  
                cache:false,  
                type:'POST',  
                //dataType:"String",  
                url:'<%=basePath%>sotemplate/dateTree',
				success : function(data) {
					//alert(data) ;
					zNodes = data;
				},
				error : function() {
					alert("请求失败");
				}
			});
			
		});
		// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
		var setting = {
		 	showLine: true,
			checkable: false,
			data : {
				simpleData : {
					enable : true
				}
			},
			callback : {
				onClick : function(event, treeId, treeNode, clickFlag) {
					// 判断是否父节点
					if (!treeNode.isParent) {
					/*	 alert("treeId自动编号：" + treeNode.tId + ", 节点id是："
								+ treeNode.id + ", 节点文本是：" + treeNode.name);
								*/
					}else {
						/*alert("treeId自动编号：" + treeNode.tId + ", 节点id是："
								+ treeNode.id + ", 节点文本是：" + treeNode.name);*/
						//alert("111")
						var treeName = "";
						if(treeNode.name == "菜品"){
							treeName = "00"
						}else if(treeNode.name == "西点类"){
							treeName = "03"
						}else if(treeNode.name == "调味类"){
							treeName = "02"
						}else if(treeNode.name == "原材料"){
							treeName = "01"
						}else if(treeNode.name == "燃料"){
							treeName = "06"
						}else if(treeNode.name == "酒水"){
							treeName = "04"
						}else if(treeNode.name == "低值易耗品"){
							treeName = "07"
						}else if(treeNode.name == "半成品"){
							treeName = "05"
						}
						$("#treeFrame").attr("src","<%=basePath%>sotemplate/add?treeName="+treeName+"&SOTEMPLATE_ID=${pd.SOTEMPLATE_ID}");
						return;
					}
					//var treeKey = encodeURI(encodeURI(treeNode.name));
					var treeKey = treeNode.id;

					//alert(treeKey);
					if(treeNode.id == 1){
						keywords ="";
						$("#treeFrame").attr("src","<%=basePath%>sotemplate/add?treeKey="+treeKey+"&SOTEMPLATE_ID=${pd.SOTEMPLATE_ID}");
					}
					$("#treeFrame").attr("src","<%=basePath%>sotemplate/add?treeKey="+treeKey+"&SOTEMPLATE_ID=${pd.SOTEMPLATE_ID}");
					//$("#treeFrame").attr("src","http://www.baidu.com");
				}
			}
		};
		
		// 渲染  
		$(document).ready(function() {
			//treeNodes = eval( zNodes );
			//treeNodes = treeNodes.parseJSON(); 
			//zNodes = '${zNodes}';
			//alert(zNodes);
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			var hmainT = document.getElementById("treeFrame");
			var bheightT = document.documentElement.clientHeight;
			hmainT.style.width = '100%';
			hmainT.style.height = (bheightT - 50) + 'px';
		});
		
	</script>


</body>
</html>