package com.fh.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.junit.Test;

import com.fh.controller.test.TimeController;

public class ContextListener implements ServletContextListener{
	
	public ContextListener() {  
    }  

    private java.util.Timer timertime = null;    


    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        timertime.cancel();  
        //arg0.getServletContext().log("销毁"); 
        System.out.println("销毁");
    }

    public void contextInitialized(ServletContextEvent arg0) {
    	System.out.println("定时器加载成功!!!");
    	 
        // TODO Auto-generated method stub
         /**  
         * 设置一个定时器  
         */    
    	// run in a second  
        final long timeInterval = 5000;  
        Runnable runnable = new Runnable() {  
            public void run() {  
            	TimeController tc = new TimeController();
                System.out.println("tc:"+tc);
                while (true) {  
                    // ------- code for task to run  
                    System.out.println("Hello !!");
                   
                    try {
						tc.testname();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    try {  
                        Thread.sleep(timeInterval);  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
        };  
        Thread thread = new Thread(runnable);  
        thread.start(); 
       /* timertime = new java.util.Timer(true);    

        //arg0.getServletContext().log("定时器已启动");   
        System.out.println("定时器已启动");
        //设置执行时间  
        Calendar calendar =Calendar.getInstance();  
        int year = calendar.get(Calendar.YEAR);  
        int month = calendar.get(Calendar.MONTH);  
        int day =calendar.get(Calendar.DAY_OF_MONTH);//每天  
        //定制每天的12:30:00执行，  
        calendar.set(year, month, day, 12, 30, 00);  
        Date date = calendar.getTime();
        int period = 2000;  
        //每天的date时刻执行task，每隔persion 时间重复执行  
        timertime.schedule(new MyTimer(arg0.getServletContext()),date,period);  */
//      在 指定的date时刻执行task, 仅执行一次  
//      timer.schedule(new DelFileTask(arg0.getServletContext()), date);
        //arg0.getServletContext().log("已经添加任务调度表"); 
        System.out.println("已经添加任务调度表");
    }
}
