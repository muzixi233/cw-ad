package com.cw.ad.index;

import lombok.Getter;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/24 21:53
 */
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
