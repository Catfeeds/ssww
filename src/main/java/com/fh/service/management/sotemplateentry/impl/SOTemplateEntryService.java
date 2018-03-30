package com.fh.service.management.sotemplateentry.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.management.sotemplateentry.SOTemplateEntryManager;

/** 
 * 说明： 销售订单模板明细
 * 创建人：成
 * 创建时间：2018-01-05
 * @version
 */
@Service("sotemplateentryService")
public class SOTemplateEntryService implements SOTemplateEntryManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("SOTemplateEntryMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("SOTemplateEntryMapper.delete", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete2(PageData pd)throws Exception{
		dao.delete("SOTemplateEntryMapper.delete2", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void deleteByFTempID(PageData pd)throws Exception{
		dao.delete("SOTemplateEntryMapper.deleteByFTempID", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("SOTemplateEntryMapper.edit", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit_qty(PageData pd)throws Exception{
		dao.update("SOTemplateEntryMapper.edit_qty", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("SOTemplateEntryMapper.datalistPage", page);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list_one(Page page)throws Exception{
		return (List<PageData>)dao.findForList("SOTemplateEntryMapper.list_one", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("SOTemplateEntryMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("SOTemplateEntryMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("SOTemplateEntryMapper.deleteAll", ArrayDATA_IDS);
	}
	
}
