package com.hfzy.ihk.face;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/12/2.
 *
 * @author wws
 */
@FeignClient("customer")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}