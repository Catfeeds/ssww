package com.fh.controller.management.sotemplate;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.shiro.session.Session;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sun.tools.tree.ThisExpression;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.util.AppUtil;
import com.fh.util.ObjectExcelView;
import com.fh.util.PageData;
import com.fh.util.Jurisdiction;
import com.fh.util.Tools;
import com.fh.service.commodity.commodity.CommodityManager;
import com.fh.service.management.classify_item.Classify_itemManager;
import com.fh.service.management.client.ClientManager;
import com.fh.service.management.erp_dep.ERP_DepManager;
import com.fh.service.management.itembase.ItemBaseManager;
import com.fh.service.management.sotemplate.SOTemplateManager;
import com.fh.service.management.sotemplateentry.SOTemplateEntryManager;
import com.fh.service.management.temporary.TemporaryManager;

/** 
 * 说明：订单模板
 * 创建人：成
 * 创建时间：2018-01-05
 */
@Controller
@RequestMapping(value="/sotemplate")
public class SOTemplateController extends BaseController {
	
	String menuUrl = "sotemplate/list.do"; //菜单地址(权限用)
	@Resource(name="sotemplateService")
	private SOTemplateManager sotemplateService;
	
	@Resource(name="sotemplateentryService")
	private SOTemplateEntryManager sotemplateentryService;
	
	@Resource(name="commodityService")
	private CommodityManager commodityService;
	
	@Resource(name="temporaryService")
	private TemporaryManager temporaryService;
	
	@Resource(name="itembaseService")
	private ItemBaseManager itembaseService;
	
	@Resource(name="erp_depService")
	private ERP_DepManager erp_depService;
	
	@Resource(name = "classify_itemService")
	private Classify_itemManager classify_itemService;
	
