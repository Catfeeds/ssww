package com.fh.controller.wx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.management.icpoorder.impl.ICPOOrderService;
import com.fh.service.management.icpoorderentry.impl.ICPOOrderEntryService;
import com.fh.util.PageData;
import com.fh.wx.info.WeixinInfo;
import com.fh.wx.pojo.WeixinOauth2Token;
import com.fh.wx.utils.CommonUtil;

@Controller
@RequestMapping(value="/order")
public class OrderController extends BaseController{
	
	String appId = WeixinInfo.AppID;
	String secret = WeixinInfo.AppSecret;
	
	@Resource(name="icpoorderentryService")
	private ICPOOrderEntryService icpoorderentryService;
	
	@Resource(name="icpoorderService")
	private ICPOOrderService icpoorderService;
	
	
	//receive
	@RequestMapping(value="/receive_order")
	public ModelAndView receive_order(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FVENDORID", pd.getString("FVENDORID"));
		System.out.println(pd.getString("FVENDORID"));
		pd.put("FSTATUS", 0);
		page.setPd(pd);
		//page.setShowCount(15);
		List<PageData> listNotReceive = icpoorderService.findByIdAndStatus(page);//未接收
		System.out.println("FSTATUS为0:"+listNotReceive.size());
		pd.put("FSTATUS", 1);
		page.setPd(pd);
		List<PageData> listNotDeliver = icpoorderService.findByIdAndStatus(page);//待发货
		System.out.println("FSTATUS为1:"+listNotDeliver.size());
		pd.put("FSTATUS", 2);
		page.setPd(pd);
		List<PageData> listDeliver = icpoorderService.findByIdAndStatus(page);//待验收
		System.out.println("FSTATUS为2:"+listDeliver.size());
		pd.put("FSTATUS", 3);
		page.setPd(pd);
		List<PageData> listReceive = icpoorderService.findByIdAndStatus(page);//已接收
		System.out.println(listReceive);
		System.out.println("FSTATUS为3:"+listReceive.size());
		/*String code = pd.getString("code");
		WeixinOauth2Token weixinOauth2Token = CommonUtil.getOauth2AccessToken(appId, secret, code);
		String openid = weixinOauth2Token.getOpenId();*/
		//System.out.println(pd);
		mv.addObject("FVENDORID",pd.getString("FVENDORID"));
		mv.addObject("httpUrl", WeixinInfo.httpUrl);
		mv.addObject("listNotReceive",listNotReceive);
		mv.addObject("listNotDeliver",listNotDeliver);
		mv.addObject("listDeliver",listDeliver);
		mv.addObject("listReceive",listReceive);
		mv.setViewName("wx/order/receive_order");
		return mv;
	}
	
	//未接收订单
	@RequestMapping(value="/detail_notReceive")
	public ModelAndView detail_notReceive(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FINTERID", pd.getString("FINTERID"));
		pd.put("FSTATUS",0);
		System.out.println( pd.getString("FINTERID"));
		PageData pd_one = icpoorderService.findByFinterID(pd);
		page.setPd(pd);
		List<PageData> listDetail = icpoorderentryService.listByFinterIDForNDD(page);
		mv.addObject("pd_one",pd_one);
		mv.addObject("listDetail",listDetail);
		mv.setViewName("wx/order/detail_notReceive");
		return mv;
	}
	
	//未发货订单
	@RequestMapping(value="/detail_notDeliver")
	public ModelAndView detail_notDeliver(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FINTERID", pd.getString("FINTERID"));
		pd.put("FSTATUS",1);
		System.out.println( pd.getString("FINTERID"));
		PageData pd_one = icpoorderService.findByFinterID(pd);
		page.setPd(pd);
		List<PageData> listDetail = icpoorderentryService.listByFinterIDForNDD(page);
		mv.addObject("pd_one",pd_one);
		mv.addObject("listDetail",listDetail);
		mv.setViewName("wx/order/detail_notDeliver");
		return mv;
	}
	
	//已发货订单
	@RequestMapping(value="/detail_Delivered")
	public ModelAndView detail_Delivered(Page page) throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FSTATUS",2);
		pd.put("FINTERID", pd.getString("FINTERID"));
		System.out.println( pd.getString("FINTERID"));
		PageData pd_one = icpoorderService.findByFinterID(pd);
		page.setPd(pd);
		List<PageData> listDetail = icpoorderentryService.listByFinterIDForNDD(page);
		mv.addObject("pd_one",pd_one);
		mv.addObject("listDetail",listDetail);
		mv.setViewName("wx/order/detail_Delivered");
		return mv;
	}
	
	//改变订单状态
	@RequestMapping(value="/editOrder_status")
	@ResponseBody
	public Map<String, Object> editOrder_status(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FINTERID", pd.getString("FINTERID"));
		pd.put("FSTATUS", Integer.parseInt(pd.getString("FSTATUS").toString()));
		icpoorderentryService.editFstatus(pd);
		json.put("result", "修改成功");
		return json;
	}
	
	//验收订单
		@RequestMapping(value="/checkOrder")
		@ResponseBody
		public Map<String, Object> checkOrder(Page page) throws Exception{
			Map<String, Object> json = new HashMap<String, Object>();
			PageData pd = new PageData();
			pd = this.getPageData();
			pd.put("FINTERID", pd.getString("FINTERID"));
			pd.put("FSTATUS", Integer.parseInt(pd.getString("FSTATUS").toString()));
			icpoorderentryService.editFstatusToCheck(pd);
			json.put("result", "修改成功");
			return json;
		}
	
	//发货，修改订单状态
	@RequestMapping(value="/deliver")
	@ResponseBody
	public Map<String, Object> deliver(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println("发货-----");
		pd.put("FINTERID", pd.getString("FINTERID"));
		JSONArray jsonArray = JSONArray.fromObject(pd.getString("arrayData") ); 
		//System.out.println("jsonArray长度:"+jsonArray.size());
		 for(int i=0;i<jsonArray.size();i++){
		    JSONObject job = jsonArray.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
		    System.out.println(job.get("FENTRYID")+"="+job.get("FDELIVERQTY")) ;  // 得到 每个对象中的属性值
		    pd.put("FENTRYID", job.get("FENTRYID"));
		    if(Integer.parseInt(job.get("FDELIVERQTY").toString()) != 0){
			     pd.put("FDELIVERQTY", job.get("FDELIVERQTY"));
			     icpoorderentryService.editDeliverNum(pd);
			     pd.put("FSTATUS",2);
			     icpoorderentryService.editFstatusByFENTRYID(pd);
		    }else {
		    	 pd.put("FSTATUS",1);
		    	 icpoorderentryService.editFstatusByFENTRYID(pd);
		    	pd.put("FDELIVERQTY", job.get("FDELIVERQTY"));
			     icpoorderentryService.editDeliverNum(pd);
			}
		  }
		//pd.put("FSTATUS", Integer.parseInt(pd.getString("FSTATUS").toString()));
		//icpoorderentryService.editFstatusByFENTRYID(pd);
		json.put("result", "修改成功");
		return json;
	}
	

	
}
