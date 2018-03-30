package com.fh.service.management.icpoorderpicpath.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;
import com.fh.service.management.icpoorderpicpath.ICPOOrderPicPathManager;

/** 
 * 说明： 订单验收图片
 * 创建人：成
 * 创建时间：2017-12-21
 * @version
 */
@Service("icpoorderpicpathService")
public class ICPOOrderPicPathService implements ICPOOrderPicPathManager{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception{
		dao.save("ICPOOrderPicPathMapper.save", pd);
	}
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception{
		dao.delete("ICPOOrderPicPathMapper.delete", pd);
	}
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception{
		dao.update("ICPOOrderPicPathMapper.edit", pd);
	}
	
	public void editPicStatus(PageData pd)throws Exception{
		dao.update("ICPOOrderPicPathMapper.editPicStatus", pd);
	}
	
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderPicPathMapper.datalistPage", page);
	}
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> findByNE(Page page)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderPicPathMapper.findByNE", page);
	}
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("ICPOOrderPicPathMapper.listAll", pd);
	}
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("ICPOOrderPicPathMapper.findById", pd);
	}
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("ICPOOrderPicPathMapper.deleteAll", ArrayDATA_IDS);
	}
	
}

