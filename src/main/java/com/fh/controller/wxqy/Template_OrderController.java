package com.fh.controller.wxqy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sun.tools.tree.ThisExpression;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.management.interfaceip.InterfaceIPManager;
import com.fh.service.management.itembase.ItemBaseManager;
import com.fh.service.management.replenish_item.Replenish_itemManager;
import com.fh.service.management.salesorderbill.SalesOrderBillManager;
import com.fh.service.management.salesorderbillentry.SalesOrderBillEntryManager;
import com.fh.service.management.sotemplate.SOTemplateManager;
import com.fh.service.management.sotemplateentry.SOTemplateEntryManager;
import com.fh.util.Jurisdiction;
import com.fh.util.PageData;
import com.fh.wx.info.WeixinInfo;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@RequestMapping(value="/template_Order")
public class Template_OrderController extends BaseController{
	
	@Resource(name="sotemplateService")
	private SOTemplateManager sotemplateService;
	
	@Resource(name="sotemplateentryService")
	private SOTemplateEntryManager sotemplateentryService;
	
	@Resource(name="salesorderbillService")
	private SalesOrderBillManager salesorderbillService;
	
	@Resource(name="salesorderbillentryService")
	private SalesOrderBillEntryManager salesorderbillentryService;
	
	@Resource(name="interfaceipService")
	private InterfaceIPManager interfaceipService;
	
	@Resource(name="itembaseService")
	private ItemBaseManager itembaseService;
	
	@Resource(name="replenish_itemService")
	private Replenish_itemManager replenish_itemService;
	
	public String getIpAndProjectName()throws Exception{
		String ip = null;
		String projectName = null;
		PageData pd = new PageData();
		pd = interfaceipService.findByNew(pd);
		ip = pd.getString("IP");
		System.out.println("ip:"+ip);
		projectName = pd.getString("PROJECTNAME");
		return ip+"/"+projectName;
	}
	
	@RequestMapping(value="/toOrder")
	public ModelAndView add_sotemplate(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		System.out.println(page.getPd());
		List<PageData>	varList = sotemplateService.listSotemplate(page);//模板
		Calendar cal = Calendar.getInstance(); 
		int month =cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		String monthstr = null;
		String datestr = null;
		if (month<10) {
			monthstr = "0"+ month;
		}else{
			monthstr =  ""+month;
		}
		if (date<10) {
			datestr = "0" + date;
		}else{
			datestr = "" + date;
		}
		String FDATE = cal.get(Calendar.YEAR)+"-"+monthstr+"-"+datestr;
		if (!"".equals(pd.getString("date")) && pd.getString("date") != null) {
			pd.put("date", pd.getString("date").replace("/", "-"));
			pd.put("date1", pd.getString("date1").replace("/", "-"));
			page.setPd(pd);
			List<PageData> hisToryList = salesorderbillService.list_HisDate(page);
			mv.addObject("isHistory", "is");
			mv.addObject("hisToryList", hisToryList);
			System.out.println(hisToryList.size());
		}
		pd.put("FDATE", FDATE);
		page.setPd(pd);
		List<PageData> list = salesorderbillService.list_withFtype(page);
		mv.addObject("varList", varList);
		mv.addObject("list", list);
		mv.addObject("pd", pd);
		mv.addObject("httpUrl", WeixinInfo.httpUrl);
		mv.setViewName("wxqy/template_Order/toOrder");
		return mv;
	}
	
	//跳转修改页面
	@RequestMapping(value="/toEditOrder")
	public ModelAndView toEditOrder(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
		page.setPd(pd);
		PageData pageData = salesorderbillService.list_withSALESORDERBILL_ID(pd);
		List<PageData> varList = salesorderbillentryService.list_oneOrder(page);
		List<PageData> repList = replenish_itemService.findBySALESORDERBILL_ID(pd);
		//System.out.println(varList);
		System.out.println("pd:"+pd);
		mv.addObject("pd", pd);
		mv.addObject("pageData", pageData);
		mv.addObject("varList", varList);
		mv.addObject("repList", repList);
		mv.setViewName("wxqy/template_Order/toEditOrder");
		return mv;
	}
	
