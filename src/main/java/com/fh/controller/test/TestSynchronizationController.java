package com.fh.controller.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.commodity.commoditypic.CommodityPicManager;
import com.fh.service.item.impl.ItemService;
import com.fh.service.management.icpoorder.impl.ICPOOrderService;
import com.fh.service.management.icpoorderentry.impl.ICPOOrderEntryService;
import com.fh.service.management.supplier.SupplierManager;
import com.fh.service.management.supplier.impl.SupplierService;
import com.fh.service.management.synchronization.impl.SynSupplierService;
import com.fh.util.PageData;


@Controller
@RequestMapping(value="/test")
public class TestSynchronizationController extends BaseController{
	@Resource(name="synSupplierService")
	private SynSupplierService synSupplierService;
	@Resource(name="supplierService")
	private SupplierService supplierService;
	@Resource(name="icpoorderService")
	private ICPOOrderService icpoorderService;
	@Resource(name="icpoorderentryService")
	private ICPOOrderEntryService icpoorderentryService;
	
	@RequestMapping(value="/test_get")
	@ResponseBody
	public  Map<String, Object> test_get() throws Exception{
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
		List<PageData>	synList  =synSupplierService.supplier_synchronization(page);	//需要同步的数据
		List<PageData>	varOList =supplierService.listAll(pd);  //本地数据
		System.out.println("需要同步的数据"+synList.size());
		System.out.println("本地数据"+varOList.size());
		for (int i = 0; i < synList.size(); i++) {
			hint = 1;
			//hint = 1;
			for (int j = 0; j < varOList.size(); j++) {
				if(varOList.get(j).get("FITEMID").equals(synList.get(i).get("FItemID"))){
					hint = 0;
				}
				/*if(!synList.get(i).get("FItemID").equals(varOList.get(j).get("FITEMID"))){
					dint = 0; //不存在
					dstr = (int) synList.get(i).get("FItemID");
				}*/
			}
			if(hint == 1) {
				 PageData pd1 = new PageData();
				 pd1 = this.getPageData();
				 pd1.put("SUPPLIER_ID", this.get32UUID());	//主键
				 pd1.put("FITEMID", synList.get(i).get("FItemID"));
				 pd1.put("FNUMBER", synList.get(i).get("FNumber"));
				 pd1.put("FMODIFYTIME", synList.get(i).get("FModifyTime"));
				 pd1.put("FNAME", synList.get(i).get("FName"));
				 pd1.put("FADDRESS", synList.get(i).get("FAddress"));
				 pd1.put("FCONTACT", synList.get(i).get("FContact"));
				 pd1.put("FTELEPHONE",synList.get(i).get("FPhone"));
				 supplierService.save(pd1);
				 count ++ ;
				// System.out.println(pd);
			}
			
			
		}
		for (int j = 0; j < varOList.size(); j++) {
			for (int i = 0; i < synList.size(); i++) {
				if(synList.get(i).get("FItemID").equals(varOList.get(j).get("FITEMID"))){
					dint = 1; //存在
				}
					//dstr = (int) synList.get(i).get("FItemID");
			}
			if(dint == 0){
				System.out.println(varOList.get(j).get("FITEMID"));
				PageData pd2 = new PageData();
				pd2.put("FITEMID",(int)varOList.get(j).get("FITEMID"));
				System.out.println("delete:"+pd2);
				supplierService.deleteByFITEMID(pd2);
				dcount ++ ;
			}
			dint = 0;
		}
		System.out.println("新增数据"+count);
		System.out.println("删除数据"+dcount);
		json.put("result", "123");
		return json;
	}
	
	
	
	@RequestMapping(value="/test_poorder")
	@ResponseBody
	public  Map<String, Object> test_poorder_synchronization() throws Exception{
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
		System.out.println("新增数据"+count);
		System.out.println("删除数据"+dcount);
		json.put("result", "123");
		return json;
	}
	
	@RequestMapping(value="/test_poorderEntry")
	@ResponseBody
	public  Map<String, Object> test_poorderEntry_synchronization() throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
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
		//page.setShowCount(10);
		List<PageData>	synList  =synSupplierService.poorderEntry_synchronization(page);	//需要同步的数据
		//System.out.println(synList);
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
				 //System.out.println(synList.get(i).get("FStatus"));
				 pd1.put("FSTATUS",0); 		//物流状态
				 pd1.put("FUNIT", synList.get(i).get("FName"));		//单位
				 pd1.put("FORDERQTY",synList.get(i).get("FAuxqty"));		//订单数量
				 pd1.put("FNOTE",synList.get(i).get("FNote"));										//备注
				 icpoorderentryService.save(pd1);
				 count ++ ;
			}
		}
		
		System.out.println("新增数据"+count);
		System.out.println("删除数据"+dcount);
		json.put("result", "123");
		return json;
	}
	
}
