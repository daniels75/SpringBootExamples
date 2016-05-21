package com.javasolutions.resources;

import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieFinder implements MovieFinder {

	private String defaultName = "this is a default name - version1 ";
	
	@Override
	public String getName() {
		return defaultName;
	}
}