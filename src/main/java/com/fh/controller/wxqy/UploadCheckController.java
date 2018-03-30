package com.fh.controller.wxqy;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.commodity.commoditypic.CommodityPicManager;
import com.fh.service.management.icpoorderentry.impl.ICPOOrderEntryService;
import com.fh.service.management.icpoorderpicpath.ICPOOrderPicPathManager;
import com.fh.util.PageData;
import com.fh.util.UuidUtil;
import com.fh.wx.info.WeixinInfo;

@SuppressWarnings("serial")
@Controller
@RequestMapping(value="/checkUp")
public class UploadCheckController extends HttpServlet{
	
	/*@Resource(name="commoditypicService")
	private CommodityPicManager commoditypicService;
	*/
	@Resource(name="icpoorderentryService")
	private ICPOOrderEntryService icpoorderentryService;
	
	@Resource(name="icpoorderpicpathService")
	private ICPOOrderPicPathManager icpoorderpicpathService;
	
	@RequestMapping("/upload")
    @ResponseBody
    public Map<String, Object> updatePhoto(HttpServletRequest request,HttpServletResponse response,@RequestParam("myFile") MultipartFile myFile,
    		@RequestParam("FENTRYID") String FENTRYID,@RequestParam("FINTERID") String FINTERID)throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		System.out.println("FINTERID:"+FINTERID);
		System.out.println("FENTRYID:"+FENTRYID);
		PageData pd = new PageData();
		pd.put("FINTERID", FINTERID);
		pd.put("FENTRYID", FENTRYID);
		PageData pd_one = icpoorderentryService.findForOneWL(pd);
        try {
            //输出文件后缀名称
            System.out.println(myFile.getOriginalFilename());
            DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            //图片名称
            String name = df.format(new Date());

            Random r = new Random();
            for(int i = 0 ;i<3 ;i++){
                name += r.nextInt(10);
            }
            //
            String ext = FilenameUtils.getExtension(myFile.getOriginalFilename());
            //保存图片       File位置 （全路径）   /upload/fileName.jpg
            String url = request.getSession().getServletContext().getRealPath("/static/images/upload/check/");
            //相对路径
            String path = "/"+name + "." + ext;
            System.out.println(url+"++++++++++----------------"+path);
            PageData pd_pic = new PageData();
            pd_pic.put("FINTERID", FINTERID);
            pd_pic.put("FENTRYID", FENTRYID);
            pd_pic.put("ICPOORDERPICPATH_ID", UuidUtil.get32UUID());	//主键
            pd_pic.put("FPICPATH", "/static/images/upload/check"+path);
            icpoorderpicpathService.save(pd_pic);
            File file = new File(url);
            if(!file.exists()){
                file.mkdirs();
            }
            myFile.transferTo(new File(url+path));
            //json.put("success", "/static/images/upload/check"+path);
            Page page = new Page();
            page.setPd(pd);
            List<PageData> listPic = icpoorderpicpathService.findByNE(page);
            json.put("success", "成功");
           /* mv.addObject("listPic", listPic);
            mv.addObject("httpUrl", WeixinInfo.httpUrl);
            mv.setViewName("wxqy/platformQY/check");
            mv.addObject("pd_one", pd_one);
            mv.addObject("FINTERID",pd.getString("FINTERID"));*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json ;
	}
}
