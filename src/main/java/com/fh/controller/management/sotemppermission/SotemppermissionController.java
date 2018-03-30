package com.fh.controller.management.sotemppermission;

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
import com.fh.service.management.sotemplate.SOTemplateManager;
import com.fh.service.management.sotemppermission.SotemppermissionManager;
import com.fh.service.wxqy.qywxuser.QyWxUserManager;
import com.fh.service.wxqy.weixindepartment.WeixinDepartmentManager;

/** 
 * 说明：模板权限管理
 * 创建人：成
 * 创建时间：2018-03-07
 */
@Controller
@RequestMapping(value="/sotemppermission")
public class SotemppermissionController extends BaseController {
	
	//String menuUrl = "sotemppermission/list.do"; //菜单地址(权限用)
	String menuUrl = "sotemppermission/goUserTree.do"; //菜单地址(权限用)
	@Resource(name="sotemppermissionService")
	private SotemppermissionManager sotemppermissionService;
	@Resource(name="qywxuserService")
	private QyWxUserManager qywxuserService;
	@Resource(name="weixindepartmentService")
	private WeixinDepartmentManager weixindepartmentService;
	@Resource(name="sotemplateService")
	private SOTemplateManager sotemplateService;
	
	//allocation
	@RequestMapping(value="/goAllocation")
	public ModelAndView goAllocation()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd);
		pd = qywxuserService.findById(pd);	//根据ID读取
		List<PageData>	closedSotempList = sotemppermissionService.findByQywxuser_id(pd);
		System.out.println(closedSotempList.toString());
		List<PageData>	allSotempList = sotemplateService.listAll(pd);
		mv.addObject("allSotempList", allSotempList);
		mv.addObject("pd", pd);
		mv.addObject("closedSotempList", closedSotempList.toString());
		mv.setViewName("management/sotemppermission/goAllocation");
		return mv;
	}	
	
	//allocation
		@RequestMapping(value="/goUserTree")
		public ModelAndView goUserTree()throws Exception{
			ModelAndView mv = this.getModelAndView();
			PageData pd = new PageData();
			pd = this.getPageData();
			mv.setViewName("management/sotemppermission/qywxuser_tree");
			return mv;
		}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value="/userList")
	public ModelAndView userList(Page page) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表QyWxUser");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		//keywords  = "3";
		//System.out.println("keywords值："+keywords);
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = qywxuserService.list(page);	//列出QyWxUser列表
		mv.setViewName("management/sotemppermission/qywxuser_list");
		mv.addObject("varList", varList);
		//System.out.println(varList);
		mv.addObject("pd", pd);
		mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
		return mv;
	}
	
	/**保存
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/save")
	public ModelAndView save() throws Exception{
		System.out.println("开始保存---------------------------");
		//logBefore(logger, Jurisdiction.getUsername()+"新增Sotemppermission");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "add")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String sotemplate_ids[] = pd.getString("SOTEMPLATE_IDs").split(",");
		sotemppermissionService.deleteByQYWXUSER_ID(pd);
		for (int i = 0; i < sotemplate_ids.length; i++) {
			pd.put("SOTEMPPERMISSION_ID", this.get32UUID());	//主键
			pd.put("QYWXUSER_ID", pd.getString("QYWXUSER_ID"));
			pd.put("SOTEMPLATE_ID", sotemplate_ids[i]);
			//System.out.println("pd"+pd);
			sotemppermissionService.save(pd);
		}
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
		logBefore(logger, Jurisdiction.getUsername()+"删除Sotemppermission");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return;} //校验权限
		PageData pd = new PageData();
		pd = this.getPageData();
		sotemppermissionService.delete(pd);
		out.write("success");
		out.close();
	}
	
	/**修改
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/edit")
	public ModelAndView edit() throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"修改Sotemppermission");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "edit")){return null;} //校验权限
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		sotemppermissionService.edit(pd);
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
		logBefore(logger, Jurisdiction.getUsername()+"列表Sotemppermission");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = sotemppermissionService.list(page);	//列出Sotemppermission列表
		mv.setViewName("management/sotemppermission/sotemppermission_list");
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
		mv.setViewName("management/sotemppermission/sotemppermission_edit");
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
		pd = sotemppermissionService.findById(pd);	//根据ID读取
		mv.setViewName("management/sotemppermission/sotemppermission_edit");
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
		logBefore(logger, Jurisdiction.getUsername()+"批量删除Sotemppermission");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "del")){return null;} //校验权限
		PageData pd = new PageData();		
		Map<String,Object> map = new HashMap<String,Object>();
		pd = this.getPageData();
		List<PageData> pdList = new ArrayList<PageData>();
		String DATA_IDS = pd.getString("DATA_IDS");
		if(null != DATA_IDS && !"".equals(DATA_IDS)){
			String ArrayDATA_IDS[] = DATA_IDS.split(",");
			sotemppermissionService.deleteAll(ArrayDATA_IDS);
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
		logBefore(logger, Jurisdiction.getUsername()+"导出Sotemppermission到excel");
		if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;}
		ModelAndView mv = new ModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> dataMap = new HashMap<String,Object>();
		List<String> titles = new ArrayList<String>();
		titles.add("企业微信用户_ID");	//1
		titles.add("模板_ID");	//2
		titles.add("备注");	//3
		dataMap.put("titles", titles);
		List<PageData> varOList = sotemppermissionService.listAll(pd);
		List<PageData> varList = new ArrayList<PageData>();
		for(int i=0;i<varOList.size();i++){
			PageData vpd = new PageData();
			vpd.put("var1", varOList.get(i).getString("QYWXUSER_ID"));	    //1
			vpd.put("var2", varOList.get(i).getString("SOTEMPLATE_ID"));	    //2
			vpd.put("var3", varOList.get(i).getString("REMARK"));	    //3
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
