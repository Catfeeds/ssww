<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Expires" content="-1">
    <title>我们结婚了，自主开发的电子请柬</title>
    <link rel="stylesheet" type="text/css" href="static/hl/css/default.css">
    <link rel="stylesheet" type="text/css" href="static/hl/css/default.date.css">
    <link rel="stylesheet" type="text/css" href="static/hl/css/default.time.css">
    <link rel="stylesheet" type="text/css" href="static/hl/css/main.css">
    <link rel="stylesheet" type="text/css" href="static/hl/css/normalize.css" /><!--CSS RESET-->
    <link rel="stylesheet" type="text/css" href="static/hl/css/htmleaf-demo.css"><!--演示页面样式，使用时可以不引用-->
    <link href="static/hl/css/photopile.css" rel="stylesheet">
    <link href="static/hl/css/demo.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <![endif]-->
    <style type="text/css">
        #container {width: 90%;height: 40%;overflow: hidden;margin-left:5%;margin-top:5%;font-family:"微软雅黑";border-radius: 38px;
            border: 2px solid #0089ec3b;box-shadow:0px 21px 127px #b1dcfbad}
        #container1 {width: 90%;height: 40%;overflow: hidden;margin-left:5%;margin-top:5%;font-family:"微软雅黑";border-radius: 38px;
            border: 2px solid #0089ec3b;box-shadow:0px 21px 127px #b1dcfbad}
    </style>
    <script type="text/javascript">
        var phoneWidth =  parseInt(window.screen.width);
        var phoneScale = phoneWidth/640;
        var ua = navigator.userAgent;
        if (/Android (\d+\.\d+)/.test(ua)){
            var version = parseFloat(RegExp.$1);
            if(version>2.3){
                document.write('<meta name="viewport" content="width=640, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
            }else{
                document.write('<meta name="viewport" content="width=640, target-densitydpi=device-dpi">');
            }
        } else {
            document.write('<meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">');
        }
    </script><meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">
</head>
<body>
<input type="hidden" value="2660" id="activeId">
<%--<section class="p-index" style="height: 643px;">--%>
<div class="audio_txt">
    <p class="txt">点击开启/关闭音效</p>
    <p></p>
</div>
<section class="fn-audio">
    <div class="btn">
        <p class="btn_audio"><span class="css_sprite01 audio_open"></span><span class="css_sprite01 audio_close"></span></p>
        <audio id="car_audio" autoplay controls preload="preload">
            <source src="static/hl/music/dwoyn.mp3" type="audio/mpeg">
            您的浏览器不支持HTML5音频格式
        </audio>
    </div>
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/1.png) center no-repeat; background-size:cover;">
    </div>
    <img data-share-logo="" src="1.png" style="display:none;">
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/2.jpg) center no-repeat; background-size:cover;">
    </div>
    <img data-share-logo="" src="K74A1048_副本.jpg" style="display:none;">
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/12.png) center no-repeat; background-size:cover;">
    </div>
</section>
<section  data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/15.png) center no-repeat; background-size:cover;">
    </div>
