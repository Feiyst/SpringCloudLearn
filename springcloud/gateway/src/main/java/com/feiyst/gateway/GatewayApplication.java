package com.feiyst.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author ur0781
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

//	// tag::route-locator[]
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		String httpUri = "http://httpbin.org:80";
//		return builder.routes()
//			.route(p -> p
//				.path("/get")
//				.filters(f -> f.addRequestHeader("Hello", "World"))
//				.uri(httpUri))
//			.route(p -> p
//				.host("*.hystrix.com")
//				.filters(f -> f.hystrix(config -> config
//					.setName("mycmd")
//					.setFallbackUri("forward:/fallback")))
//					.uri("http://httpbin.org:80"))
//				.build();
//	}
//
//	//tag::fallback[]
//	@RequestMapping("/fallback")
//	public Mono<String> fallback() {
//		return Mono.just("fallback");
//	}
//	// end::fallback[]
}

