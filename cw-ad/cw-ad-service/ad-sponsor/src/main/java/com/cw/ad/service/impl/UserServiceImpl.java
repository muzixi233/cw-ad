package com.cw.ad.service.impl;

import com.cw.ad.constant.Constants;
import com.cw.ad.dao.AdUserRepository;
import com.cw.ad.entity.AdUser;
import com.cw.ad.exception.AdException;
import com.cw.ad.service.IUserService;
import com.cw.ad.utils.CommonUtils;
import com.cw.ad.vo.CreateUserRequest;
import com.cw.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 23:07
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private final AdUserRepository userRepository;

    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
/**校验请求参数*/
      if (!request.validate()){
        throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
      }
        /**校验同名*/
        AdUser oldUser = userRepository.
                findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }
        /**新增*/
        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
