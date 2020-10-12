package com.judy.sample.consumer.controller;

import com.judy.sample.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author judy
 * @date 2020/10/6
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

//    @Resource
//    private ProviderApi providerApi;
//
//    @RequestMapping(value = "/sayhello/feign")
//    public String sayHelloFeign(String message){
//        System.out.println("feign message="+message);
//        return providerApi.invokerProviderController(message);
//    }

    @RequestMapping(value = "/sayhello")
    public String sayHello(String message){

        return consumerService.sayHello(message);
    }

}
