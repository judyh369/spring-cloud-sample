package com.judy.sample.show.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @author judy
 * @date 2020/10/13
 */
public class CommandDemo extends HystrixCommand<String > {

    public CommandDemo(String name){
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("CommandHelloworld")));
    }

    @Override
    protected String run() throws Exception {
        return null;
    }
}
