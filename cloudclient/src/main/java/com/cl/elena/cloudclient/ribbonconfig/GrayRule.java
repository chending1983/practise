package com.cl.elena.cloudclient.ribbonconfig;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.discovery.EurekaClient;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
@Configuration
public class GrayRule extends AbstractLoadBalancerRule {

	@Autowired
	private EurekaClient eurekaClient;

	public GrayRule() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Randomly choose from all living servers
	 */
	public Server choose(ILoadBalancer lb, Object key) {
		System.out.println("fuck 这就是实力！！！");
		System.out.println(eurekaClient.getApplications().getInstancesBySecureVirtualHostName("provide-0"));
		Server server = null;
		while (server == null) {
			if (Thread.interrupted()) {
				return null;
			}
			List<Server> upList = lb.getReachableServers();
			List<Server> allList = lb.getAllServers();
			lb.getAllServers().get(0).getMetaInfo().getInstanceId();
			int serverCount = allList.size();
			if (serverCount == 0) {
				/*
				 * No servers. End regardless of pass, because subsequent passes only get more
				 * restrictive.
				 */
				return null;
			}

			int index = chooseRandomInt(serverCount);
			server = upList.get(index);

			if (server == null) {
				/*
				 * The only time this should happen is if the server list were somehow trimmed.
				 * This is a transient condition. Retry after yielding.
				 */
				Thread.yield();
				continue;
			}

			if (server.isAlive()) {
				return (server);
			}

			// Shouldn't actually happen.. but must be transient or a bug.
			server = null;
			Thread.yield();
		}

		return server;

	}

	protected int chooseRandomInt(int serverCount) {
		return ThreadLocalRandom.current().nextInt(serverCount);
	}

	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub

	}

}
