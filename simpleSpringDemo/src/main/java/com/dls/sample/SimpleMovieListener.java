package com.dls.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleMovieListener {

    private MovieFinder movieFinder;

    @Autowired
    public SimpleMovieListener(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    
    public String getMovieFinderName() {
    	return movieFinder.getName();
    }

}