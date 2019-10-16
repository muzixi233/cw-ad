package com.cw.ad.client;

import com.cw.ad.AdPlan;
import com.cw.ad.client.vo.AdPlanGetRequest;
import com.cw.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/16 22:26
 */
@Component
public class SponsorClientHystrix implements SponsorClient{
    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {

        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