</section>
<section data-page="3" class="m-page m-page3 hide" data-id="25510" data-type="info_more" style="height: 643px;">
    <div class="htmleaf-container" style="margin-top: 28%;margin-left:8%;position: absolute;">
        <ul class="photopile">
            <li>
                <a href="static/hl/images/tpq/1_ys.png">
                    <img src="static/hl/images/tpq/1_ys.png" alt="洱海边" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/2_ys.png">
                    <img src="static/hl/images/tpq/2_ys.png" alt="化个妆，准备证件照" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/3_ys.png">
                    <img src="static/hl/images/tpq/3_ys.png" alt="第二次参加佛山徒步50km，let`s，go" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/9_ys.png">
                    <img src="static/hl/images/tpq/9_ys.png" alt="允许我放个屁" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/5_ys.png">
                    <img src="static/hl/images/tpq/5_ys.png" alt="Mr.演唱会走起" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/6_ys.png">
                    <img src="static/hl/images/tpq/6_ys.png" alt="出自本电子请柬作者大师之手" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/7_ys.png">
                    <img src="static/hl/images/tpq/7_ys.png" alt="上苍山" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/8_ys.png">
                    <img src="static/hl/images/tpq/8_ys.png" alt="苍山中" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/19.jpg">
                    <img src="static/hl/images/tpq/19.jpg" alt="那年元旦" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/20.png">
                    <img src="static/hl/images/tpq/20.png" alt="珠海海洋王国" width="133" height="100" />
                </a>
            </li>
        </ul>
        <br><br><br>
        <ul class="photopile">
            <li>
                <a href="static/hl/images/tpq/10.png">
                    <img src="static/hl/images/tpq/10.png" alt="洱海边" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/11.png">
                    <img src="static/hl/images/tpq/11.png" alt="O(∩_∩)O嗯!O(∩_∩)O嗯!O(∩_∩)O嗯!" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/12.png">
                    <img src="static/hl/images/tpq/12.png" alt="\(^o^)/~" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/13.png">
                    <img src="static/hl/images/tpq/13.png" alt="d=====(￣▽￣*)b" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/15.png">
                    <img src="static/hl/images/tpq/15.png" alt="第三次佛山50km徒步，南海站" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/16.png">
                    <img src="static/hl/images/tpq/16.png" alt="禅城站，签到盖章纪念册" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/17.png">
                    <img src="static/hl/images/tpq/17.png" alt="第二波Mr.演唱会，签到" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/18.jpg">
                    <img src="static/hl/images/tpq/18.jpg" alt="忘记是哪一年的元旦了" width="133" height="100" />
                </a>
            </li>
            <li>
                <a href="static/hl/images/tpq/21.jpg">
                    <img src="static/hl/images/tpq/21.jpg" alt="禅城50公里徒步王借岗(22KM)签到点" width="133" height="100" />
                </a>
            </li>
        </ul>
    </div>
    <div class="m-img m-img01" style="background:url(static/hl/images/new/3.png) center no-repeat; background-size:cover;">
    </div>
</section>
<section  data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/13.jpg) center no-repeat; background-size:cover;">
    </div>
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/10.png) center no-repeat; background-size:cover;">
    </div>
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/5.png) center no-repeat; background-size:cover;">
    </div>
</section>

<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/6.png) center no-repeat; background-size:cover;">
    </div>
</section>

<section  data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div class="m-img m-img01" style="background:url(static/hl/images/new/16.png) center no-repeat; background-size:cover;">
    </div>
</section>
<section data-page="1" class="m-page m-page1 show" data-id="25509" data-type="info_pic2" style="height: 643px;">
    <div style="position: absolute;width: 90%;height: 380px;margin-top:50%;border: 18px solid #1e0000; box-shadow:0px 21px 127px #b1dcfbad;border-radius: 18px;background:#f0fbeb;margin-left: 5%">
        <video id="video" src="static/hl/music/zp.mp4" webkit-playsinline="" playsinline="" x5-playsinline="" x-webkit-airplay="allow" type="video/mp4" controls width="100%" height="100%" >
            抱歉，你的浏览器不支持video标签。。
        </video>
    </div>
    <div class="m-img m-img01" style="background:url(static/hl/images/new/9.png) center no-repeat; background-size:cover;"> </div>