	@RequestMapping(value="/editOrderInfo")
	@ResponseBody
	public Map<String, Object> editOrderInfo(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 System.out.println(pd);
		 if(pd.getString("jsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("jsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
						pd1.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
						pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						pd1.put("FENTRYID",job.getString("FENTRYID"));
						salesorderbillentryService.toEditOrder(pd1);
				}
			}
		 if(pd.getString("newjsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("newjsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					 	pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
				}
			}
		 json.put("data", "");
		 return json ;
	}
	
	@RequestMapping(value="/editOrderInfoAndSumbit")
	@ResponseBody
	public Map<String, Object> editOrderInfoAndSumbit(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 System.out.println(pd);
		 pd.put("FSTATUS", 1);
		 salesorderbillService.editOrderAndSum(pd);
		 if(pd.getString("jsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("jsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
						pd1.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
						pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						pd1.put("FENTRYID",job.getString("FENTRYID"));
						salesorderbillentryService.toEditOrder(pd1);
				}
			}
		 if(pd.getString("newjsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("newjsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
						pd1.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
						pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
				}
			}
		 json.put("data", "");
		 return json ;
	}
	
	@RequestMapping(value="/createOrder")
	public ModelAndView createOrder(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		if(pd.getString("createId")!=null&&!"".equals(pd.getString("createId"))){
			pd.put("SOTEMPLATE_ID", pd.getString("createId"));
			pd.put("FTEMPID", pd.getString("createId"));
		}
		page.setPd(pd);
		
		PageData pageData = sotemplateService.findById(pd);
		System.out.println(pageData);
		if(pd.getString("SALESORDERBILL_ID") == null || "".equals(pd.getString("SALESORDERBILL_ID"))){
			pd.put("SALESORDERBILL_ID", this.get32UUID());
		}
		System.out.println("------------------"+page.getPd());
		List<PageData> varList =  sotemplateentryService.list_one(page);
		List<PageData> repList = replenish_itemService.findBySALESORDERBILL_ID(pd);
		System.out.println(repList.size());
		mv.addObject("varList", varList);
		mv.addObject("pageData", pageData);
		mv.addObject("pd", pd);
		System.out.println(varList.size());
		mv.addObject("repList", repList);
		mv.setViewName("wxqy/template_Order/createOrder");
		return mv;
	}
	
	@RequestMapping(value="/save")
	@ResponseBody
	public Map<String, Object> save(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 String SALESORDERBILL_ID = this.get32UUID();
		 pd.put("SALESORDERBILL_ID",SALESORDERBILL_ID);
		 pd.put("FSTATUS",0);
		 pd.put("FSYNSTATUS",0);
		 pd.put("FDATE", new Date());
		 String jsr = this.getBillNO();
		 JSONObject jsonstr = JSONObject.fromObject(jsr);
//		 JSONArray jsonarr = jsr.getJSONArray("Data");
		 System.out.println(jsonstr.getString(""));
		 pd.put("FBILLNO", jsonstr.getString(""));
		 System.out.println(pd);
		 salesorderbillService.save(pd);
		 int count = 1;
		 if(pd.getString("jsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("jsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					 if (Integer.parseInt(job.getString("FAUXQTY"))>= 1) {
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("SALESORDERBILL_ID", SALESORDERBILL_ID);
						pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("FENTRYID", count);
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
						count++;
					}
				}
			}
		 if(pd.getString("newjsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("newjsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					 	pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("SALESORDERBILL_ID", SALESORDERBILL_ID);
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("FENTRYID", count);
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
						count++;
				}
			}
		 json.put("data", "");
		 return json ;
	}
	
	@RequestMapping(value="/SomeSumbit")
	@ResponseBody
	public Map<String, Object> SomeSumbit(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 pd.put("FSTATUS", 1);
		 System.out.println(pd);
		 String strArr[] = pd.getString("strArr").split(",");
		 salesorderbillService.editSomeOrder(strArr);
		 return json ;
	}
	
