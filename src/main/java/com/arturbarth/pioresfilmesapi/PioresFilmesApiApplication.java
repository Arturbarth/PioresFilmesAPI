package com.arturbarth.pioresfilmesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class PioresFilmesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioresFilmesApiApplication.class, args);
	}

}
