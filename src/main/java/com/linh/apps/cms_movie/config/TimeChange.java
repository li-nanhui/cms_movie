package com.linh.apps.cms_movie.config;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/19 14:38
 * @description：时间格式转换类
 * @modified By：
 * @version:
 */
public class TimeChange {
    public String timeStampToDate(long timeStamp){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        return  sd;
    }
}
