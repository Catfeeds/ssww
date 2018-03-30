package com.fh.service.management.icpoorder.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.management.icpoorder.ICPOOrderManager;

/** 
 * 说明： 采购订单
 * 创建人：成
 * 创建时间：2017-12-11
 * @version
 */
@Service("icpoorderService")
public class ICPOOrderService implements ICPOOrderManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("ICPOOrderMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("ICPOOrderMapper.delete", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void deleteByFINTERID(PageData pd)throws Exception{
		dao.delete("ICPOOrderMapper.deleteByFINTERID", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("ICPOOrderMapper.edit", pd);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderMapper.datalistPage", page);
	}
	
	@SuppressWarnings("unchecked")
	public List<PageData> findByIdAndStatus(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderMapper.findByIdAndStatus", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ICPOOrderMapper.findById", pd);
	}
	
	public PageData findByFinterID(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ICPOOrderMapper.findByFinterID", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("ICPOOrderMapper.deleteAll", ArrayDATA_IDS);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PageData> listAllWithName(PageData pd) throws Exception {
		return (List<PageData>)dao.findForList("ICPOOrderMapper.listAllWithName", pd);
	}
	
}

