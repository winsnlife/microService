package com.hfzy.ihk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/12/1.
 *
 * @author wws
 */
@SpringBootApplication
@EnableEurekaServer
public class RegApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegApplication.class, args);
    }
}
