package com.javasolutions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.javasolutions.components.ExitException;
import com.javasolutions.components.HelloWorldService;
import com.javasolutions.resources.SimpleMovieListener;

@SpringBootApplication
@ComponentScan("com.javasolutions")
public class SimpleSpringDemoApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@Autowired
	@Qualifier("simpleMovieListner2")
	private SimpleMovieListener simpleMovieLister;

	@Override
	public void run(String... args) {
		System.out.println(">>>> test2");
		System.out.println(this.helloWorldService.getHelloMessage());
		System.out.println(this.simpleMovieLister.getMovieFinderName());
		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new ExitException();
		}
	}


	
	public static void main(String[] args) throws Exception {
		System.out.println(">>>> test1");
		SpringApplication.run(SimpleSpringDemoApplication.class, args);
	}

}