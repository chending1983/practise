/**
 * 
 */
package com.cl.elena.cloudclient.main.config;

import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;

/**
 * @author charlie
 *
 */
@Configuration
public class HystrixCustomize extends HystrixCircuitBreakerFactory {

	/**
	 * 
	 */
	public HystrixCustomize() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return
	 */
	@Bean
	public Customizer<HystrixCircuitBreakerFactory> defaultConfig() {
		return factory -> factory.configureDefault(id -> HystrixCommand.Setter
				.withGroupKey(HystrixCommandGroupKey.Factory.asKey(id)).andCommandPropertiesDefaults(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(4000)));
	}

	/**
	 * 
	 * @return
	 */
	@Bean(initMethod="")
	public Customizer<HystrixCircuitBreakerFactory> customizer() {
		return factory -> factory.configure(
				builder -> builder
						.commandProperties(HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(2000)),
				"foo", "bar");
	}

}
