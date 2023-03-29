package com.scaler.blogger;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggerApplication.class, args);
	}

	//Creating Bean for Model mapper
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
