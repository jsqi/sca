package com.jxsj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现
// @EnableCircuitBreaker // 开启熔断
@EnableFeignClients
public class AutodeliverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutodeliverApplication.class,args);
    }

    @Bean
    // Ribbon 负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
