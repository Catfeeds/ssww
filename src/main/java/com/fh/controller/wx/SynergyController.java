package com.fh.controller.wx;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.management.icpoorder.impl.ICPOOrderService;
import com.fh.service.wx.supplierforwx.impl.SupplierForWxService;
import com.fh.service.wx.wxtoken.impl.WxTokenService;
import com.fh.util.PageData;
import com.fh.wx.info.WeixinInfo;
import com.fh.wx.pojo.AccessToken;
import com.fh.wx.pojo.WeixinOauth2Token;
import com.fh.wx.pojo.WeixinUserInfo;
import com.fh.wx.utils.CommonUtil;
import com.fh.wx.utils.WeixinUtil;

@Controller
@RequestMapping(value="/synergy")
public class SynergyController extends BaseController{
	
	//图片域名pic_url
	private String pic_url = "http://jittest.s1.natapp.cc/ssww";
	WeixinUtil wxUtil = new WeixinUtil();
	String appId = WeixinInfo.AppID;
	String secret = WeixinInfo.AppSecret;
	
	@Resource(name="wxtokenService")
	private WxTokenService wxtokenService;
	@Resource(name="supplierforwxService")
	private SupplierForWxService supplierforwxService;
	@Resource(name="icpoorderService")
	private ICPOOrderService icpoorderService;
	
	@RequestMapping(value="/index")
	public ModelAndView toIndex(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String code = pd.getString("code");
		WeixinOauth2Token weixinOauth2Token = CommonUtil.getOauth2AccessToken(appId, secret, code);
		String openid = weixinOauth2Token.getOpenId();
		System.out.println(openid);
		pd.put("FOPENID", openid);
		/*pd.put("FVENDORID", 8874);
		pd.put("FSTATUS", 1);*/
		page.setPd(pd);
		String isAudit =null;
		int identity = 0;
		List<PageData> listuser = supplierforwxService.findByOpenID(page);
		System.out.println(listuser);
		if (listuser.size() != 0) {
			for (int i = 0; i < listuser.size(); i++) {
				isAudit = listuser.get(0).get("FISAUDIT").toString();
				//pd.put("FVENDORID", listuser.get(0).get("FIDENTITY"));
				identity = Integer.parseInt(listuser.get(0).get("FSUPPLIERID").toString());
			}
			if (isAudit != null && isAudit.equals("已审核")) {
				pd.put("FVENDORID", identity);
				pd.put("FSTATUS", 1);
				page.setPd(pd);
				List<PageData> listNotDeliver = icpoorderService.findByIdAndStatus(page);//待发货
				mv.addObject("size",listNotDeliver.size());
				mv.addObject("FVENDORID",identity);
				mv.setViewName("wx/synergy/index");
			}else {
				mv.setViewName("wx/synergy/null");
			}
		}else {
			mv.setViewName("wx/synergy/null");
		}
		//System.out.println(pd);
		//mv.setViewName("wx/synergy/index");
		return mv;
	}
	
	//新增客户页面
	@RequestMapping(value="/addClient")
	public ModelAndView addClient(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String code = pd.getString("code");
		WeixinOauth2Token weixinOauth2Token = CommonUtil.getOauth2AccessToken(appId, secret, code);
		String openid = weixinOauth2Token.getOpenId();
		//System.out.println(openid);
		pd.put("FOPENID", openid);
		System.out.println(openid);
		page.setPd(pd);
		List<PageData> listuser = supplierforwxService.findByOpenID(page);
		System.out.println("用户个数："+listuser.size());
		if (listuser.size() != 0) {
			for (int i = 0; i < listuser.size(); i++) {
				mv.addObject("name",listuser.get(0).get("FSUPPLIERNAME"));
				mv.addObject("sex",listuser.get(0).get("FSEX"));
				mv.addObject("company",listuser.get(0).get("FCOMPANY"));
				mv.addObject("address",listuser.get(0).get("FCOMADREES"));
				mv.addObject("phone",listuser.get(0).get("FPHONE"));
				mv.addObject("note",listuser.get(0).get("FNOTE"));
				mv.addObject("SUPPLIERFORWX_ID",listuser.get(0).get("SUPPLIERFORWX_ID"));
				mv.addObject("msg","editClient");
			}
		}else {
			System.out.println("->跳转到保存的页面");
			mv.addObject("msg","saveClient");
		}
		mv.addObject("openid",openid);
		mv.setViewName("wx/synergy/addClient");
		return mv;
	}
	
	@RequestMapping(value="/editClient")
	public ModelAndView editClient(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("SUPPLIERFORWX_ID", pd.getString("SUPPLIERFORWX_ID"));
		pd.put("FSEX", pd.getString("sex"));
		pd.put("FSUPPLIERNAME", pd.getString("name"));
		pd.put("FPHONE", pd.getString("phone"));
		pd.put("FCOMPANY", pd.getString("company"));
		pd.put("FCOMADREES", pd.getString("address"));
		pd.put("FNOTE", pd.getString("note"));
		page.setPd(pd);
		System.out.println("执行修改");
		supplierforwxService.edit_one(pd);
		mv.setViewName("wx/synergy/null");
		return mv;
	}
	
