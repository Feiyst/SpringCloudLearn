package com.feiyst.gatewayfilter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: feiyst
 * @modified by:
 * @description: 自定义请求时间过滤器
 * @create: 2018-12-26 15:55
 **/
//public class RequestTimeFilter implements GatewayFilter, Ordered{

//    private static final Log log = LogFactory.getLog(GatewayFilter.class);
//    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";
//
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
//        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
//            Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
//            if (startTime != null) {
//                log.info(exchange.getRequest().getURI().getRawPath() + ""
//                        + (System.currentTimeMillis() - startTime) + "ms");
//            }
//        }));
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }

//    private static final Log log = LogFactory.getLog(GatewayFilter.class);
//    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
//        return chain.filter(exchange).then(
//                Mono.fromRunnable(() -> {
//                    Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
//                    if (startTime != null) {
//                        log.info(exchange.getRequest().getURI().getRawPath() + ": " + (System.currentTimeMillis() - startTime) + "ms");
//                    }
//                })
//        );
//
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
