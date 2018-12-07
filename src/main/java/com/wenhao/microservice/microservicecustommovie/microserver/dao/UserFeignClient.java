package com.wenhao.microservice.microservicecustommovie.microserver.dao;

import com.wenhao.microservice.microservicecustommovie.config.FeignConfiguration;
import com.wenhao.microservice.microservicecustommovie.microserver.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
