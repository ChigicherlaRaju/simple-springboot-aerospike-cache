package com.aerospike.cache.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aerospike.cache.objects.User;
import com.aerospike.cache.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public Optional<User> readUserById(int id) {
		return userRepository.getUserById(id);
	}

	public User addUser(User user) {
		return userRepository.addUser(user);
	}

	public void removeUserById(int id) {
		userRepository.removeUserById(id);
	}
}
