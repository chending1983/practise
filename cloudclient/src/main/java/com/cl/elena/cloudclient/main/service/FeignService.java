package com.cl.elena.cloudclient.main.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${provider.name}", fallback = HystrixTest.class)
public interface FeignService {

    /**
     * 计算接口
     * @param num
     * @return
     */
    @RequestMapping(value = "/api/calculate")
    String calculate(@RequestParam(value = "num") int num);

}