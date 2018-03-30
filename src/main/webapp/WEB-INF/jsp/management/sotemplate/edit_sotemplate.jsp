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
							<!-- <td style="text-align: center;" colspan="10"> -->
								<a  class="btn btn-success btn-xs" onclick="saveInfo()">
									<i class="ace-icon fa fa-credit-card bigger-110 nav-search-icon yellow"></i>保存
								</a>
								<a class="btn btn-primary  btn-xs" onclick="top.Dialog.close();">
									<i class="ace-icon fa  fa-external-link bigger-110 nav-search-icon red"></i>取消
								</a>
							<!-- </td> -->
						</div>
						<br>
						<div class="col-xs-12">
							<!-- ------------------------------------------------------------------------------- -->
							<form action="sotemplate/${msg }.do" name="Form" id="Form" method="post">
							<input type="hidden" name="SOTEMPLATE_ID" id="SOTEMPLATE_ID" value="${pd.SOTEMPLATE_ID}"/>
							<input type="hidden" name="FSTATUS" id="FSTATUS" value="${pd.FSTATUS}"/>
							<input type="hidden" name="FITEMIDs" id="FITEMIDs" value="${pd.FITEMIDs}"/>
							<input type="hidden" name="FITEMIDs_edit" id="FITEMIDs_edit" value="${pd.FITEMIDs_edit}"/>
							<input type="hidden" name="count" id="count" value="${count}"/>
							<table class="table table-border table-bg table-bordered">
								<tbody>
									<tr class="warning">
										<th width="15%"><label>部门：</label></th>
										<th width="10%">
										<select name="FDEPTID" id="FDEPTID" data-placeholder="请选择数据库"  style="vertical-align:top;width: 150px;" onchange="selectType(this.value)">
												<option value="${pd.FDEPTID}" selected="selected">${pd.FDEPTNAME}</option>
												<c:forEach items="${varOList}" var="var" varStatus="vs">
													<option value="${var.FITEMID}">${var.FNAME}</option>
												</c:forEach>
											</select>
										<%-- <input type="text" style="width: 150px" value="${pd.FDEPTID}"
											class="input-text"  name="FDEPTID"
											id="FDEPTID"> --%>
										</th>
										<th width="15%"><label>模板名称：</label></th>
										<th width="10%"><input type="text" style="width: 150px" value="${pd.SOTEMPLATE_NAME}"
											class="input-text"  name="SOTEMPLATE_NAME"
											id="SOTEMPLATE_NAME"></th>
										<th width="15%"><label>模板编号：</label></th>
										<th width="20%"><input type="text" style="width: 150px" value="${pd.FBILLNO}"
											class="input-text"  name="FBILLNO"
											id="FBILLNO"></th>
									</tr>
									<tr class="active">
										<th ><label>制作人：</label></th>
										<th ><input type="text" style="width: 150px" value="${pd.USERNAME}" readonly="readonly"
											class="input-text"  name="FBILLERID"
											id="FBILLERID"></th>
										<th  ><label>制作日期：</label></th>
										<th  ><input type="text" style="width: 150px" value="${pd.FDATE}" readonly="readonly"
											class="input-text"  name="FDATE"
											id="FDATE"></th>
										<th  ><label>模板类别：</label></th>
										<th  ><input type="text" style="width: 150px" value="${pd.FTYPE}" 
											class="input-text"  name="FTYPE"
											id="FTYPE"></th>
									</tr>
									<tr class="success">
										<th ><label>模板状态：</label></th>
										<th >
											<label style="float:left;padding-left: 12px;"><input class="ace" name="form-field-radio" id="form-field-radio1" onclick="isCheck('审核');" <c:if test="${pd.FSTATUS == '审核' }">checked="checked"</c:if> type="radio" value="icon-edit"><span class="lbl">审核</span></label>
											<label style="float:left;padding-left: 5px;"><input class="ace" name="form-field-radio" id="form-field-radio2" onclick="isCheck('未审核');" <c:if test="${pd.FSTATUS == '未审核' }">checked="checked"</c:if> type="radio" value="icon-edit"><span class="lbl">未审核</span></label>
										</th>
										<th width="15%"><label>客户：</label></th>
										<th width="10%">
										<select name="CLIENT_ID" id="CLIENT_ID" data-placeholder="请选择数据库"  style="vertical-align:top;width: 150px;" onchange="selectType(this.value)">
												<option value="${pd.CLIENT_ID}" selected="selected">${pd.CLIENTNAME}</option>
												<c:forEach items="${clientList}" var="var" varStatus="vs">
													<option value="${var.FITEMID}">${var.FNAME}</option>
												</c:forEach>
											</select>
										</th>
										<th width="10%" ><label>备注：</label></th>
										<th ><textarea style="width: 400px" cols="" rows=""
												class="textarea" name="FREMARK" id="FREMARK" value="${pd.FREMARK}"
												placeholder="">${pd.FREMARK}</textarea></th>
									</tr>
								</tbody>
							</table>
							<table style="width:100%;margin-left: 2px">
								<tr>
									<td style="vertical-align:top;">
										<a class="btn  btn-xs" onclick="add();">
											<i class="ace-icon fa fa-pencil-square-o bigger-110 nav-search-icon red"></i>新增模板物料
										</a>
									</td>
								</tr>
							</table>
							<br>
							<table id="simple-table" class="table table-striped table-bordered table-hover" style="margin-top:5px;">	
							<thead>
								<tr>
									<!-- <th class="center" style="width:35px;">
									<label class="pos-rel"><input type="checkbox" class="ace" id="zcheckbox" /><span class="lbl"></span></label>
									</th> -->
									<th class="center" style="width:50px;">序号</th>
									<!-- <th class="center">FItemID</th>
									<th class="center">FParentID</th> -->
									<th class="center">商品代码</th>
									<th class="center">商品名称</th>
									<th class="center">规格</th>
									<th class="center">数量</th>
									<th class="center">操作</th>
								</tr>
							</thead>
							<div align="center" style="width: 100%;height: 30px;-moz-border-radius: 15px;-webkit-border-radius: 15px; border-radius:15px;background-color: yellow;">
								<strong style="font-size: 18px">已选物料:	</strong>
							</div>					
							<tbody id="simple-tbody">
							<!-- 开始循环 -->	
									<c:forEach items="${pageDatas}" var="var" varStatus="vs">
											<tr>
												<td class='center' style="display: none">
													<label class="pos-rel"><input type='checkbox' name='oldids' checked='checked' value="${var.FITEMID}" class="ace" /><span class="lbl"></span></label>
												</td>
												<td class='center' style="width: 30px;">${vs.index+1}</td>
												<td class='left'>${var.FNUMBER}</td>
												<td class='left'>${var.FNAME}</td>
												<td class='left'>${var.FMODEL}</td>
												<td class='left'>
													<input type='number' id='${var.FITEMID}'  value='<fmt:formatNumber type="number" value="${var.FAUXQTY}" pattern="0" maxFractionDigits="0"/>' class='ace' />
												</td>
												<td class="center">
													<a class="btn btn-xs btn-danger" 
														onclick="del('${var.FITEMID}','${pd.SOTEMPLATE_ID}');">
														<i class="ace-icon fa fa-trash-o bigger-120" title="删除"></i>
													</a>
												</td>
											</tr>
									</c:forEach>
							</tbody>
							
						</table >
						 <table id="edit-table"  class="table table-striped table-bordered table-hover" style="margin-top:5px;display:none">
							<div id="edit-div" align="center" style="width: 100%;height: 30px;-moz-border-radius: 15px;-webkit-border-radius: 15px; border-radius:15px;background-color: #00CCFF;display:none">
								<strong style="font-size: 18px">新增的待确认模板物料:	</strong>
							</div>
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
									<th class="center">商品单位</th>
									<th class="center">规格</th>
									<th class="center">数量</th>
								</tr>
							</thead>
							<tbody  id="edit-tbody">
							<%-- <!-- 开始循环 -->	
									<c:forEach items="${listAll}" var="var" varStatus="vs">
										<c:if test="${vs.index+1 < 10 }">
											<tr>
												<td class='center'>
													<label class="pos-rel"><input type='checkbox' name='ids' value="${var.FITEMID}" class="ace" /><span class="lbl"></span></label>
												</td>
												<td class='center' style="width: 30px;">${vs.index+1}</td>
												<td class='center'>${var.FNUMBER}</td>
												<td class='center'>${var.FNAME}</td>
												<td class='center'>${var.FMODEL}</td>
												<td class='center'>${var.FQTY}</td>
											</tr>
										</c:if>
									</c:forEach> --%>
							</tbody>
						</table>
							<!-- <table style="width:100%;margin-left: 10px">
								<tr>
									<td ><a class="btn btn-success"
										onclick="saveInfo();">保存</a></td>
								</tr>
							</table> -->
							<br />
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
		
		
		function saveInfo(){
			var json_edit = '[';  
			 $('input[name="oldids"]:checked').each(function(){ 
				 json_edit += '{';  
                 json_edit += '"FITEMID":"' +$(this).val()+ '",';  
                 json_edit += '"FAUXQTY":"' +$("#"+$(this).val()).val();  
                 json_edit += '"}';
                 json_edit += ','; 
				}
            ); 
            json_edit = json_edit.substring(0, json_edit.length - 1);  
            json_edit += ']';  
            $("#FITEMIDs_edit").val(json_edit);
			/*  $('input[name="oldids"]:checked').each(function(){ 
					alert($(this).val());
					//$("#"+$(this).val()).val()
				}
            );  */
			var jsonstr = '[';  
			 $('input[name="ids"]:checked').each(function(){ 
				 jsonstr += '{';  
                 jsonstr += '"FITEMID":"' +$(this).val()+ '",';  
                 jsonstr += '"FAUXQTY":"' +$("#"+$(this).val()).val();  
                 jsonstr += '"}';
                 jsonstr += ','; 
				}
            ); 
            jsonstr = jsonstr.substring(0, jsonstr.length - 1);  
            jsonstr += ']';  
            $("#FITEMIDs").val(jsonstr);
			//alert($("#FITEMIDs").val(chk_value));
			$("#Form").submit();
		}
		
		
		
	function del(FITEMID,SOTEMPLATE_ID){
		$.ajax({
    		url: "<%=basePath%>sotemplateentry/delete2",
    		type: "POST",
			data: { 
					FITEMID:FITEMID,
					SOTEMPLATE_ID:SOTEMPLATE_ID 
				  }, 
			success: function(){
					location.reload();
   				 }, 
   			error: function(){
        		alert("失败，请稍后重试！！");
    		},
		});
	}
    
    function add(){
			top.jzts();
			var SOTEMPLATE_ID = $("#SOTEMPLATE_ID").val();
			 var diag = new top.Dialog();
			 diag.Drag=true;
			 diag.Title ="新增模板物料";
			  diag.ShowButtonRow=false;
			 diag.URL = '<%=basePath%>sotemplate/listTree.do?SOTEMPLATE_ID='+SOTEMPLATE_ID;
			  diag.Width =  window.innerWidth;
			diag.Height = window.innerHeight;
			 diag.Modal = true;				//有无遮罩窗口
			 diag. ShowMaxButton = true;	//最大化按钮
		     diag.ShowMinButton = true;		//最小化按钮 
			 diag.CancelEvent = function(){ //关闭事件
				diag.close();
				<%-- window.location.href='<%=basePath%>sotemplate/add_sotemplate?SOTEMPLATE_ID='+SOTEMPLATE_ID;
				 --%>
				$.ajax({
		    		url: "<%=basePath%>sotemplate/list_temporary",
		    		type: "POST",
					data: { 
							SOTEMPLATE_ID:SOTEMPLATE_ID,
						  }, 
					success: function(data){
							//alert(JSON.stringify(data));
							$("#edit-table").css('display',''); 
							$("#edit-div").css('display',''); 
							 $("#edit-tbody").html("");
							var res = data.data;
							var html = "";
							for(var i = 0 ;i<res.length;i++){
								html += "<tr>";
								html += "<td class='center'><label class='pos-rel'><input type='checkbox'checked='checked' name='ids' value="+res[i].FITEMID+" class='ace' /><span class='lbl'></span></label></td>";
								html += "<td class='center' style='width: 30px;'>"+(i+1)+"</td>";
								html += "<td class='left'>"+res[i].FNUMBER+"</td>";
								html += "<td class='left'>"+res[i].FNAME+"</td>";
								html += "<td class='left'>"+res[i].FORDERUNIT+"</td>";
								html += "<td class='left'>"+res[i].FMODEL+"</td>";
 								html += "<td class='left'><input type='number' id="+res[i].FITEMID+"  value='1' class='ace' /></td>";
								html += "</tr>";
							}
							
							$("#edit-tbody").append(html);
							/* <tr>
								<td class='center'><label class="pos-rel"><input
										type='checkbox' name='ids' value="${var.FITEMID}"
										class="ace" /><span class="lbl"></span>
								</label></td>
								<td class='center' style="width: 30px;">${vs.index+1}</td>
								<td class='center'>${var.FNUMBER}</td>
								<td class='center'>${var.FNAME}</td>
								<td class='center'>${var.FMODEL}</td>
								<td class='center'>${var.FQTY}</td>
							</tr> */
		   				 }, 
		   			error: function(){
		        		alert("失败，请稍后重试！！");
		    		},
				});
			 };
			 diag.show();
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