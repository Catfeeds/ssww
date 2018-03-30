package com.fh.service.wxqy.weixindepartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.dao.TB_weixindepartmentMapper;
import com.fh.entity.TB_weixindepartment;
import com.fh.qy.pojo.Department;
import com.fh.qy.qyutil.WeiXinParamesUtil;
import com.fh.qy.qyutil.WeiXinUtil;
import com.fh.qy.service.Contacts_DepartmentService;


@Service("weixindepService")
public class WeixindepartmentService {
	@Autowired
	TB_weixindepartmentMapper tb_weixindepartmentMapper;
	
	//保存部门信息到数据库
	public void saveDep(String dateStr,int id,String dname,int parentid,int dorder) {
		TB_weixindepartment tb_weixindepartment = new TB_weixindepartment();
		tb_weixindepartment.setWeixindepartmentId(dateStr);
		tb_weixindepartment.setId(id);
		tb_weixindepartment.setDname(dname);
		tb_weixindepartment.setParentid(parentid);
		tb_weixindepartment.setDorder(dorder);
		tb_weixindepartmentMapper.insertSelective(tb_weixindepartment);
	}
	
	//删除部门信息表信息(全部删除)
	public void deleteDepAll() {
		tb_weixindepartmentMapper.deleteByExample(null);
	}
	
	public void updateDepartment(int id,String name,int parentid) {
		//1.创建Department对象，并将对象转换成json字符串  
		Department department = new Department(id, name, parentid);  

		//2.获取access_token:根据企业id和通讯录密钥获取access_token,并拼接请求url
		String accessToken= WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.contactsSecret).getToken();
		System.out.println("accessToken:"+accessToken);

		//3.更新部门
		Contacts_DepartmentService cds= new Contacts_DepartmentService();
		cds.updateDepartment(accessToken, department);
		
	}
}
