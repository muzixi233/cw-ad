package com.cw.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 23:20
 */
public class CommonUtils {
    public static String md5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
