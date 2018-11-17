package com.ycl.dubbotest.service;

import com.alibaba.dubbo.config.annotation.Service;

import com.ycl.dubbotest.api.ProvideService;

@Service(version = "1.0.0")
public class ProvideServiceImpl implements ProvideService {
 
    public String sayHello(String name) {
        return "-------hello" + name;
    }
 
}