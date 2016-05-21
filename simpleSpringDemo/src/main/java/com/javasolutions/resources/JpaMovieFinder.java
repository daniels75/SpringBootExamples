package com.javasolutions.resources;

import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieFinder implements MovieFinder {

	private String defaultName = "this is a default name";
	
	@Override
	public String getName() {
		return defaultName;
	}
}