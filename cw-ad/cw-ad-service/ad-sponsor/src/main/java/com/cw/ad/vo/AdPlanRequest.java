package com.cw.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/13 21:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanRequest {

    private Long id;
    private Long userId;
    private String planName;
    private String startDate;
    private String endDate;

    /**创建时校验*/
    public boolean createValidate(){
        return userId!=null
                && !StringUtils.isEmpty(planName)
                && !StringUtils.isEmpty(startDate)
                && !StringUtils.isEmpty(endDate);
    }

    /**修改时校验*/
    public boolean updateValidate() {

        return id != null && userId != null;
    }

    /**删除时校验*/
    public boolean deleteValidate() {

        return id != null && userId != null;
    }
}
