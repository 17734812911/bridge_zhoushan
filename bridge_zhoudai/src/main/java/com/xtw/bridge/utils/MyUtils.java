package com.xtw.bridge.utils;

import java.util.*;

/**
 * User: Mr.Chen
 * Date: 2021/8/4
 * Description: 数据处理的工具类
 */
public class MyUtils {

    // 将字符串数组转换成double数组
    public static double[] toDoubleArray(String[] strArr) {
        // 定义一个int数组
        double[] arr=new double[strArr.length];
        // 对字符串数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            // 将数组格式的字符串转成双精度数，存储到arr数组中
            arr[i]=Double.parseDouble(strArr[i]);
        }
        return arr;
    }

    // 数组排序
    public static void arraySort(double[] doubleArr){
        Arrays.sort(doubleArr);
    }

    // 合并数组
    public static ArrayList<String> mergeArray(List<String> firstArr, List<String> secondArr){
        ArrayList<String> mergeArr = new ArrayList<>();
        mergeArr.addAll(firstArr);
        mergeArr.addAll(secondArr);
        return mergeArr;
    }

    // 将字符串转换为数组，并返回指定下标的数据
    public static String getPointValue(String str, int point){
        String[] strArr = str.split(",");
        return strArr[point];
    }

    // 获取当前日期时间
    public static String getDateTime(Integer addDasNumber){   // addNumber为要加上的天数
        Calendar calendar=Calendar.getInstance();
        String year = String.valueOf(calendar.get(GregorianCalendar.YEAR));
        String month = format((calendar.get(GregorianCalendar.MONTH)+1));   // 约束要加1,因为生成的约束会比当前少一个月
        String day = format((calendar.get(GregorianCalendar.DAY_OF_MONTH) + addDasNumber));     // 通过addDasNumber参数，决定获取哪一天
        String hour = format(calendar.get(GregorianCalendar.HOUR));
        String min = format(calendar.get(GregorianCalendar.MINUTE));
        String second = format(calendar.get(GregorianCalendar.SECOND));

        return year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + second;

    }
    // 格式化时间
    private static String format(Integer num){
        if(num < 10){
            return "0" + num;
        }
        return String.valueOf(num);
    }
}
