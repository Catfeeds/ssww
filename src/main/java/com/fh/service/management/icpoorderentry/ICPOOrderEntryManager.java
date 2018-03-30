package com.fh.service.management.icpoorderentry;

import java.util.List;
import com.fh.entity.Page;
import com.fh.util.PageData;

/** 
 * 说明： 采购订单明细接口
 * 创建人：成
 * 创建时间：2017-12-11
 * @version
 */
public interface ICPOOrderEntryManager{

	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void edit(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editFstatus(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editFstatusToCheck(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editFstatusByFENTRYID(PageData pd)throws Exception;
	
	/**修改
	 * @param pd
	 * @throws Exception
	 */
	public void editDeliverNum(PageData pd)throws Exception;
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list_one(Page page)throws Exception;
	
	/**
	 * 通过id 和订单状态查询
	 * <p>Title: findByIdAndStatus</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	
	/**列表(全部)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listAll(PageData pd)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**通过订单id，序号获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findForOneWL(PageData pd)throws Exception;
	
	
	public List<PageData> listByFinterID(Page page)throws Exception;
	
	public List<PageData> listByFinterIDForNDD(Page page)throws Exception;
	
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
	
}

