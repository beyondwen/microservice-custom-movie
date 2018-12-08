package com.wenhao.microservice.microservicecustommovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCustomMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCustomMovieApplication.class, args);
    }
}
