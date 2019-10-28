package com.cw.ad;
import	java.sql.Ref;

import com.alibaba.fastjson.JSON;
import com.cw.ad.annotation.IgnoreResponseAdvice;
import com.cw.ad.AdPlan;
import com.cw.ad.client.SponsorClient;
import com.cw.ad.client.vo.AdPlanGetRequest;
import com.cw.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/16 21:59
 */
@Slf4j
@RestController
public class SearchController {
    private final RestTemplate restTemplate;
    private final SponsorClient sponsorClient;
    @Autowired
    public SearchController(RestTemplate restTemplate, SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }
    @IgnoreResponseAdvice
    @PostMapping("/getAdPlans ")
    public CommonResponse<List<AdPlan>> getAdPlans(
            @RequestBody AdPlanGetRequest request){
        log.info("ad-search: getAdPlans -> {}", JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);

    }

    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("/getAdPlansByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlansByRebbon(
            @RequestBody AdPlanGetRequest request
            ){
        log.info("ad-search: getAdPlansByRibbon -> {}", JSON.toJSONString(request));
        return restTemplate.postForEntity(
                "http://eureka-client-ad-sponsor/ad-sponsor/get/asPlan",
                request,
                CommonResponse.class
        ).getBody();

    }



}
