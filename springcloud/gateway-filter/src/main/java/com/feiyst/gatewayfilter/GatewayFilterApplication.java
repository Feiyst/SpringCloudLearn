package com.feiyst.gatewayfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayFilterApplication.class, args);
	}

	/**
	 * Request_time_filter
	 * @param builder
	 * @return
	 */
//	@Bean
//	public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/customer/**")
//						.filters(f -> f.filter(new RequestTimeFilter())
//								.addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
//						.uri("http://httpbin.org:80/get")
//						.order(0)
//						.id("customer_filter_router")
//				).build();
//	}

	/**
	 * 声明“网关过滤-请求时间工厂类”为Bean
	 * @return
	 */
	@Bean
	public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
		return new RequestTimeGatewayFilterFactory();
	}
}

