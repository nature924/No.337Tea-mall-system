package com.cow.util.general;

/**
 *
 * @email QQ550080747
 * @date 2020/10/29 20:02
 * @description 自定义工具类
 */

public class MyUtils {
    public static String getCode(int length) {
        String str ="123456";
        return str.substring(str.length() - length);
    }

    private MyUtils() {
    }
}