</section>
<section data-page="6" class="m-page m-page6 hide" data-id="25511" data-type="multi_contact" style="height: 643px;">

    <div style="position: absolute;"  id="container"  >

    </div>

    <div  style="position: absolute;display:none" id="container1"  >

    </div>


    <div style="width: 90%;margin-top:70%;margin-left:5%;position: absolute;" class="m-intro">
        <div class="btn">
            <p class="tel btn-boder-color"><a href="tel:15819531619"><span class="css_sprite01"></span>联系新郎：15819531619</a></p>
            <p class="tel btn-boder-color"><a href="tel:13760931020"><span class="css_sprite01"></span>联系新娘：13760931020</a></p>
            <p class="tel btn-boder-color"><a id="btn" data-clipboard-text="云浮市宝马路藕塘村人居建材装饰材料厂">复制男方定位地址</a></p>
            <p class="tel btn-boder-color"><a id="btn1" data-clipboard-text="云浮市罗定素龙富有塘">复制女方定位地址</a></p>
            <%--<p class="tel btn-boder-color"><button onclick="share()" id="share"><span class="css_sprite01"></span>分享</button></p>--%>
        </div>
    </div>
    <div class="m-img m-img01" style="background:url(static/hl/images/new/7.png) center no-repeat; background-size:cover;">
    </div>

</section>
<section class="u-arrow"><img src="static/hl/images/new/btn01_arrow.png"></section>
<script src="static/js/store/jquery-2.1.4.js"></script>
<script src="http://res.wx.qq.com/open/js/jweixin-1.4.0.js"></script>

