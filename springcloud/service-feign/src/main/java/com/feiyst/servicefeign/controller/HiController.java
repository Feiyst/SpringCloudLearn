package com.feiyst.servicefeign.controller;

import com.feiyst.servicefeign.interfaces.SchedulaServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: feiyst
 * @modified by:
 * @description:
 * @create: 2018-12-24 14:35
 **/
@RestController
public class HiController {

    @Autowired
    private SchedulaServiceHi schedulaServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedulaServiceHi.sayHiFromClientOne(name);
    }
}
