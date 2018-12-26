package com.feiyst.servicelucy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@RestController
public class ServiceLucyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceLucyApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/lucy")
	@HystrixCommand(fallbackMethod = "lucyError")
	public String home(@RequestParam(value = "name") String name) {
		return "lucy " + name + " ,i am from port:" + port;
	}

	public String lucyError(String name) {
		return "lucy,"+name+",sorry,error!";
	}
}

