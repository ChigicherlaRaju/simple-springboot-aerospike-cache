package com.aerospike.cache.listener;

import javax.cache.event.CacheEntryEvent;
import javax.cache.event.CacheEntryListener;
import javax.cache.event.CacheEntryListenerException;

public interface CustomCacheListener<K, V> extends CacheEntryListener<K, V> {

	void onCacheEntry(CacheEntryEvent<? extends K, ? extends V> event) throws CacheEntryListenerException;

}