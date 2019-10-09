package com.cw.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 22:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {
    private Long userId;
    private String username;
    private String token;
    private Date createTime;
    private Date updateTime;
}
