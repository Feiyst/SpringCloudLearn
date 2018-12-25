package com.feiyst.serviceribbon.controller;

import com.feiyst.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: feiyst
 * @modified by:
 * @description:
 * @create: 2018-12-24 15:41
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(String name) {
        return helloService.hiService(name);
    }
}
