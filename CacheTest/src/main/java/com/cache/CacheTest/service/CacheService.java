package com.cache.CacheTest.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

	@Cacheable(value = "GAS_AUDIT")
	public void getName(String name) {
		System.out.println("Call Gas Audit");
	}

}
