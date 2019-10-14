package com.cw.ad.service.impl;

import com.cw.ad.dao.CreativeRepository;
import com.cw.ad.entity.Creative;
import com.cw.ad.service.ICreativeService;
import com.cw.ad.vo.CreativeRequest;
import com.cw.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/14 23:05
 */
@Service
public class CreativeServiceImpl implements ICreativeService {
    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
