package com.hfzy.ihk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/12/1.
 *
 * @author wws
 */
@RefreshScope
@RestController
public class TestController {

    @RequestMapping("/stm")
    public String tets1(){
        return "this is web-customer1";
    }

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }

//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping("/consumer")
//    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("customer");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";
//        System.out.println(url);
//        return restTemplate.getForObject(url, String.class);
//    }

}
