package com.feiyst.gatewayratelimiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author ur0781
 * /**
 * 测试未成功的模块,还需进行进一步学习
 */

@SpringBootApplication
@RestController
public class GatewayRatelimiterApplication {


	public static void main(String[] args) {
		SpringApplication.run( GatewayRatelimiterApplication.class, args );
	}

	@Bean
	public HostAddrKeyResolver hostAddrKeyResolver() {
		return new HostAddrKeyResolver();
	}

	@Bean
	public UriKeyResolver uriKeyResolver() {
		return new UriKeyResolver();
	}

	@Bean
	KeyResolver userKeyResolver() {
		return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
	}
}

