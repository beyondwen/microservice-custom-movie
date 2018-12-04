package com.wenhao.microservice.microservicecustommovie.dao;

import com.wenhao.microservice.microservicecustommovie.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
