package com.cw.ad.constant;

import lombok.Getter;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:14
 */
@Getter
public enum CreateType {
    IMAGE(1,"图片"),
    VIDEO(2,"视频"),
    TEXT(3,"文本");

    private int type;

    private String desc;

    CreateType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
