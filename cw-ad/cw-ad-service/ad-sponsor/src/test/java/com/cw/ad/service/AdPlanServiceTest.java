package com.cw.ad.service;


import com.cw.ad.Application;
import com.cw.ad.exception.AdException;
import com.cw.ad.vo.AdPlanGetRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/24 22:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AdPlanServiceTest {

    @Autowired
    private IAdPlanService planService;

    @Test
    public void testGetAdPlan() throws AdException {

        System.out.println(
                planService.getAdPlanByIds(
                        new AdPlanGetRequest(15L, Collections.singletonList(10L))
                )
        );
    }
}
