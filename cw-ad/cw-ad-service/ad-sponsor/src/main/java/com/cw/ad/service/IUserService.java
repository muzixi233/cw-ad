package com.cw.ad.service;

import com.cw.ad.exception.AdException;
import com.cw.ad.vo.CreateUserRequest;
import com.cw.ad.vo.CreateUserResponse;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 22:07
 */
public interface IUserService {
    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
