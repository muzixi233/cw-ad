package com.cw.ad.service;

import com.cw.ad.vo.CreativeRequest;
import com.cw.ad.vo.CreativeResponse;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/14 22:53
 */
public interface ICreativeService {
    CreativeResponse createCreative(CreativeRequest request);
}
