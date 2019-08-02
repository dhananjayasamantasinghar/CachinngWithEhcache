package com.cache.CacheTest.service;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	private static Cache cache;
	private Map<String, CacheData> dataMap;

	public Cache() {
		dataMap = new HashMap<>();
	}

	public void putData(CacheData data) {
		dataMap.put(data.getcId(), data);
	}

	public boolean isAvaiilable(String key) {
		return dataMap.containsKey(key);
	}

	public CacheData getData(String key) {
		return dataMap.get(key);
	}
	
	public static Cache getCache(){
		
		if(cache==null){
			synchronized (Cache.class) {
				if(cache==null){
					cache= new Cache();
				}
			}
		}
		return cache;
	}
}
