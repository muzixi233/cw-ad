package com.cw.ad.dao;

import com.cw.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:26
 */
public interface AdUnitRepository extends JpaRepository<AdUnit,Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

}