<%--<script type="text/javascript" src="static/hl/js/jquery-1.11.0.min.js"></script>--%>
<script type="text/javascript" src="static/hl/js/html5.js"></script>
<script type="text/javascript" src="static/hl/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="static/hl/js/jquery.ui.touch-punch.min.js"></script>
<script type="text/javascript" src="static/hl/js/photopile.js"></script>
<script type="text/javascript" src="static/hl/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="static/hl/js/txt_scroll.js"></script>
<script type="text/javascript" src="static/hl/js/yl3d.js"></script>
<script type="text/javascript" src="static/hl/js/ylMap.js"></script>
<script type="text/javascript" src="static/hl/js/1_picker.js"></script>
<script type="text/javascript" src="static/hl/js/2_picker.date.js"></script>
<script type="text/javascript" src="static/hl/js/3_picker.time.js"></script>
<script type="text/javascript" src="static/hl/js/4_legacy.js"></script>
<script type="text/javascript" src="static/hl/js/9_slidepic.js"></script>
<script type="text/javascript" src="static/hl/js/99_main.js"></script>
<script type="text/javascript" src="static/hl/js/wxm-core176ed4.js"></script>
<script type="text/javascript" src="static/hl/js/wxshare.js"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.3">  </script>
<script type="text/javascript" src="static/hl/js/clipboard.min.js"></script>
<script language=javascript>

    wx.config({
        //beta: true,// 必须这么写，否则在微信插件有些jsapi会有问题
        //debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
        appId : 'wxf297fc64f92b7f99', // 必填，企业微信的cropID
        timestamp : parseInt('${pd.timestamp}'), // 必填，生成签名的时间戳
        nonceStr : '${pd.nonceStr}', // 必填，生成签名的随机串
        signature : '${pd.signature}',// 必填，签名，见[附录1](#11974)
        jsApiList : [ 'onMenuShareAppMessage','openLocation'//下载图片接口

        ]
        // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
    });



    wx.ready(function(){
        var imgUrl = '<%=basePath%>static/hl/images/new/K74A1372.png';  //注意必须是绝对路径
        var lineLink = '<%=basePath%>test1/goThe';   //同样，必须是绝对路径
        var descContent = '亲爱的朋友们，我们结婚了，想要和你们一起分享我们的快乐，祝大家幸福美满！'; //分享给朋友或朋友圈时的文字简介
        var shareTitle = '邓家成和陈思怡的婚礼邀请';  //分享title
        var appid = ''; //apiID，可留空
        wx.onMenuShareAppMessage({
            title: shareTitle, // 分享标题
            desc: descContent, // 分享描述
            link: lineLink, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
            imgUrl: imgUrl, // 分享图标
        }, function(res) {
            alert("111");
        });
    });

    var vid = document.querySelector('video');

    vid.addEventListener('play',function(){
        $("#car_audio")[0].pause();
    });
    vid.addEventListener('pause',function(){
        $("#car_audio")[0].play();
    });

    var iconaa = new BMap.Icon("<%=basePath%>static/hl/images/new/cc.png", new BMap.Size(25, 38), {
        anchor: new BMap.Size(15, 38),
        infoWindowAnchor: new BMap.Size(9, 0)
    });


    map_init();
    function map_init(){
        //var markerArr = obj;
        //console.log(markerArr.ywType);
        var map = new BMap.Map("container"); // 创建Map实例
        var point = new BMap.Point(112.048575,22.937); //地图中心点，云浮市 藕塘村
        map.centerAndZoom(point, 16); // 初始化地图,设置中心点坐标和地图级别。
        map.enableScrollWheelZoom(true); //启用滚轮放大缩小
        //向地图中添加缩放控件
        var ctrlNav = new window.BMap.NavigationControl({
            anchor: BMAP_ANCHOR_TOP_LEFT,
            type: BMAP_NAVIGATION_CONTROL_LARGE
        });
        map.addControl(ctrlNav);

        map.disableDoubleClickZoom();

        //向地图中添加缩略图控件
        //var ctrlOve = new window.BMap.OverviewMapControl({
        //   anchor: BMAP_ANCHOR_BOTTOM_RIGHT,
        //   isOpen: 1
        //});

        //map.addControl(ctrlOve);
        var point1 = new Array(); //存放标注点经纬信息的数组
        var marker = new Array(); //存放标注点对象的数组
        var info = new Array(); //存放提示信息窗口对象的数组

        var cr = new BMap.CopyrightControl({
            anchor: BMAP_ANCHOR_BOTTOM_RIGHT,
            offset: new BMap.Size(10, 10)
        }); //设置版权控件位置
        var bs = map.getBounds();
        var select = "<select style='font-size: 19px;background-color: #0099ff30;font-weight :bold; text-align: center;border-radius: 15px;width:85px;height:38px;display: inline-block; border-left: 7px solid transparent;  border-right: 7px solid transparent; border-bottom: 7px solid #CCC;' id='d111' onchange='getType(this)' >" +
                "<option name='男方' selected value='男方' >男方</option>" +
                "<option name='女方' value='女方' >女方</option></select>";
        cr.addCopyright({
            id: 1,
            content: select,
            bounds: bs
        });
        map.addControl(cr);


        point1[0] = new window.BMap.Point(112.0579,22.929915); //循环生成新的地图点
        marker[0] = new window.BMap.Marker(point1[0], {
            icon: iconaa
        });
        marker[0].setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
        map.addOverlay(marker[0]);
        var label = new window.BMap.Label("新郎酒宴地址：云浮市云城区藕塘村73号", {
            offset: new window.BMap.Size(-10, -45)

        });
        label.setStyle({ //给label设置样式，任意的CSS都是可以的
            borderStyle: "Double",
            borderWidth: "1pt",
            // borderColor: "#F0F0F0",
            borderRadius: "5px",
            borderColor: "#808080",
            fontSize: "17px", //字号
            textAlign: "center", //文字水平居中显示
            cursor: "pointer"
        });
        marker[0].setLabel(label);
       /* marker[0].addEventListener("click", function(){
            alert("111");

        });*/

    }
    var btn = document.getElementById('btn');
    var clipboard = new Clipboard(btn);
    clipboard.on('success', function(e) {
        alert("地址复制成功，请在手机地图粘贴定位");
        //复制成功
    });
    clipboard.on('error', function(e) {
        alert("复制失败了");
    });

    var btn1 = document.getElementById('btn1');
    var clipboard1 = new Clipboard(btn1);
    clipboard1.on('success', function(e) {
        alert("地址复制成功，请在手机地图粘贴定位");
        //复制成功
    });
    clipboard1.on('error', function(e) {
        alert("复制失败了");
    });

    map_init1();
    function map_init1(){
        //var markerArr = obj;
        //console.log(markerArr.ywType);
        var map = new BMap.Map("container1"); // 创建Map实例
        var point = new BMap.Point(111.601799,22.769051); //地图中心点，云浮市 藕塘村
        map.centerAndZoom(point, 16); // 初始化地图,设置中心点坐标和地图级别。
        map.enableScrollWheelZoom(true); //启用滚轮放大缩小
        //向地图中添加缩放控件
        var ctrlNav = new window.BMap.NavigationControl({
            anchor: BMAP_ANCHOR_TOP_LEFT,
            type: BMAP_NAVIGATION_CONTROL_LARGE
        });
        map.addControl(ctrlNav);

        map.disableDoubleClickZoom();

        //向地图中添加缩略图控件
        //var ctrlOve = new window.BMap.OverviewMapControl({
        //   anchor: BMAP_ANCHOR_BOTTOM_RIGHT,
        //   isOpen: 1
        //});

        //map.addControl(ctrlOve);
        var point1 = new Array(); //存放标注点经纬信息的数组
        var marker = new Array(); //存放标注点对象的数组
        var info = new Array(); //存放提示信息窗口对象的数组

        var cr = new BMap.CopyrightControl({
            anchor: BMAP_ANCHOR_BOTTOM_RIGHT,
            offset: new BMap.Size(10, 10)
        }); //设置版权控件位置
        var bs = map.getBounds();
        var select = "<select style='font-size: 19px;background-color: #0099ff30;font-weight :bold; text-align: center;border-radius: 15px;width:85px;height:38px;display: inline-block; border-left: 7px solid transparent;  border-right: 7px solid transparent; border-bottom: 7px solid #CCC;' id='ddd' onchange='getType(this)' >" +
                "<option  name='男方' value='男方' >男方</option>" +
                "<option name='女方' selected value='女方' >女方</option></select>";
        cr.addCopyright({
            id: 1,
            content: select,
            bounds: bs
        });
        map.addControl(cr);


        point1[0] = new window.BMap.Point(111.610809,22.763045); //循环生成新的地图点
        marker[0] = new window.BMap.Marker(point1[0], {
            icon: iconaa
        });
        marker[0].setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
        map.addOverlay(marker[0]);
        var label = new window.BMap.Label("新娘酒宴地址：罗定市素龙镇环市东路富有堂", {
            offset: new window.BMap.Size(-10, -45)

        });
        label.setStyle({ //给label设置样式，任意的CSS都是可以的
            borderStyle: "Double",
            borderWidth: "1pt",
            // borderColor: "#F0F0F0",
            borderRadius: "5px",
            borderColor: "#808080",
            fontSize: "17px", //字号
            textAlign: "center", //文字水平居中显示
            cursor: "pointer"
        });
        marker[0].setLabel(label);


    }

    function getType(val){
        if( $(val).val() == "男方"){
            $(val).find("option[name='女方']").attr("selected","selected");
            $("#container").css("display","");
            $("#container1").css("display","none");

        }else {
            $(val).find("option[name='男方']").attr("selected","selected");
            $("#container").css("display","none");
            $("#container1").css("display","");
        }
      // alert($(val).val());
    }


    function audioAutoPlay(id){
        var audio = document.getElementById(id),
                play = function(){
                    audio.play();
                    document.removeEventListener("touchstart",play, false);
                };
        audio.play();
        document.addEventListener("WeixinJSBridgeReady", function () {//微信
            play();
        }, false);
        document.addEventListener('YixinJSBridgeReady', function() {//易信
            play();
        }, false);
        document.addEventListener("touchstart",play, false);
    }
    audioAutoPlay('car_audio');

    $(function(){
        PhotoPile().scatter();
        //setTimeout(funcName,10000);
    })





</script>

</body>
</html>