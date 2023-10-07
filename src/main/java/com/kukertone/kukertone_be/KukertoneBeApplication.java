package com.kukertone.kukertone_be;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@OpenAPIDefinition(servers = {@Server(url = "https://yeongjin.site")})
@SpringBootApplication
public class KukertoneBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KukertoneBeApplication.class, args);
	}

}
