package com.dls.sample;

import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieFinder implements MovieFinder {

	private String defaultName = "this is a default name + version2";
	
	@Override
	public String getName() {
		return defaultName;
	}
}