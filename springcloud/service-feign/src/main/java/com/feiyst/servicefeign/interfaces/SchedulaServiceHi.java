package com.feiyst.servicefeign.interfaces;

import com.feiyst.servicefeign.hystrix.SchedulaServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: feiyst
 * @modified by:
 * @description: feign接口
 * @create: 2018-12-24 14:32
 **/
@FeignClient(value = "service-hi", fallback = SchedulaServiceHiHystrix.class)
public interface SchedulaServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
