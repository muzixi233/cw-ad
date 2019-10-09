package com.cw.ad.dao;

import com.cw.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:26
 */
public interface AdPlanRepository extends JpaRepository<AdPlan,Long> {

    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
