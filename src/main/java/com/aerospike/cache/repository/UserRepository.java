package com.aerospike.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aerospike.cache.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}