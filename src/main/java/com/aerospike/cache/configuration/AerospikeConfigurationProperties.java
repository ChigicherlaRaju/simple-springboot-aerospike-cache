package com.aerospike.cache.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "aerospike")
public class AerospikeConfigurationProperties {
	
	private String host;	
	private int port;	
	private String schema;	
	private int schemaTtl;	
	private int ttl;

}