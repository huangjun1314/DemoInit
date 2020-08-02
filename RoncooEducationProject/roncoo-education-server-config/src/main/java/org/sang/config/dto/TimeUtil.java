package org.sang.config.dto;

import java.util.Calendar;
import java.util.Random;

public class TimeUtil {
    /**
     * 获取当前时间的时间戳
     * @return
     * */
    public static String getTimeInMillis() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return timeInMillis+"";
    }
    /**
     * 获取位数为7位的随机数
     * @return
     * */
    public static String getRandom() {
        Random random = new Random();
        int nextInt = random.nextInt(90000);
        nextInt=nextInt+100000;
        String str=nextInt+"";
        return str;
    }

    /**
     * 获得19位的主键值，主键值的格式是13位的当前时间戳加7位的随机数
     * @return
     **/
    public static String getMillPrimaryKey() {
        return getTimeInMillis()+getRandom();
    }
}
