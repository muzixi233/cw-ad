package com.cw.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cw
 * @version 1.0
 * @date 2019/10/8 22:16
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
public class SponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class,args);
    }
}