	//保存用户信息
	@RequestMapping(value="/saveClient")
	public ModelAndView saveClient(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		System.out.println(pd);
		String openid = pd.getString("openid");
		long td ;
		String WXTOKEN_ID = null;
		Date createtime = null;
		String token = null;
		List<PageData> wxlist = wxtokenService.list(page);
		System.out.println("wxlist::"+wxlist.size());
		if (wxlist.size() == 0) {
			PageData wxpd = new PageData();
			String appid = WeixinInfo.AppID;
			String appsecret = WeixinInfo.AppSecret;
			AccessToken accessToken= WeixinUtil.getAccessToken(appid,appsecret);
			wxpd.put("WXTOKEN_ID", this.get32UUID());
			wxpd.put("ACCESS_TOKEN", accessToken.getToken());
			wxpd.put("CREATETIME",new Date());
			wxtokenService.save(wxpd);
			//Date timeDate = new Date();
			token = accessToken.getToken();
		}else {
			for (int i = 0; i < wxlist.size(); i++) {
				createtime = (Date) wxlist.get(0).get("CREATETIME");
				WXTOKEN_ID = wxlist.get(0).get("WXTOKEN_ID").toString();
				token = wxlist.get(0).get("ACCESS_TOKEN").toString();
			}
			if (((new Date().getTime() - createtime.getTime())/1000)>=6000) {
				System.out.println("超时更新token");
				String appid = WeixinInfo.AppID;
				String appsecret = WeixinInfo.AppSecret;
				AccessToken accessToken= WeixinUtil.getAccessToken(appid,appsecret);
				PageData wxpd = new PageData();
				wxpd.put("WXTOKEN_ID", WXTOKEN_ID);
				wxpd.put("ACCESS_TOKEN", accessToken.getToken());
				wxpd.put("CREATETIME",new Date());
				wxtokenService.edit(wxpd);
				token = accessToken.getToken();
			}else {
				System.out.println("使用数据库token");
			}
		}
		WeixinUserInfo weixinUserInfo =CommonUtil.getUserInfo(token,openid);
		PageData userpd = new PageData();
		userpd.put("SUPPLIERFORWX_ID", this.get32UUID());
		userpd.put("FOPENID", openid);
		userpd.put("FUSERNAME", weixinUserInfo.getNickname());
		userpd.put("FIDENTITY", "");
		userpd.put("FTID", pd.getString("selectidentity"));
		userpd.put("FISAUDIT", "未审核");
		userpd.put("FPROVINCE",  weixinUserInfo.getProvince());
		userpd.put("FHEADIMGURL", weixinUserInfo.getHeadImgUrl());
		//userpd.put("FSUPPLIERID", null);
		userpd.put("FSUPPLIERNAME", pd.getString("name"));
		userpd.put("FCOMADREES",  pd.getString("address"));
		userpd.put("FSEX",pd.getString("sex"));
		userpd.put("FPHONE", pd.getString("phone"));
		userpd.put("FCOMPANY", pd.getString("company"));
		userpd.put("FNOTE", pd.getString("note"));
		System.out.println("执行保存");
		supplierforwxService.save(userpd);
		mv.setViewName("wx/synergy/null");
		return mv;
	}
		
	
		/**
		 * long td ;
		String WXTOKEN_ID = null;
		Date createtime = null;
		String token = null;
		List<PageData> wxlist = wxtokenService.list(page);
		System.out.println("wxlist::"+wxlist.size());
		if (wxlist.size() == 0) {
			PageData wxpd = new PageData();
			String appid = WeixinInfo.AppID;
			String appsecret = WeixinInfo.AppSecret;
			AccessToken accessToken= WeixinUtil.getAccessToken(appid,appsecret);
			wxpd.put("WXTOKEN_ID", this.get32UUID());
			wxpd.put("ACCESS_TOKEN", accessToken.getToken());
			wxpd.put("CREATETIME",new Date());
			wxtokenService.save(wxpd);
			//Date timeDate = new Date();
			token = accessToken.getToken();
		}else {
			for (int i = 0; i < wxlist.size(); i++) {
				createtime = (Date) wxlist.get(0).get("CREATETIME");
				WXTOKEN_ID = wxlist.get(0).get("WXTOKEN_ID").toString();
				token = wxlist.get(0).get("ACCESS_TOKEN").toString();
			}
			if (((new Date().getTime() - createtime.getTime())/1000)>=6000) {
				System.out.println("超时更新token");
				String appid = WeixinInfo.AppID;
				String appsecret = WeixinInfo.AppSecret;
				AccessToken accessToken= WeixinUtil.getAccessToken(appid,appsecret);
				PageData wxpd = new PageData();
				wxpd.put("WXTOKEN_ID", WXTOKEN_ID);
				wxpd.put("ACCESS_TOKEN", accessToken.getToken());
				wxpd.put("CREATETIME",new Date());
				wxtokenService.edit(wxpd);
				token = accessToken.getToken();
			}else {
				System.out.println("使用数据库token");
			}
		}
		 */
}
