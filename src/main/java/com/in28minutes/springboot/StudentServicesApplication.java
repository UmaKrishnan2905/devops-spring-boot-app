package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentServicesApplication extends SpringBootServletInitializer {
	private static Class<StudentServicesApplication> applicationClass = StudentServicesApplication.class;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}
}
