package com.cw.ad.client.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import	java.util.Date;
import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/16 21:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {
    private Long userId;
    private List<Long> ids;
}
