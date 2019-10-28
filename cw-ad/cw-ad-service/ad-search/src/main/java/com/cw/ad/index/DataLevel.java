package com.cw.ad.index;

import lombok.Getter;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/24 21:52
 */
@Getter
public enum DataLevel {

    LEVEL2("2", "level 2"),
    LEVEL3("3", "level 3"),
    LEVEL4("4", "level 4");

    private String level;
    private String desc;

    DataLevel(String level, String desc) {
        this.level = level;
        this.desc = desc;
    }
}
