package com.aerospike.cache.repositories;

import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.aerospike.cache.objects.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class UserRepository {

	@Cacheable(value = "test", key = "#id")
	public Optional<User> getUserById(int id) {
		log.info("Simulating a read from the main data store.");
		/*
		 * In case the id doesn't exist in the cache it will "fetch" JIMMY page with the
		 * requested id and add it to the cache (cache miss).
		 */
		return Optional.of(new User(id, "jimmy page", "jimmy@gmail.com", 77));
	}

	@CachePut(value = "test", key = "#user.id")
	public User addUser(User user) {
		log.info("Simulating addition of " + user + " to the main data store.");
		return user;
	}

	@CacheEvict(value = "test", key = "#id")
	public void removeUserById(int id) {
		log.info("Simulating removal of " + id + " from the main data store.");
	}

}