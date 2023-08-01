package com.aerospike.cache;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.aerospike.cache.model.User;
import com.aerospike.cache.repository.UserRepository;

// @formatter:off

@EnableCaching
@SpringBootApplication
public class SampleAerospikeApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(SampleAerospikeApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			userRepository.saveAll(List.of(
				User.builder().name("John Doe").email("john.doe@gmail.com").age(30).build(),
				User.builder().name("Josh Lang").email("josh.lang@gmail.com").age(33).build()));
		};
	}

}

// @formatter:on