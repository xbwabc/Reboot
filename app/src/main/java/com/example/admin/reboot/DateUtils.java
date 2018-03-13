package com.example.admin.reboot;

/**
 * Created by admin on 2018/3/9.
 */

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author:Created by HL.
 * 时间格式化工具类
 */

public class DateUtils {

    @SuppressLint("SimpleDateFormat")
    public static String dateToString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        return df.format(date);
    }
}
