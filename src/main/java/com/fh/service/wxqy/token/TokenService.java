package com.fh.service.wxqy.token;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.dao.TB_WXQYAPPMapper;
import com.fh.dao.TB_access_tokenMapper;
import com.fh.dao.Test1Mapper;
import com.fh.dao2.ExpInvoiceDistributeMapper;
import com.fh.entity.ExpInvoiceDistribute;
import com.fh.entity.TB_WXQYAPP;
import com.fh.entity.TB_WXQYAPPExample;
import com.fh.entity.TB_access_token;
import com.fh.entity.TB_access_tokenExample;
import com.fh.entity.Test1;
import com.fh.qy.qyutil.WeiXinParamesUtil;
import com.fh.qy.qyutil.WeiXinUtil;

@Service("tokenService")
public class TokenService {
	@Autowired
	TB_access_tokenMapper tb_access_tokenMapper;
	@Autowired
	TB_WXQYAPPMapper tb_WxQyAppMapper;
	
	public void saveToken(String appName) {
		TB_WXQYAPPExample tb_WxQyAppExample = new TB_WXQYAPPExample();
		TB_WXQYAPPExample.Criteria  createCriteria = tb_WxQyAppExample.createCriteria();
		createCriteria.andAppnameEqualTo(appName);
		List<TB_WXQYAPP> tb_WxQyApps = tb_WxQyAppMapper.selectByExample(tb_WxQyAppExample);
		//TB_WxQyApp tb_WxQyApp = new TB_WxQyApp();
		String agentSecret = null ;
		for (int i = 0; i < tb_WxQyApps.size(); i++) {
			agentSecret = tb_WxQyApps.get(0).getAppsecret();
		}
		//获取access_token:根据企业id和通讯录密钥获取access_token,并拼接请求url
		String accessToken= WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, agentSecret).getToken();
		System.out.println("accessToken:"+accessToken);
		Date timeDate = new Date();
		TB_access_token tb_access_token = new TB_access_token();
		tb_access_token.setAccessToken(accessToken);
		tb_access_token.setCreatetime(timeDate);
		tb_access_token.setAppname(appName);
		tb_access_tokenMapper.insert(tb_access_token);
	}
	
	//根据appname返回一个token对象
	public TB_access_token getTokenByDB(String appName) {
		TB_access_tokenExample tb_access_tokenExample = new TB_access_tokenExample();
		TB_access_tokenExample.Criteria createCriteria = tb_access_tokenExample.createCriteria();
		createCriteria.andAppnameEqualTo(appName);
		List<TB_access_token> tb_access_tokens = tb_access_tokenMapper.selectByExample(tb_access_tokenExample);
		TB_access_token tb_access_token = null;
		for (int i = 0; i < tb_access_tokens.size(); i++) {
			tb_access_token = tb_access_tokens.get(0);
		}
		return tb_access_token;
	}
	
	//保存token之前，先delete一个app的旧token
	public void deleteOldTokenByDB(String appName) {
		TB_access_tokenExample tb_access_tokenExample = new TB_access_tokenExample();
		TB_access_tokenExample.Criteria createCriteria = tb_access_tokenExample.createCriteria();
		createCriteria.andAppnameEqualTo(appName);
		tb_access_tokenMapper.deleteByExample(tb_access_tokenExample);
	}
}
