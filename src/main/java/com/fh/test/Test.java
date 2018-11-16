package com.fh.test;

import java.util.Calendar;

public class Test {
    @org.junit.Test
    public void time(){
        Calendar now = Calendar.getInstance();
        System.out.println("年: " + now.get(Calendar.YEAR));
        System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");
        System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));
        System.out.println("时: " + now.get(Calendar.HOUR_OF_DAY));
        String BILLNO= "SEORD2018110558";
        System.out.println(BILLNO.substring(BILLNO.length()-4,BILLNO.length()));
    }
}
