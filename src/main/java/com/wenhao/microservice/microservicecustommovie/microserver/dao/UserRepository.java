package com.wenhao.microservice.microservicecustommovie.microserver.dao;

import com.wenhao.microservice.microservicecustommovie.microserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
