package com.judy.sample.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author judy
 * @date 2020/10/6
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String sayHello(String message) {
        String uri = "/provider/sayhello?message="+message;
        String url = "http://hello-service-provider"+uri;

        // invoker provider test
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }
}
