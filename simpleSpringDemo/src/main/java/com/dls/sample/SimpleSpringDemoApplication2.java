package com.dls.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.dls.sample")
@Configuration
public class SimpleSpringDemoApplication2  {

	
	@Autowired
	private SimpleMovieListener simpleMovieLister;

	public static void main(String[] args) {
	    ApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleSpringDemoApplication2.class);
	    SimpleMovieListener myService = ctx.getBean(SimpleMovieListener.class);
	    System.out.println(">>>> " + myService.getMovieFinderName());
	}
	


}