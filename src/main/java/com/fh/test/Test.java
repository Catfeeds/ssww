package com.fh.test;

import java.text.DecimalFormat;
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

    @org.junit.Test
    public void order(){
        DecimalFormat df = new DecimalFormat("0000");
        Calendar now = Calendar.getInstance();
        int intBillno ;
        String FBILLNO = null;

        FBILLNO = "SEORD"+now.get(Calendar.YEAR)+(now.get(Calendar.MONTH) + 1) + "0001";
        String FBILLNO1 = "SEORD2018110165";
        System.out.println(df.format(Integer.parseInt(FBILLNO1.substring(FBILLNO1.length()-4))+1));
        intBillno = 1 ;//Integer.parseInt(FBILLNO.substring(FBILLNO.length()-4))+1;
        System.out.println("SEORD"+now.get(Calendar.YEAR)+(now.get(Calendar.MONTH) + 1) + ""+df.format(intBillno));
    }
}
