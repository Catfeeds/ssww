package com.fh.service.management.icpoorderentry.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.management.icpoorderentry.ICPOOrderEntryManager;

/** 
 * 说明： 采购订单明细
 * 创建人：成
 * 创建时间：2017-12-11
 * @version
 */
@Service("icpoorderentryService")
public class ICPOOrderEntryService implements ICPOOrderEntryManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("ICPOOrderEntryMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("ICPOOrderEntryMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("ICPOOrderEntryMapper.edit", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editFstatus(PageData pd)throws Exception{
		dao.update("ICPOOrderEntryMapper.editFstatus", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editFstatusByFENTRYID(PageData pd)throws Exception{
		dao.update("ICPOOrderEntryMapper.editFstatusByFENTRYID", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editDeliverNum(PageData pd)throws Exception{
		dao.update("ICPOOrderEntryMapper.editDeliverNum", pd);
	}
	
	public void editFstatusToCheck(PageData pd)throws Exception{
		dao.update("ICPOOrderEntryMapper.editFstatusToCheck", pd);
	}
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderEntryMapper.datalistPage", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<PageData> list_one(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderEntryMapper.datalistPage_one", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<PageData> listByFinterID(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderEntryMapper.listByFinterID", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<PageData> listByFinterIDForNDD(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderEntryMapper.listByFinterIDForNDD", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderEntryMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ICPOOrderEntryMapper.findById", pd);
	}
	
	/**通过FinterID获取数据
	 * @param pd
	 * @throws Exception
	 */
	
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("ICPOOrderEntryMapper.deleteAll", ArrayDATA_IDS);
	}

	@Override
	public PageData findForOneWL(PageData pd) throws Exception {
		return (PageData)dao.findForObject("ICPOOrderEntryMapper.findForOneWL", pd);
	}
	
}

