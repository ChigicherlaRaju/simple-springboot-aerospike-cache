package com.aerospike.cache.dto;

import java.io.Serializable;

import org.springframework.data.aerospike.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInput implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private int age;

}