	@RequestMapping(value="/sumbit")
	@ResponseBody
	public Map<String, Object> sumbit(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 String SALESORDERBILL_ID = this.get32UUID();
		 pd.put("SALESORDERBILL_ID",SALESORDERBILL_ID);
		 pd.put("FSTATUS",1);
		 pd.put("FSYNSTATUS",0);
		 pd.put("FDATE", new Date());
		 String jsr = this.getBillNO();
		 JSONObject jsonstr = JSONObject.fromObject(jsr);
//		 JSONArray jsonarr = jsr.getJSONArray("Data");
		 System.out.println(jsonstr.getString(""));
		 pd.put("FBILLNO", jsonstr.getString(""));
		 System.out.println(pd);
		 salesorderbillService.save(pd);
		 int count = 1;
		 if(pd.getString("jsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("jsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					 if (Integer.parseInt(job.getString("FAUXQTY"))>= 1) {
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("SALESORDERBILL_ID", SALESORDERBILL_ID);
						pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("FENTRYID", count);
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
						count++;
					}
				}
			}
		 if(pd.getString("newjsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("newjsonstr"));
				PageData pd1 = new PageData();
				for (int i = 0; i < jsStr.size(); i++) {
					 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					 	pd1.put("FITEMID", job.getString("FITEMID"));
						pd1.put("SALESORDERBILL_ID", SALESORDERBILL_ID);
						pd1.put("SALESORDERBILLENTRY_ID", this.get32UUID());
						pd1.put("FENTRYID", count);
						pd1.put("FAUXQTY", Integer.parseInt(job.getString("FAUXQTY")));
						salesorderbillentryService.save(pd1);
						count++;
				}
			}
		 json.put("data", "");
		 return json ;
	}
	
	//添加物料
	@RequestMapping(value="/replenish_item")
	public ModelAndView replenish_item(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		if(null != pd.getString("keywords") && !"".equals(pd.getString("keywords"))){
			String keywords = URLDecoder.decode(pd.getString("keywords"), "UTF-8");				//关键词检索条件
			pd.put("keywords", keywords.trim());
			page.setPd(pd);
			page.setShowCount(150);
			List<PageData> pageDatas = itembaseService.listPageAll(page);
			System.out.println(pageDatas);
			mv.addObject("pageDatas", pageDatas);
			
		}
		mv.addObject("pd", pd);
		System.out.println(pd);
		mv.setViewName("wxqy/template_Order/replenish_item");
		return mv;
	}
	
	//保存临时补充物料
	@RequestMapping(value="/save_replenish_item")
	@ResponseBody
	public Map<String, Object> save_replenish_item(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 pd = this.getPageData();
		 PageData pd1 = new PageData();
		 if(pd.getString("jsonstr").length()>2){
				JSONArray jsStr = JSONArray.fromObject(pd.getString("jsonstr"));
				for (int i = 0; i < jsStr.size(); i++) {
					JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
					pd1.put("REPLENISH_ITEM_ID", this.get32UUID());
					pd1.put("SALESORDERBILL_ID", pd.getString("SALESORDERBILL_ID"));
					pd1.put("FITEMID", job.getString("FITEMID"));
					pd1.put("FAUXQTY", 1);
					replenish_itemService.save(pd1);
				}
			}
		 json.put("data", "");
		 return json ;
	}
	
	public String getBillNO() throws Exception{
		String requestUrl = getIpAndProjectName()+"/erp_Get/getBillNO";
		String jsonstr = null;
		try {
            URL httpclient =new URL(requestUrl);
            HttpURLConnection conn =(HttpURLConnection) httpclient.openConnection();
            conn.setConnectTimeout(50000);
            conn.setReadTimeout(20000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");    
            conn.setDoOutput(true);        
            conn.setDoInput(true);
            conn.connect();
            InputStream is =conn.getInputStream();
            //int size =is.available();
            ByteArrayOutputStream buff = new ByteArrayOutputStream();
            int c;
            while((c = is.read()) >= 0){
                buff.write(c);
            }
            byte[] data = buff.toByteArray();
            buff.close();
            String htmlText = new String(data, "UTF-8");
            JSONObject jsStr = JSONObject.fromObject(htmlText);
            jsonstr = jsStr.getString("Data"); // erp数据
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
		return jsonstr;
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/delete")
	public void delete(PrintWriter out) throws Exception{
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd);
		salesorderbillentryService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteByREPLENISH_ITEM_ID")
	public void deleteByREPLENISH_ITEM_ID(PrintWriter out) throws Exception{
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd);
		replenish_itemService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteAllDate")
	public void deleteAllDate(PrintWriter out) throws Exception{
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd);
		replenish_itemService.deleteAllDate(pd);
		out.write("success");
		out.close();
	}
	
}