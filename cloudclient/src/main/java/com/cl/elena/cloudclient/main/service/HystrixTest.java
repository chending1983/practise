package com.cl.elena.cloudclient.main.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HystrixTest implements FeignService {

    @Override
    public String calculate(@RequestParam(value = "num") int num) {
        return "Sorry, we do not have a response from server!";
    }
}