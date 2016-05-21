package com.javasolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringDemoApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {
		System.out.println(">>>> test2");
		System.out.println(this.helloWorldService.getHelloMessage());
		if (args.length > 0 && args[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println(">>>> test1");
		SpringApplication.run(SimpleSpringDemoApplication.class, args);
	}

}