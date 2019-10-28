package com.cw.ad;

import com.alibaba.fastjson.JSON;
import com.cw.ad.exception.AdException;
import com.cw.ad.service.IAdUnitService;
import com.cw.ad.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/15 22:11
 */
@Slf4j
@RestController
public class AdUnitOPController {
    private final IAdUnitService adUnitService;

    @Autowired
    public AdUnitOPController(IAdUnitService adUnitService) {
        this.adUnitService = adUnitService;
    }

    @PostMapping("/create/adUnit")
    public AdUnitResponse createUnit(
            @RequestBody AdUnitRequest request) throws AdException {
        log.info("ad-sponsor: createUnit -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnit(request);
    }
    /**创建关键词限制*/
    @PostMapping("/create/unitKeyword")
    public AdUnitKeywordResponse createUnitKeyword(
            @RequestBody AdUnitKeywordRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitKeyword -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitKeyword(request);
    }
    /**创建兴趣限制*/
    @PostMapping("/create/unitIt")
    public AdUnitItResponse createUnitIt(
            @RequestBody AdUnitItRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitIt -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitIt(request);
    }
    /**创建地域限制*/
    @PostMapping("/create/unitDistrict")
    public AdUnitDistrictResponse createUnitDistrict(
            @RequestBody AdUnitDistrictRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitDistrict -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitDistrict(request);
    }
    /**创建创意关联*/
    @PostMapping("/create/creativeUnit")
    public CreativeUnitResponse createCreativeUnit(
            @RequestBody CreativeUnitRequest request
    ) throws AdException {
        log.info("ad-sponsor: createCreativeUnit -> {}",
                JSON.toJSONString(request));
        return adUnitService.createCreativeUnit(request);
    }
}
