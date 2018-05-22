package com.fh.service.management.replenishentry.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.management.replenishentry.ReplenishEntryManager;

/** 
 * 说明： 物料临时表
 * 创建人：成
 * 创建时间：2018-05-22
 * @version
 */
@Service("replenishentryService")
public class ReplenishEntryService implements ReplenishEntryManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("ReplenishEntryMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("ReplenishEntryMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("ReplenishEntryMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ReplenishEntryMapper.datalistPage", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ReplenishEntryMapper.listAll", pd);
	}

	public List<PageData> list_ByOrder(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ReplenishEntryMapper.list_ByOrder", pd);
	}

	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ReplenishEntryMapper.findById", pd);
	}
	
	/**批量删除
	 * @param
	 * @throws Exception
	 */
	public void deleteAll(PageData pd)throws Exception{
		dao.delete("ReplenishEntryMapper.deleteAll", pd);
	}
	
}

