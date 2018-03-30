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
<base href="<%=basePath%>">
<script src="static/js/store/jquery-2.1.4.js"></script>
<link rel="stylesheet" href="static/css/form.css" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<!-- <link href="static/css/indent.css" rel="stylesheet" type="text/css"> -->
<!-- <link rel="stylesheet" type="text/css" href="static/css/ui.css" /> -->
<link href="static/css/indent.css" rel="stylesheet" type="text/css">
<link href="iTunesArtwork@2x.png" sizes="114x114" rel="apple-touch-icon-precomposed">
<!-- jsp文件头和头部 -->
<%-- <%@ include file="../../system/index/top.jsp"%> --%>
<script type="text/javascript"> 
        !function(J){function H(){var d=E.getBoundingClientRect().width;var e=(d/7.5>100*B?100*B:(d/7.5<42?42:d/7.5));E.style.fontSize=e+"px",J.rem=e}var G,F=J.document,E=F.documentElement,D=F.querySelector('meta[name="viewport"]'),B=0,A=0;if(D){var y=D.getAttribute("content").match(/initial\-scale=([\d\.]+)/);y&&(A=parseFloat(y[1]),B=parseInt(1/A))}if(!B&&!A){var u=(J.navigator.appVersion.match(/android/gi),J.navigator.appVersion.match(/iphone/gi)),t=J.devicePixelRatio;B=u?t>=3&&(!B||B>=3)?3:t>=2&&(!B||B>=2)?2:1:1,A=1/B}if(E.setAttribute("data-dpr",B),!D){if(D=F.createElement("meta"),D.setAttribute("name","viewport"),D.setAttribute("content","initial-scale="+A+", maximum-scale="+A+", minimum-scale="+A+", user-scalable=no"),E.firstElementChild){E.firstElementChild.appendChild(D)}else{var s=F.createElement("div");s.appendChild(D),F.write(s.innerHTML)}}J.addEventListener("resize",function(){clearTimeout(G),G=setTimeout(H,300)},!1),J.addEventListener("pageshow",function(b){b.persisted&&(clearTimeout(G),G=setTimeout(H,300))},!1),H()}(window);
        if (typeof(M) == 'undefined' || !M){
            window.M = {};
        }
     </script>   
</head>
<body class="no-skin">

							<!-- -------------------------------------------- -->
					<div class="header">
								个人信息
								<div class="header_left" onclick="window.history.go(-1)">
									<img src="static/images/store/return.png">
								</div>
							</div>		
		<ul class="information">
			<h2>基本信息</h2>
			<form action="synergy/${msg}" method="post" name="Form" id="Form">
			<input type="hidden" name="sex" id="sex" value="${sex}"/>
			<input type="hidden" name="SUPPLIERFORWX_ID" id="SUPPLIERFORWX_ID" value="${SUPPLIERFORWX_ID}"/>
			<input type="hidden" name="openid" id="openid" value="${openid}"/>
			<input type="hidden" name="selectidentity" id="selectidentity" value="${selectidentity}"/>
			<li>
				<label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
				<input class="infor-input" placeholder="请填写名称..."  type="text"  maxlength="100" name="name" value="${name}" />
			</li>
			<li>
				<label>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
				<select id="selectsex" class="infor-input">
					<option <c:if test="${sex == '男' }">selected="selected"</c:if>>男</option>
					<option <c:if test="${sex == '女' }">selected="selected"</c:if> >女</option>
				</select>
			</li>
			<li>
				<label>手&nbsp;机&nbsp;号&nbsp;码：</label>
				<input class="infor-input" placeholder="请填写手机号码..." type="number"  maxlength="100" name="phone"  value="${phone}" />
			</li>
			<li>
				<label>公&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;司：</label>
				
				<input class="infor-input" placeholder="请填写公司名称..." type="text" maxlength="100" name="company"  value="${company}"/>
			</li>
			<li>
				<label>联&nbsp;系&nbsp;地&nbsp;址：</label>
				<input class="infor-input btn" placeholder="请填写详细地址..." type="text" maxlength="100" name="address"  value="${address}"/>
			    <div id='result' ></div>
			</li>
			<li>
				<label>认&nbsp;证&nbsp;身&nbsp;份：</label>
				<select id="selectID" class="infor-input">
					<option>供应商</option>
					<!-- <option>网络搜索</option>
					<option>朋友介绍</option>
					<option>路过</option>
					<option>其他</option> -->
				</select>
			</li>
			<li>
				<label>备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注：</label>
				<!-- <input class="infor-input btn" placeholder="请填写你的备注..." type="" maxlength="100" name="note" /> -->
				<textarea style="width: 95%" cols="" rows=""
						class="textarea" name="note" id="note" value="${note}"
						placeholder="">${note}</textarea>
			</li>
		</ul>
		
		
		<div class="ture">注：请核实信息再保存</div>
		<a class="submit-btn" onclick="sub()">提交</a>
		</form>

							<!-- -------------------------------------------- -->


	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%-- <%@ include file="../../system/index/foot.jsp"%> --%>
	<!-- ace scripts -->
	<!-- <script src="static/ace/js/ace/ace.js"></script> -->
	<script type="text/javascript">
		//$(top.hangge());
		
		function sub(){
			$("#sex").val($("#selectsex").val());
			$("#selectidentity").val($("#selectID").val());
			$("#Form").submit();
		}
		
	</script>


</body>
</html>