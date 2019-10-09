package com.cw.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 木子希
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulGatewayApplication {
public static void main(String[] args){
    SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
