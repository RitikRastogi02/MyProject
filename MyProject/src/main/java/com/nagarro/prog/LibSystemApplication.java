package com.nagarro.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.nagarro.prog"})
public class LibSystemApplication {
	public static void main(String args[]) {
		SpringApplication.run(LibSystemApplication.class, args);
	}

}
