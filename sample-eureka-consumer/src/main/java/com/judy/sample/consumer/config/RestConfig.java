package com.judy.sample.consumer.config;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.niws.loadbalancer.NIWSDiscoveryPing;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author judy
 * @date 2020/10/6
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){
        return new RoundRobinRule();
    }

    @Bean
    public IPing iPing(){
//        return new PingUrl(false,"/abc");
        return new NIWSDiscoveryPing();
    }

}
