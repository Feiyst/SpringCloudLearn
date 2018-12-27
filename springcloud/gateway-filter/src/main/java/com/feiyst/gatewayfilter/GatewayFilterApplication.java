package com.feiyst.gatewayfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ur0781
 * 测试未成功的模块,还需进行进一步学习
 */
@SpringBootApplication
@RestController
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
//	@Bean
//	public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
//		return new RequestTimeGatewayFilterFactory();
//	}

	/**
	 * 声明"网关过滤-全局token过滤器"为bean
	 * @return
	 */
	@Bean
	public TokenFilter tokenFilter(){
		return new TokenFilter();
	}

	@RequestMapping(value = "/feiyst")
	public String feiyst() {
		return "Hello Feiyst";
	}
}

