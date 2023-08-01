package com.aerospike.cache.listener;

import javax.cache.event.CacheEntryEvent;
import javax.cache.event.CacheEntryListenerException;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

// @formatter:off

@Slf4j
@Component
public class CacheLogger implements CustomCacheListener<Object, Object> {

	@Override
	public void onCacheEntry(CacheEntryEvent<? extends Object, ? extends Object> cacheEvent) throws CacheEntryListenerException {
		log.info("Key: {} | EventType: {} | Old value: {} | New value: {}", cacheEvent.getKey(), cacheEvent.getEventType(), cacheEvent.getOldValue(), cacheEvent.getValue());
	}

}

// @formatter:on