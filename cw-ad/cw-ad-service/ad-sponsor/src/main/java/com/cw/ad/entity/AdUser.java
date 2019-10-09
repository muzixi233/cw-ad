package com.cw.ad.entity;

import com.cw.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


/**
 * @author cw
 * @version 1.0
 * @date 2019/10/8 22:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "username",nullable = false)
    private String username;

    @Basic
    @Column(name = "token",nullable = false)
    private String token;

    @Basic
    @Column(name = "user_Status",nullable = false)
    private Integer userStatus;

    @Basic
    @Column(name = "create_Time",nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "update_Time",nullable = false)
    private Date updateTime;

    public AdUser(String username,String token){
        this.username=username;
        this.token=token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }
}
