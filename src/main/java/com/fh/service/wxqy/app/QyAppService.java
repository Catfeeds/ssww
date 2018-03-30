package com.fh.service.wxqy.app;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.dao.TB_WXQYAPPMapper;
import com.fh.entity.TB_WXQYAPP;
import com.fh.entity.TB_WXQYAPPExample;

@Service("qyappService")
public class QyAppService {
	@Autowired
	TB_WXQYAPPMapper tb_WxQyAppMapper;
	
	public TB_WXQYAPP getApp(String appName) {
		TB_WXQYAPPExample tb_WxQyAppExample = new TB_WXQYAPPExample();
		TB_WXQYAPPExample.Criteria createCriteria = tb_WxQyAppExample.createCriteria();
		createCriteria.andAppnameEqualTo(appName);
		List<TB_WXQYAPP> tb_WxQyApps = tb_WxQyAppMapper.selectByExample(tb_WxQyAppExample);
		TB_WXQYAPP tb_WxQyApp = null;
		for (int i = 0; i < tb_WxQyApps.size(); i++) {
			tb_WxQyApp = tb_WxQyApps.get(0);
		}
		return tb_WxQyApp;
	}
}
