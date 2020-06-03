package com.liuyujiie.test;

import com.alibaba.fastjson.JSONObject;
import com.liuyujiie.pojo.IndexRspBo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: casWeb
 * @description:
 * @author: liuyishou
 * @create: 2020-01-14 20:36
 **/
public class test1 {
    public static void main(String[] args) {
        /*String yesterday_str = "";
        Date dt = new Date();
        Date yesterdayDate = new Date(dt.getTime() + 86400000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        yesterday_str = sdf.format(yesterdayDate);
        System.out.println(yesterday_str);*/
        String temp_str = "";
        String yesterday_str = "";
        Date dt = new Date();
        Date yesterdayDate = new Date(dt.getTime() - 86400000L);
        Date tomorrowDate = new Date(dt.getTime() + 86400000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        temp_str = sdf.format(tomorrowDate);
        yesterday_str = sdf.format(yesterdayDate);
        System.out.println(temp_str);
        System.out.println(yesterday_str);

        short  a = 12;
        int  b = 15;
        int c =  a + b;
        System.out.println(c);


        int num = (int) 10.5;
        System.out.println(num);





    }
}
