package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注解说明：
 * @SpringBootApplication ：声明该类是 Spring Boot 服务的⼊⼝。
 * @EnableEurekaServer ：声明该类是⼀个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中⼼。
 */


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);

    }
}
