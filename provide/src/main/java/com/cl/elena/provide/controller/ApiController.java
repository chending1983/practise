package com.cl.elena.provide.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/testZuul")
    public String testZuul() {
        return "zuul->server " + port;
    }

    @GetMapping(value = "/calculate")
    public String calculate(@RequestParam(name = "num") int num) throws InterruptedException {
        LOG.info(port + " get access...");
        int result = fib(num);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("result", result);
        jsonObject.addProperty("port", port);
        // Thread.sleep(6000);
        return jsonObject.toString();
    }

    /**
     * 计算fib结果
     * @param n
     * @return
     */
    private int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}