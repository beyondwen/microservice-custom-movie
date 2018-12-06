package com.wenhao.microservice.microservicecustommovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class MicroserviceCustomMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCustomMovieApplication.class, args);
    }
}
