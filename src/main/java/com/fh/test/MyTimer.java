package com.fh.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;

import org.junit.Test;

import sun.tools.tree.ThisExpression;

public class MyTimer extends TimerTask{

	private ServletContext context = null;    

    public MyTimer() {  
        super();  
    }  

    public MyTimer(ServletContext context) {    
        this.context = context;    
    }  

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("开始执行指定任务");   
        System.out.println("结束执行指定任务");   
    }

}
