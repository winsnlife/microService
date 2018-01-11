package com.hfzy.ihk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/12/1.
 *
 * @author wws
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication2.class, args);
    }
}
