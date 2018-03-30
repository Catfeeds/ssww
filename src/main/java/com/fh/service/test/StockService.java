package com.fh.service.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.dao.Test1Mapper;
import com.fh.dao2.ExpInvoiceDistributeMapper;
import com.fh.entity.ExpInvoiceDistribute;
import com.fh.entity.Test1;

@Service("stockService")
public class StockService {
	@Autowired
	Test1Mapper test1;
	@Autowired
	ExpInvoiceDistributeMapper exp;
	/*@Autowired
	Test_123Mapper test;*/
	
	/*public List<Test1> lt() {
		System.out.println("test_service----");
		//List<Test1> lTest1s  = test1.selectByExample(null);
		return lTest1s;
	}*/
	
	public void test_two() {
		List<ExpInvoiceDistribute> expInvoiceDistributes = exp.selectByExample(null);
		List<Test1> test1s = test1.selectByExample(null);
		System.out.println("k3数据表数据量："+expInvoiceDistributes.size()+"条");
		System.out.println("本地数据表："+test1s.size()+"条");
		//新增开关
		int hint = 0;
		//删除开关
		int dint = 0;
		int count = 1;
		int dcount = 1;
		Test1 test11 = new Test1();
		//新增同步数据
		for (int i = 0; i < expInvoiceDistributes.size(); i++) {
			hint = 1;
			for (int j = 0; j < test1s.size(); j++) {
				if(test1s.get(j).getId().equals(expInvoiceDistributes.get(i).getFid())){
					hint = 0;
				}
			}
			if(hint == 1) {
			test11.setId(expInvoiceDistributes.get(i).getFid());
			test11.setName(expInvoiceDistributes.get(i).getFbillnoSrc());
			test11.setAge(expInvoiceDistributes.get(i).getFyear());
			test1.insertSelective(test11);
			System.out.println("插入第"+count+"条数据------id为"+expInvoiceDistributes.get(i).getFid());
			count ++ ;
			}
		}
		//如原数据库有数据被删除，同步时一同把本地数据库的数据删除
		for (int x = 0; x < test1s.size(); x++) {
			dint = 1;
			for (int y = 0; y < expInvoiceDistributes.size(); y++) {
				if(test1s.get(x).getId().equals(expInvoiceDistributes.get(y).getFid())){
					//返回TRUE，即存在，无需删除本地数据表数据
					dint = 0;
				}
			}
			if(dint == 1) {
				test1.deleteByPrimaryKey(test1s.get(x).getId());
				System.out.println("同步删除第"+dcount+"条数据------id为"+test1s.get(x).getId());
				dcount ++ ;
				}
		}
		
	}
	
}