	@Resource(name="clientService")
	private ClientManager clientService;
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/save")
	public ModelAndView save() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"新增SOTemplate");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "add")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		JSONArray jsStr = JSONArray.fromObject(pd.getString("FITEMIDs"));
		PageData pd1 = new PageData();
		int count = 1;
		String SOTEMPLATE_ID = pd.getString("SOTEMPLATE_ID");
		System.out.println(pd.get("CLIENT_ID"));
		PageData pd_client = clientService.findByCLIENT_ID(pd);
		pd.put("CLIENTNAME", pd_client.getString("FNAME"));
		for (int i = 0; i < jsStr.size(); i++) {
			 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
			 job.getString("FITEMID");
			 pd1.put("SOTEMPLATEENTRY_ID", this.get32UUID());
			pd1.put("FENTRYID", count);
			pd1.put("FTEMPID", SOTEMPLATE_ID);
			pd1.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
			pd1.put("FITEMID", job.getString("FITEMID"));
			pd1.put("FAUXQTY", Double.parseDouble(job.getString("FAUXQTY")));
			sotemplateentryService.save(pd1);
			count++;
		}
		//JSONArray jsCopy = JSONArray.fromObject(pd.getString("SOTEMPLATEENTRY_IDs"));
		pd.put("SOTEMPLATE_ID", SOTEMPLATE_ID);	//主键
		sotemplateService.save(pd);
		temporaryService.delete_all(pd);//清楚临时表数据
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/copy")
	public ModelAndView copy() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"复制SOTemplate");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "add")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		int count = 1;
		String SOTEMPLATE_ID = this.get32UUID();
		PageData pd1 = new PageData();
		PageData pd_client = clientService.findByCLIENT_ID(pd);
		pd.put("CLIENTNAME", pd_client.getString("FNAME"));
		try {
			JSONArray jsStr = JSONArray.fromObject(pd.getString("FITEMIDs"));
			for (int i = 0; i < jsStr.size(); i++) {
				JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				job.getString("FITEMID");
				pd1.put("SOTEMPLATEENTRY_ID", this.get32UUID());
				pd1.put("FENTRYID", count);
				pd1.put("FTEMPID", SOTEMPLATE_ID);
				pd1.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
				pd1.put("FITEMID", job.getString("FITEMID"));
				pd1.put("FAUXQTY", Double.parseDouble(job.getString("FAUXQTY")));
				sotemplateentryService.save(pd1);
				count++;
			}
		} catch (Exception e) {
			System.out.println("没有新增订单物料");
		}
		try {
			JSONArray jsCopy = JSONArray.fromObject(pd.getString("SOTEMPLATEENTRY_IDs"));
			for (int j = 0; j < jsCopy.size(); j++) {
				JSONObject job = jsCopy.getJSONObject(j);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				pd1.put("SOTEMPLATEENTRY_ID", job.getString("id"));
				pd1 = sotemplateentryService.findById(pd1);
				pd1.put("FENTRYID", count);
				pd1.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
				pd1.put("FTEMPID", SOTEMPLATE_ID);
				pd1.put("SOTEMPLATEENTRY_ID", this.get32UUID());
				sotemplateentryService.save(pd1);
				count++;
			}
		} catch (Exception e) {
			System.out.println("没有复制订单物料");
		}
		pd.put("SOTEMPLATE_ID", SOTEMPLATE_ID);	//主键
		sotemplateService.save(pd);
		temporaryService.delete_all(pd);//清楚临时表数据
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**删除
	 * @param out
	 * @throws Exception
	 */
	@RequestMapping(value="/delete")
	public void delete(PrintWriter out) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"删除SOTemplate");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return;} //校验权限
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("FTEMPID", pd.getString("SOTEMPLATE_ID"));
		sotemplateentryService.deleteByFTempID(pd);
		sotemplateService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**修改
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"修改SOTemplate");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd);
		int count = Integer.parseInt(pd.getString("count"))+1;
		PageData pd_client = clientService.findByCLIENT_ID(pd);
		System.out.println(pd_client);
		pd.put("CLIENTNAME", pd_client.getString("FNAME"));
		String SOTEMPLATE_ID = pd.getString("SOTEMPLATE_ID");
		if(pd.getString("FITEMIDs").length()>2){
			JSONArray jsStr = JSONArray.fromObject(pd.getString("FITEMIDs"));
			PageData pd1 = new PageData();
			for (int i = 0; i < jsStr.size(); i++) {
				 JSONObject job = jsStr.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				 pd1.put("SOTEMPLATEENTRY_ID", this.get32UUID());
				pd1.put("FENTRYID", count);
				pd1.put("FTEMPID", SOTEMPLATE_ID);
				pd1.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
				pd1.put("FITEMID", job.getString("FITEMID"));
				pd1.put("FAUXQTY", Double.parseDouble(job.getString("FAUXQTY")));
				sotemplateentryService.save(pd1);
				count++;
			}
		}
		if(pd.getString("FITEMIDs_edit") != null && !"".equals(pd.getString("FITEMIDs_edit"))){
			//System.out.println("------------"+pd.getString("FITEMIDs_edit"));
			JSONArray jsStr_edit = JSONArray.fromObject(pd.getString("FITEMIDs_edit"));
			PageData pd2 = new PageData();
			for (int i = 0; i < jsStr_edit.size(); i++) {
				JSONObject job1 = jsStr_edit.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				pd2.put("FTEMPID", SOTEMPLATE_ID);
				pd2.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
				pd2.put("FITEMID", job1.getString("FITEMID"));
				pd2.put("FAUXQTY", Double.parseDouble(job1.get("FAUXQTY").toString()));
				sotemplateentryService.edit_qty(pd2);
			}
		}
		sotemplateService.edit(pd);
		temporaryService.delete_all(pd);//清楚临时表数据
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	@RequestMapping(value="/delete_allTemporary")
	@ResponseBody
	public Map<String, Object> delete_allTemporary(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		 PageData pd = new PageData();
		 temporaryService.delete_all(pd);//清楚临时表数据
		 json.put("data", "");
		 return json ;
	
	}
	
	@RequestMapping(value="/add_sotemplate")
	public ModelAndView add_sotemplate(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String SOTEMPLATE_ID = pd.getString("SOTEMPLATE_ID");
		if (SOTEMPLATE_ID == null||"".equals(SOTEMPLATE_ID)) {
			SOTEMPLATE_ID = this.get32UUID();
		}
		//List<PageData> pageDatas = commodityService.listAll(pd);
		mv.setViewName("management/sotemplate/add_sotemplate");
		List<PageData> varOList = erp_depService.listAll(pd);
		List<PageData> clientList = clientService.listAllNotParent(pd);
		pd.put("USERNAME", Jurisdiction.getUsername());
		mv.addObject("msg","save");
		mv.addObject("pd", pd);
		//mv.addObject("pageDatas", pageDatas);
		mv.addObject("SOTEMPLATE_ID", SOTEMPLATE_ID);
		mv.addObject("varOList", varOList);
		mv.addObject("clientList", clientList);
		return mv;
	}
	
	
	//list_temporary
	@RequestMapping(value="/list_temporary")
	@ResponseBody
	public Map<String, Object> list_temporary(Page page)throws Exception{
		 Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String SOTEMPLATE_ID = pd.getString("SOTEMPLATE_ID");
		List<PageData> yemporary = temporaryService.findByFTEMPID(pd);
		//System.out.println(pd);
		 json.put("data", yemporary);
		 return json ;
	}
	
	// 树
	@RequestMapping(value = "/listTree")
	public ModelAndView listTree(Page page) throws Exception {
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		// mv.addObject("zNodes", jsStr);
		mv.addObject("pd", pd);
		mv.setViewName("management/sotemplate/add_item_tree");
		return mv;
	}
	
	@RequestMapping(value = "/dateTree")
	@ResponseBody
	public JSONArray dateTree(Page page) {
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords"); // 关键词检索条件
		if (null != keywords && !"".equals(keywords)) {
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		JSONArray arr = null;
		try {
			arr = JSONArray.fromObject(classify_itemService.listAll(pd));
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONArray jsStr = JSONArray.fromObject(this.makeTree(arr));
		return jsStr;
	}
	
	@SuppressWarnings("unchecked")
	public String makeTree(JSONArray arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Iterator<Object> it = arr.iterator();
		while (it.hasNext()) {
			JSONObject ob = (JSONObject) it.next();
			sb.append("{id:").append(ob.getString("FITEMID")).append(",pId:")
					.append(ob.getString("FPARENTID")).append(",name:\"")
					.append(ob.getString("FNAME")).append("\"")
					.append(",open:").append("false").append("},");
		}
		return sb.substring(0, sb.length() - 1) + "]";
	}
	
	@RequestMapping(value="/add")
	public ModelAndView add(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		String treeName = pd.getString("treeName");				//关键词检索条件
		System.out.println("------"+treeName);
		if(null != treeName && !"".equals(treeName)){
			pd.put("treeName", treeName.trim());
		}
		String treeKey = pd.getString("treeKey");				//关键词检索条件
		if(null != treeKey && !"".equals(treeKey)){
			pd.put("treeKey", treeKey.trim());
		}
		page.setPd(pd);
		page.setShowCount(15);
		List<PageData> pageDatas = itembaseService.listPageAll(page);
		mv.setViewName("management/sotemplate/add");
		mv.addObject("pageDatas", pageDatas);
		mv.addObject("pd", pd);
		System.out.println(pd);
		return mv;
	}
	
	//获取临时数据temporary
	@RequestMapping(value="/temporary_data")
	public ModelAndView temporary_data(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		PageData pd1 = new PageData();
		int count = 1;
		String SOTEMPLATE_ID = null;
		if (pd.getString("SOTEMPLATE_ID") == null||"".equals(pd.getString("SOTEMPLATE_ID"))) {
			SOTEMPLATE_ID = this.get32UUID();
		}else {
			SOTEMPLATE_ID = pd.getString("SOTEMPLATE_ID");
		}
		
		String[] FITEMIDs = pd.getString("FITEMIDs").split(",");
		for (int i = 0; i < FITEMIDs.length; i++) {
			pd1.put("TEMPORARY_ID", this.get32UUID());
			pd1.put("FENTRYID", count);
			pd1.put("FTEMPID", SOTEMPLATE_ID);
			pd1.put("SOTEMPLATE_ID", SOTEMPLATE_ID);
			pd1.put("FITEMID", FITEMIDs[i]);
			pd1.put("FSTATUS", "临时");
			temporaryService.save(pd1);
			count++;
		}
		mv.addObject("msg","success");
		mv.setViewName("save_result");
		return mv;
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(Page page) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表SOTemplate");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = sotemplateService.list(page);	//列出SOTemplate列表
		//System.out.println("------->>"+varList);
		mv.setViewName("management/sotemplate/sotemplate_list");
		mv.addObject("varList", varList);
		mv.addObject("pd", pd);
		mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
		return mv;
	}
	
	/**去新增页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goAdd")
	public ModelAndView goAdd()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("management/sotemplate/sotemplate_edit");
		mv.addObject("msg", "save");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**去修改页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goEdit")
	public ModelAndView goEdit(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd = sotemplateService.findById(pd);	//根据ID读取
		pd.put("USERNAME", Jurisdiction.getUsername());
		pd.put("FTEMPID", pd.getString("SOTEMPLATE_ID"));
		page.setPd(pd);
		List<PageData>	pageDatas = sotemplateentryService.list_one(page);	//列出SOTemplateEntry列表
		//List<PageData> listAll = commodityService.listAll(pd);
		//System.out.println(pd);
		PageData pd3 = erp_depService.findByFDEPTID(pd);
		PageData pd_client = clientService.findByCLIENT_ID(pd);
		if(pd_client != null && pd_client.size() != 0){
			pd.put("CLIENTNAME", pd_client.getString("FNAME"));
		}
		pd.put("FDEPTNAME", pd3.getString("FNAME"));
		pd.put("FDEPTID", pd3.get("FITEMID"));
		//pd.put("SYSNAME", 11);
		List<PageData> varOList = erp_depService.listAll(pd);
		List<PageData> clientList = clientService.listAllNotParent(pd);
		mv.addObject("varOList", varOList);
		mv.addObject("pageDatas", pageDatas);
		mv.addObject("count", pageDatas.size());
		mv.addObject("pd", pd);
		//mv.addObject("listAll", listAll);
		mv.setViewName("management/sotemplate/edit_sotemplate");
		mv.addObject("msg", "edit");
		mv.addObject("clientList", clientList);
		//System.out.println(pd);
		return mv;
	}	
	
	 /**去复制订单
		 * @param
		 * @throws Exception
		 */
		@RequestMapping(value="/copy_sotemplate")
		public ModelAndView copy_sotemplate(Page page)throws Exception{
			ModelAndView mv = this.getModelAndView();
			PageData pd = new PageData();
			pd = this.getPageData();
			pd = sotemplateService.findById(pd);	//根据ID读取
			pd.put("USERNAME", Jurisdiction.getUsername());
			pd.put("FTEMPID", pd.getString("SOTEMPLATE_ID"));
			page.setPd(pd);
			List<PageData>	pageDatas = sotemplateentryService.list_one(page);	//列出SOTemplateEntry列表
			//List<PageData> listAll = commodityService.listAll(pd);
			//System.out.println(pd);
			PageData pd3 = erp_depService.findByFDEPTID(pd);
			PageData pd_client = clientService.findByCLIENT_ID(pd);
			if(pd_client != null && pd_client.size() != 0){
				pd.put("CLIENTNAME", pd_client.getString("FNAME"));
			}
			pd.put("FDEPTNAME", pd3.getString("FNAME"));
			pd.put("FDEPTID", pd3.get("FITEMID"));
			//pd.put("SYSNAME", 11);
			List<PageData> varOList = erp_depService.listAll(pd);
			List<PageData> clientList = clientService.listAllNotParent(pd);
			mv.addObject("varOList", varOList);
			mv.addObject("pageDatas", pageDatas);
			mv.addObject("count", pageDatas.size());
			pd.put("SOTEMPLATE_ID", this.get32UUID());
			mv.addObject("pd", pd);
			mv.setViewName("management/sotemplate/copy_sotemplate");
			mv.addObject("msg", "copy");
			mv.addObject("clientList", clientList);
			//System.out.println(pd);
			return mv;
		}	
	
	 /**批量删除
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteAll")
	@ResponseBody
	public Object deleteAll() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"批量删除SOTemplate");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return null;} //校验权限
		PageData pd = new PageData();		
		Map<String,Object> map = new HashMap<String,Object>();
		pd = this.getPageData();
		List<PageData> pdList = new ArrayList<PageData>();
		String DATA_IDS = pd.getString("DATA_IDS");
		if(null != DATA_IDS && !"".equals(DATA_IDS)){
			String ArrayDATA_IDS[] = DATA_IDS.split(",");
			sotemplateService.deleteAll(ArrayDATA_IDS);
			pd.put("msg", "ok");
		}else{
			pd.put("msg", "no");
		}
		pdList.add(pd);
		map.put("list", pdList);
		return AppUtil.returnObject(pd, map);
	}
	
	 /**导出到excel
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/excel")
	public ModelAndView exportExcel() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"导出SOTemplate到excel");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;}
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> dataMap = new HashMap<String,Object>();
		List<String> titles = new ArrayList<String>();
		titles.add("模板编号");	//1
		titles.add("部门ID");	//2
		titles.add("联络人");	//3
		titles.add("联系电话");	//4
		titles.add("制作人ID");	//5
		titles.add("制作日期");	//6
		titles.add("状态");	//7
		titles.add("审批日期");	//8
		titles.add("备注");	//9
		dataMap.put("titles", titles);
		List<PageData> varOList = sotemplateService.listAll(pd);
		List<PageData> varList = new ArrayList<PageData>();
		for(int i=0;i<varOList.size();i++){
			PageData vpd = new PageData();
			vpd.put("var1", varOList.get(i).getString("FBILLNO"));	    //1
			vpd.put("var2", varOList.get(i).get("FDEPTID").toString());	//2
			vpd.put("var3", varOList.get(i).getString("FCONTACT"));	    //3
			vpd.put("var4", varOList.get(i).getString("FTELEPHONE"));	    //4
			vpd.put("var5", varOList.get(i).getString("FBILLERID"));	    //5
			vpd.put("var6", varOList.get(i).getString("FDATE"));	    //6
			vpd.put("var7", varOList.get(i).getString("FSTATUS"));	    //7
			vpd.put("var8", varOList.get(i).getString("FCHECKDATE"));	    //8
			vpd.put("var9", varOList.get(i).getString("FREMARK"));	    //9
			varList.add(vpd);
		}
		dataMap.put("varList", varList);
		ObjectExcelView erv = new ObjectExcelView();
		mv = new ModelAndView(erv,dataMap);
		return mv;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
}
