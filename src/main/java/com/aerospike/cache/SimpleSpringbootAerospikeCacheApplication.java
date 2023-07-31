package com.aerospike.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SimpleSpringbootAerospikeCacheApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAerospikeCacheApplication.class, args);
	}
	
}