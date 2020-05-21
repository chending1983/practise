package com.cl.elena.provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableZuulProxy
public class ProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class, args);
	}

}
