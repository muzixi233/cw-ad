package com.cw.ad.dao;


import com.cw.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/9 21:26
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
