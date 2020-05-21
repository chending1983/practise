package com.cl.elena.cloudclient.ribbonconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;

@Configuration(proxyBeanMethods = false)
public class RibbonConfig{
	
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new GrayRule();
    } 
}
  
