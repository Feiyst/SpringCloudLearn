package com.feiyst.servicefeign.hystrix;

import com.feiyst.servicefeign.interfaces.SchedulaServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author: feiyst
 * @modified by:
 * @description: ScheduleServiceHi断路器
 * @create: 2018-12-24 14:59
 **/
@Component
public class SchedulaServiceHiHystrix implements SchedulaServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
