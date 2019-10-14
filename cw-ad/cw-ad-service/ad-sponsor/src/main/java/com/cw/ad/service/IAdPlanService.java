package com.cw.ad.service;

import com.cw.ad.entity.AdPlan;
import com.cw.ad.exception.AdException;
import com.cw.ad.vo.AdPlanGetRequest;
import com.cw.ad.vo.AdPlanRequest;
import com.cw.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/13 21:35
 */
public interface IAdPlanService {
    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * @Param request
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;

}
