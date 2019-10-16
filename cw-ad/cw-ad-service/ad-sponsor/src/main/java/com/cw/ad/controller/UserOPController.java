package com.cw.ad.controller;

import com.alibaba.fastjson.JSON;
import com.cw.ad.exception.AdException;
import com.cw.ad.service.IUserService;
import com.cw.ad.vo.CreateUserRequest;
import com.cw.ad.vo.CreateUserResponse;
import com.cw.ad.vo.CreativeUnitRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谌伟
 */
@RestController
@Slf4j
public class UserOPController {
    private final IUserService userService;

    @Autowired
    public UserOPController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException{
        log.info("ad-sponsor: createUser -> {}",
                JSON.toJSONString(request));
        return userService.createUser(request);

    }
}
