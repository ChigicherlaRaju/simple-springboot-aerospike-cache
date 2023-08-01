package com.aerospike.cache.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.cache.dto.UserInput;
import com.aerospike.cache.model.User;
import com.aerospike.cache.service.UserService;

import lombok.RequiredArgsConstructor;

// @formatter:off

@RequiredArgsConstructor
@RestController
public class UserController {

	private final UserService userService;

	@QueryMapping
	public List<User> allUsers() {
		return userService.getAllUsers();
	}

	@QueryMapping
	public Optional<User> readUserById(@Argument Integer id) {
		return userService.getUserById(id);
	}

	@MutationMapping
	public User addUser(@Argument UserInput userInput) {
		return userService.addUser(User.builder().name(userInput.getName()).email(userInput.getEmail()).age(userInput.getAge()).build());
	}

	@MutationMapping
	public boolean removeUserById(@Argument Integer id) {
		return userService.removeUserById(id);
	}

}

// @formatter:on