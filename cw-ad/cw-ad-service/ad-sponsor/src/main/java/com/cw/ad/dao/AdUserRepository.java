package com.cw.ad.dao;

import com.cw.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:23
 */
public interface AdUserRepository extends JpaRepository<AdUser,Long> {
    /**
     * <h2>根据用户名查找用户记录</h2>
     * */
    AdUser findByUsername(String username);
}
