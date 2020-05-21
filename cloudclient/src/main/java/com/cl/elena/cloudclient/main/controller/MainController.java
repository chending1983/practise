package com.cl.elena.cloudclient.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cl.elena.cloudclient.main.service.ConsumerService;
import com.cl.elena.cloudclient.main.service.FeignService;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/requestByRestTemplate/{num}", method = RequestMethod.GET)
    public String requestByRestTemplate(@PathVariable(name = "num") int num) {
    	System.out.println("get request from !!" + num);
        return consumerService.consumer(num);
    }

    @RequestMapping(value = "/requestByFeign/{num}", method = RequestMethod.GET)
    public String requestByFeign(@PathVariable(value = "num") int num) {
        return feignService.calculate(num);
    }

}
