package com.dauphine.blogger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(
				title = "Blogger box backend",
				description = "Blogger box endpoints and api",
				contact = @Contact(name = "Nicolas", email = "nicolas.longhi@gmail.com"),
				version = "1.0.0"
		)
)
public class BloggerBoxBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggerBoxBackendApplication.class, args);
	}

}
