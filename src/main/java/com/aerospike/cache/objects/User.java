package com.aerospike.cache.objects;

import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private int age;
}
