package com.aerospike.cache.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.aerospike.cache.model.User;
import com.aerospike.cache.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// @formatter:off

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public List<User> getAllUsers() {
		log.info("Reading all users details!!");
		return userRepository.findAll();
	}

	@Cacheable(value = "test", key = "#id")
	public Optional<User> getUserById(int id) {
		log.info("Reading User Details with ID: {}", id);
		return userRepository.findById(id);
	}

	@CachePut(value = "test", key = "#user.id")
	public User addUser(User user) {
		log.info("Adding User Details with Name: {}", user.getName());
		return userRepository.save(user);
	}

	@CacheEvict(value = "test", key = "#id")
	public boolean removeUserById(int id) {
		log.info("Removing User Details with ID: {}", id);
		userRepository.deleteById(id);
		return true;
	}

}
// @formatter:on