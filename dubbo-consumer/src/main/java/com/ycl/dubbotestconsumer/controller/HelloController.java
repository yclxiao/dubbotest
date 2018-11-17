package com.ycl.dubbotestconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ycl.dubbotest.api.ProvideService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0.0")
    ProvideService provideService;

    @GetMapping("sayHello")
    public String sayHello(String name) {
        return provideService.sayHello(name);
    }
}