package com.fh.controller.wxqy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.qy.qyutil.WeiXinParamesUtil;
import com.fh.qy.qyutil.WeiXinUtil;
import com.fh.qy.service.CodeToUserService;
import com.fh.service.management.icpoorder.impl.ICPOOrderService;
import com.fh.service.management.icpoorderentry.impl.ICPOOrderEntryService;
import com.fh.service.management.icpoorderpicpath.ICPOOrderPicPathManager;
import com.fh.service.wxqy.qywxuser.QyWxUserManager;
import com.fh.util.PageData;
import com.fh.wx.info.WeixinInfo;

@Controller
@RequestMapping(value="/platformQY")
public class PlatformQYController extends BaseController{
	
	@Resource(name="qywxuserService")
	private QyWxUserManager qywxuserService;
	
	@Resource(name="icpoorderentryService")
	private ICPOOrderEntryService icpoorderentryService;
	
	@Resource(name="icpoorderService")
	private ICPOOrderService icpoorderService;

	@Resource(name="icpoorderpicpathService")
	private ICPOOrderPicPathManager icpoorderpicpathService;
	
	CodeToUserService ctus = new CodeToUserService();
	
	@RequestMapping(value="/tojump")
	public ModelAndView tojump(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("wxqy/platformQY/jump");
		return mv;
	}
	
	@RequestMapping(value="/index")
	public ModelAndView toIndex(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String code = pd.getString("code").trim();
		String accessToken= WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.localhostAgentSecret).getToken();
		
		JSONObject jsonObject = ctus.getUserinfo(accessToken, code);
		try {
			pd.put("USERID", jsonObject.getString("UserId"));
			PageData userData = qywxuserService.findByUserId(pd);
			mv.addObject("userData", userData);
			System.out.println(userData);
		} catch (Exception e) {
			System.out.println("=========================");
		}
		mv.addObject("code", code);
		mv.addObject("UserId", jsonObject.getString("UserId"));
		//System.out.println(jsonObject.getString("UserId"));
		mv.setViewName("wxqy/platformQY/index");
		return mv;
	}
	
	@RequestMapping(value="/getUserId")
	@ResponseBody
	public Map<String, Object> getUserId(Page page) throws Exception {
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String code = pd.getString("code").trim();
		String accessToken= WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.mxfAgentSecret).getToken();
		JSONObject jsonObject = ctus.getUserinfo(accessToken, code);
		pd.put("USERID", jsonObject.getString("UserId"));
		PageData userData = qywxuserService.findByUserId(pd);
		json.put("result", "123");
		return json;
	}
	
	@RequestMapping(value="/to_receive_order")
	public ModelAndView to_receive_order(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		List<PageData> allOrder = icpoorderService.listAllWithName(pd);
		System.out.println("allOrder共有"+allOrder.size()+"条数据");
		mv.addObject("allOrder", allOrder);
		mv.addObject("httpUrl", WeixinInfo.httpUrl);
		mv.addObject("USERID", pd.getString("USERID"));
		mv.setViewName("wxqy/platformQY/receive_order");
		return mv;
	}
	
	//detail_order
	@RequestMapping(value="/detail_order")
	public ModelAndView detail_notReceive(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FINTERID", pd.getString("FINTERID"));
		//pd.put("FSTATUS",3); //如需要限制状态不为3即执行这方法
		//System.out.println( pd.getString("FINTERID"));
		PageData pd_one = icpoorderService.findByFinterID(pd);
		page.setPd(pd);
		List<PageData> listDetail = icpoorderentryService.listByFinterID(page);
		System.out.println(listDetail);
		//System.out.println(pd_one);
		mv.addObject("pd_one",pd_one);
		mv.addObject("listDetail",listDetail);
		mv.setViewName("wxqy/platformQY/detail_order");
		return mv;
	}
	
	@RequestMapping(value="/toCheck")
	public ModelAndView toCheck(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		PageData pd_one = icpoorderentryService.findForOneWL(pd);
		//System.out.println(pd_one);
		page.setPd(pd);
		List<PageData> listPic = icpoorderpicpathService.findByNE(page);
		//System.out.println(listPic);
        mv.addObject("listPic", listPic);
        mv.addObject("httpUrl", WeixinInfo.httpUrl);
		mv.addObject("pd_one",pd_one);
		mv.addObject("FINTERID",pd.getString("FINTERID"));
		mv.setViewName("wxqy/platformQY/check");
		return mv;
	}
	
	@RequestMapping(value="/passCheck")
	 @ResponseBody
	public Map<String, Object> passCheck(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		pd.put("FSTATUS", 3);
		icpoorderentryService.editFstatusByFENTRYID(pd);
		json.put("success", "成功");
		return json ;
	}
	
	@RequestMapping(value="/delCheckPic")
	 @ResponseBody
	public Map<String, Object> delCheckPic(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		pd.put("FNOTE", "del");
		icpoorderpicpathService.editPicStatus(pd);
		json.put("success", "成功");
		return json ;
	}
	
}
