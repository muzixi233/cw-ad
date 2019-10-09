package com.cw.ad.constant;

import lombok.Getter;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:17
 */
@Getter
public enum  CreativeMetrialType {
    JPG(1,"jpg"),
    BMP(2,"bmp"),

    MP4(3,"mp4"),
    AVI(4,"avi"),

    TXT(5,"txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
