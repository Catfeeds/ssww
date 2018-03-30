package com.fh.controller.management.icpoorder;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.util.AppUtil;
import com.fh.util.ObjectExcelView;
import com.fh.util.PageData;
import com.fh.util.Jurisdiction;
import com.fh.util.Tools;
import com.fh.service.management.icpoorder.ICPOOrderManager;
import com.fh.service.management.icpoorder.impl.ICPOOrderService;
import com.fh.service.management.icpoorderentry.impl.ICPOOrderEntryService;
import com.fh.service.management.supplier.impl.SupplierService;
import com.fh.service.management.synchronization.impl.SynSupplierService;

/** 
 * 说明：采购订单
 * 创建人：成
 * 创建时间：2017-12-11
 */
@Controller
@RequestMapping(value="/icpoorder")
public class ICPOOrderController extends BaseController {
	
	String menuUrl = "icpoorder/list.do"; //菜单地址(权限用)
	@Resource(name="icpoorderService")
	private ICPOOrderManager icpoorderService;
	@Resource(name="icpoorderentryService")
	private ICPOOrderEntryService icpoorderentryService;
	@Resource(name="synSupplierService")
	private SynSupplierService synSupplierService;
	@Resource(name="supplierService")
	private SupplierService supplierService;
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/save")
	public ModelAndView save() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"新增ICPOOrder");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "add")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("ICPOORDER_ID", this.get32UUID());	//主键
		icpoorderService.save(pd);
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
		logBefore(logger, Jurisdiction.getUsername()+"删除ICPOOrder");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return;} //校验权限
		PageData pd = new PageData();
		pd = this.getPageData();
		icpoorderService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**修改
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"修改ICPOOrder");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		icpoorderService.edit(pd);
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
		logBefore(logger, Jurisdiction.getUsername()+"列表ICPOOrder");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setShowCount(8);
		page.setPd(pd);
		List<PageData>	varList = icpoorderService.list(page);	//列出ICPOOrder列表
		mv.setViewName("management/icpoorder/icpoorder_list");
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
		mv.setViewName("management/icpoorder/icpoorder_edit");
		mv.addObject("msg", "save");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**去修改页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/goEdit")
	public ModelAndView goEdit()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd = icpoorderService.findById(pd);	//根据ID读取
		mv.setViewName("management/icpoorder/icpoorder_edit");
		mv.addObject("msg", "edit");
		mv.addObject("pd", pd);
		return mv;
	}	
	
	 /**批量删除
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/deleteAll")
	@ResponseBody
	public Object deleteAll() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"批量删除ICPOOrder");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return null;} //校验权限
		PageData pd = new PageData();		
		Map<String,Object> map = new HashMap<String,Object>();
		pd = this.getPageData();
		List<PageData> pdList = new ArrayList<PageData>();
		String DATA_IDS = pd.getString("DATA_IDS");
		if(null != DATA_IDS && !"".equals(DATA_IDS)){
			String ArrayDATA_IDS[] = DATA_IDS.split(",");
			icpoorderService.deleteAll(ArrayDATA_IDS);
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
		logBefore(logger, Jurisdiction.getUsername()+"导出ICPOOrder到excel");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;}
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> dataMap = new HashMap<String,Object>();
		List<String> titles = new ArrayList<String>();
		titles.add("单据ID");	//1
		titles.add("单据编号");	//2
		titles.add("单据日期");	//3
		titles.add("供应商ID");	//4
		titles.add("联系人");	//5
		titles.add("联系人电话");	//6
		titles.add("要求发货日期");	//7
		titles.add("状态");	//8
		titles.add("同步状态");	//9
		titles.add("送货地址");	//10
		titles.add("备注");	//11
		titles.add("制单人");	//12
		titles.add("审核人");	//13
		titles.add("审核日期");	//14
		dataMap.put("titles", titles);
		List<PageData> varOList = icpoorderService.listAll(pd);
		List<PageData> varList = new ArrayList<PageData>();
		for(int i=0;i<varOList.size();i++){
			PageData vpd = new PageData();
			vpd.put("var1", varOList.get(i).get("FINTERID").toString());	//1
			vpd.put("var2", varOList.get(i).getString("FBILLNO"));	    //2
			vpd.put("var3", varOList.get(i).getString("FDATE"));	    //3
			vpd.put("var4", varOList.get(i).get("FVENDORID").toString());	//4
			vpd.put("var5", varOList.get(i).getString("FCONTACT"));	    //5
			vpd.put("var6", varOList.get(i).getString("FTELEPHONE"));	    //6
			vpd.put("var7", varOList.get(i).getString("FSHIPPINGDATE"));	    //7
			vpd.put("var8", varOList.get(i).get("FSTATUS").toString());	//8
			vpd.put("var9", varOList.get(i).get("FSYNCSTATUS").toString());	//9
			vpd.put("var10", varOList.get(i).getString("FADDRESS"));	    //10
			vpd.put("var11", varOList.get(i).getString("FNOTE"));	    //11
			vpd.put("var12", varOList.get(i).get("FBILLERID").toString());	//12
			vpd.put("var13", varOList.get(i).getString("FCHECKERID"));	    //13
			vpd.put("var14", varOList.get(i).getString("FCHECKDATE"));	    //14
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
	
	
	
	
	
	@RequestMapping(value="/poorder_synchronization")
	@ResponseBody
	public  Map<String, Object> poorder_synchronization() throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		Page page = new Page();
		page.setPd(pd);
		//新增开关
		int hint = 0; //0为开启，1为关闭
		//删除开关
		int dint = 0; //开0,关1
		//int dstr = 0;
		int count = 0;
		int dcount = 0;
		List<PageData>	synList  =synSupplierService.poorder_synchronization(page);	//需要同步的数据
		System.out.println(synList);
		List<PageData> varOList  = icpoorderService.listAll(pd);  //本地数据
		for (int i = 0; i < synList.size(); i++) {
			hint = 1;
			//hint = 1;
			for (int j = 0; j < varOList.size(); j++) {
				if(varOList.get(j).get("FINTERID").equals(synList.get(i).get("FInterID"))){
					hint = 0;
				}
			}
			if(hint == 1) {
				 PageData pd1 = new PageData();
				 pd1 = this.getPageData();
				 pd1.put("ICPOORDER_ID", this.get32UUID());		//主键
				 pd1.put("FINTERID", synList.get(i).get("FInterID"));		//单据ID
				 pd1.put("FBILLNO", synList.get(i).get("FBillNo"));		//单据编号
				 pd1.put("FDATE", synList.get(i).get("FDate"));		//单据日期
				 pd1.put("FVENDORID", synList.get(i).get("FSupplyID"));		//供应商ID
				 pd1.put("FCONTACT", synList.get(i).get("FContact")); 		//联系人
				 pd1.put("FTELEPHONE", synList.get(i).get("FTelephone"));		//联系人电话
				 pd1.put("FSTATUS",synList.get(i).get("FStatus"));		//状态
				 pd1.put("FSYNCSTATUS",1);							//1为"从erp同步到本地数据库" 0为"从本地数据库同步到erp"
				 pd1.put("FBILLERID",synList.get(i).get("FBillerID"));			//制单人
				 pd1.put("FCHECKERID",synList.get(i).get("FCheckerID"));		//审核人
				 pd1.put("FCHECKDATE",synList.get(i).get("FCheckDate"));		//审核日期
				 icpoorderService.save(pd1);
				 count ++ ;
			}
		}
		/*for (int j = 0; j < varOList.size(); j++) {
			for (int i = 0; i < synList.size(); i++) {
				if(synList.get(i).get("FInterID").equals(varOList.get(j).get("FINTERID"))){
					dint = 1; //存在
				}
					//dstr = (int) synList.get(i).get("FItemID");
			}
			if(dint == 0){
				PageData pd2 = new PageData();
				pd2.put("FINTERID",(int)varOList.get(j).get("FINTERID"));
				System.out.println("delete:"+pd2);
				icpoorderService.deleteByFINTERID(pd2);
				dcount ++ ;
			}
			dint = 0;
		}*/
		poorderEntry_synchronization();
		System.out.println("poorder新增数据"+count);
		System.out.println("poorder删除数据"+dcount);
		json.put("result", "123");
		return json;
	}
	
	//@RequestMapping(value="/poorderEntry_synchronization")
	//@ResponseBody
	public  void poorderEntry_synchronization() throws Exception{
		//Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		Page page = new Page();
		page.setPd(pd);
		//新增开关
		int hint = 0; //0为开启，1为关闭
		//删除开关
		int dint = 0; //开0,关1
		int count = 0;
		int dcount = 0;
		List<PageData>	synList  =synSupplierService.poorderEntry_synchronization(page);	//需要同步的数据
		System.out.println(synList);
		List<PageData> varOList  = icpoorderentryService.listAll(pd);  //本地数据
		for (int i = 0; i < synList.size(); i++) {
			hint = 1;
			//hint = 1;
			for (int j = 0; j < varOList.size(); j++) {
				if(varOList.get(j).get("FINTERID").equals(synList.get(i).get("FInterId"))&&
						varOList.get(j).get("FENTRYID").equals(synList.get(i).get("FEntryID"))){
					hint = 0;
				}
			}
			if(hint == 1) {
				 PageData pd1 = new PageData();
				 pd1 = this.getPageData();
				 pd1.put("ICPOORDERENTRY_ID", this.get32UUID());		//主键
				 pd1.put("FINTERID", synList.get(i).get("FInterId"));		//单据ID
				 pd1.put("FENTRYID", synList.get(i).get("FEntryID"));		//序号
				 pd1.put("FITEMID", synList.get(i).get("FItemID"));		//物料ID
				 pd1.put("FSHIPPINGDATE", synList.get(i).get("FDate"));		//要求发货日期
				 /**
				  * ---0：待接收
				 	---1：已接收
				 	---2：已发货
				 	---3：已验收
				  */
				 pd1.put("FSTATUS", 0); 		//物流状态
				 pd1.put("FUNIT", synList.get(i).get("FName"));		//单位
				 pd1.put("FORDERQTY",synList.get(i).get("FAuxqty"));		//订单数量
				 pd1.put("FNOTE",synList.get(i).get("FNote"));										//备注
				 icpoorderentryService.save(pd1);
				 count ++ ;
			}
		}
		
		System.out.println("poorderEntry新增数据"+count);
		System.out.println("poorderEntry删除数据"+dcount);
	}
}
