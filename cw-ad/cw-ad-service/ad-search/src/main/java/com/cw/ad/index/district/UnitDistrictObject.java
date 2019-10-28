package com.cw.ad.index.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/23 22:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitDistrictObject {
    private Long unitId;
    private String province;
    private String city;

}
