package com.cl.elena.cloudclient.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cl.elena.cloudclient.ribbonconfig.RibbonConfig;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
@EnableZuulProxy
@RibbonClient(name = "provide-0", configuration = RibbonConfig.class)
public class CloudclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudclientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Value("${spring.application.name}")
	private String appName;
	
	@Value("${spring.application.name}")
	private String port;
	
	@GetMapping("/")
	public String index() {
		System.out.println("hello this is " + appName + ":" + port);
		return "hello this is " + appName + ":" + port;
	}

	/**
	 * Each SpringApplication registers a shutdown hook with the JVM to ensure that
	 * the ApplicationContext closes gracefully on exit. All the standard Spring
	 * lifecycle callbacks (such as the DisposableBean interface or the @PreDestroy
	 * annotation) can be used.
	 * 
	 * In addition, beans may implement the
	 * org.springframework.boot.ExitCodeGenerator interface if they wish to return a
	 * specific exit code when SpringApplication.exit() is called. This exit code
	 * can then be passed to System.exit() to return it as a status code, as shown
	 * in the following example:
	 * 
	 * 
	 * @return
	 */
	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}
}
